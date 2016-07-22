package com.abcfund.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.abcfund.model.dto.ABCMemberDto;
import com.abcfund.model.dto.ABCMyLoanInfoDto;
import com.abcfund.model.service.ABCMemberService;
import com.abcfund.util.SMTPAuthenticator;

/**
 * @author 9age
 *
 */
@Controller
public class ABCMemberController {
	@Autowired
	ABCMemberService service;
	
	/** �⺻ ���� */
	public static String MAIN_TITLE = "ABC Funding";
	
	/**
	 * ���� ������ �̵� �޼���
	 * ���� ������ �ϰ� �ٷ� ������������ �̵�
	 * @param model
	 * @return ���� �������� Ÿ�����
	 * @throws Exception
	 */
	@RequestMapping(value = "main.do", method = RequestMethod.GET)
	public String main(Model model) throws Exception {
		// ���� ����
		model.addAttribute("title", MAIN_TITLE);
		
		return "main.tiles";
	}
	
	/**
	 * ȸ������ ������ �̵� �޼���
	 * ���� ������ �ϰ� ȸ������ �������� �̵�.
	 * @param model
	 * @return ȸ������ �������� Ÿ�����
	 * @throws Exception
	 */
	@RequestMapping(value = "regi.do", method = RequestMethod.GET)
	public String regi(Model model) throws Exception {
		// �⺻���� �ش� ��ɸ��� ���δ�.
		model.addAttribute("title", "ȸ������ :: " + MAIN_TITLE);
		
		return "regi.tiles";
	}
	
	/**
	 * ȸ����� ��û�޴� �޼���
	 * @param model ���� ������ ���� ��
	 * @param dto ���������� �� DTO ��ü
	 * @return ȸ������ ���� �������� Ÿ�����
	 * @throws Exception
	 */
	@RequestMapping(value = "addMember.do", method = RequestMethod.POST)
	public String addMember(Model model, ABCMemberDto dto) throws Exception {
		// �⺻���� �ش� ��ɸ��� ���δ�.
		model.addAttribute("title", "ȸ������ :: " + MAIN_TITLE);
		
		// �̸��� �������� �߼�
		emailAuthentication(dto, "authAf.do");
		
		// ȸ�� ���
		service.addMemeber(dto);		
		
		return "regiSuc.tiles";
	}
	
	/**
	 * �α��� ȭ������ �̵��ϴ� �޼���
	 * @param model
	 * @return �α��� Ÿ�����
	 */
	@RequestMapping (value="login.do", method = RequestMethod.GET)
	public String login(Model model, String isFail) {
		// �⺻���� �ش� ��ɸ��� ���δ�.
		model.addAttribute("title", "�α��� :: " + MAIN_TITLE);
		
		// �α��� ���н� isFail�� true�� �Ѿ���� �� �� null
		model.addAttribute("isFail", isFail);
		
		return "login.tiles";
	}
	
	/**
	 * �α��� �� �̵��� ȭ���� ó���ϴ� �޼���
	 * @param model ������ �����ϴ� ��
	 * @param request ���Ǽ����� ���� ��
	 * @return �α��� �� �̵��� Ÿ�����
	 */
	@RequestMapping (value="loginAf.do", method = RequestMethod.POST)
	public String loginAf(Model model, HttpServletRequest request ,ABCMemberDto dto) {
		// ������ �α��� ��û�� ������ ���
		ABCMemberDto member = service.login(dto);
		if(member == null) {
			return "redirect:/login.do?isFail=true"; // �α��� ȭ������ �ٽ� ���ư���.
		}
		
		// ��û�� ������ ��� ���� ���
		request.getSession().setAttribute("login", member);
		
		/* �Ϲ�ȸ���� ����ȭ��, �����ڴ� ������ȭ������ ����. */
		String tile = "redirect:/main.do";
		if (member.getGrade() == 2)
			tile = "redirect:/admin.do";
		
		return tile;
	}
	
	/**
	 *  ������ȸ���� �α��� �� �̵��� ȭ���� ó���ϴ� �޼���
	 * @param model ������ �����ϴ� ��
	 * @return �α��� �� �̵��� Ÿ�����
	 */
	@RequestMapping (value="admin.do", method = {RequestMethod.GET,RequestMethod.POST})
	public String admin(Model model) {
		// �⺻���� �ش� ��ɸ��� ���δ�.
		model.addAttribute("title", "������ȭ�� :: " + MAIN_TITLE);
		
		return "admin.tiles";
	}
	
	/**
	 * �α׾ƿ��� �� �������� �Ѿ�� �޼���
	 * @param request ���� ������ ���� ��
	 * @return ���� �������� Ÿ�����
	 */
	@RequestMapping(value="logout.do", method=RequestMethod.GET)
	public String logout(HttpServletRequest request) {
		// ���� ����
		request.getSession().invalidate();
		
		return "redirect:/main.do";
	}
	
	/**
	 * ��й�ȣ ã�� �̵� �޼���
	 * @param model
	 * @return ��й�ȣ ã�� �������� Ÿ�����
	 */
	@RequestMapping(value="searchpwd.do", method = RequestMethod.GET)
	public String searchpwd(Model model) {
		// �⺻���� �ش� ��ɸ��� ���δ�.
		model.addAttribute("title", "��й�ȣ ã��" + MAIN_TITLE);
		
		return "searchpwd.tiles";
	}
	
	/**
	 * ��й�ȣ ã�⿡�� �������� �߼� �� �� ó���Ǵ� �޼���
	 * @param dto �̸��� �����͸� �ִ� ȸ�� DTO
	 * @return ���� �������� �����̷�Ʈ
	 */
	@RequestMapping(value="searchpwdAf.do", method = RequestMethod.POST)
	public String searchpwdAf(ABCMemberDto dto) {
		// ���� �̸��� �߼�
		emailAuthentication(dto, "pwdAfAuth.do");
		
		// ���ο� �����ڵ�� ����
		service.changeAuthCode(dto);
		
		return "redirect:/main.do";
	}
	
	/**
	 * �α��� ȭ�鿡�� ��й�ȣ ã�⸦ ���� �� �̸��� �����̵Ǹ�
	 * �ش� ��й�ȣ ���� �������� �̵��ϴ� �޼���
	 * @param model ���� ����
	 * @return ��й�ȣ ���� �������� Ÿ�����
	 */
	@RequestMapping(value="pwdAfAuth.do", method = RequestMethod.GET)
	public String pwdAfAuth(Model model, HttpServletRequest request ,ABCMemberDto dto) {
		// �⺻���� �ش� ��ɸ��� ���δ�.
		model.addAttribute("title", "��й�ȣ ���� :: " + MAIN_TITLE);
		
		// �̸��� ���ڵ�
		byte[] decoded = Base64.decodeBase64(dto.getEmail().getBytes());
		
		// ���ڵ��� �̸��Ϸ� ����
		dto.setEmail(new String(decoded));
		
		// ���ǿ� ���
		request.getSession().setAttribute("authAf", dto);
		
		return "pwdAfAuth.tiles";
	}
	
	/**
	 * ��й�ȣ ã��� ��й�ȣ ���� �� ������ �̵��ϴ� �޼���
	 * @param request ����� ������ �������� ��ü
	 * @param pwd ������ ��й�ȣ
	 * @return �α��� �������� Ÿ����� �����̷�Ʈ
	 */
	@RequestMapping(value="pwdAfAuthAf.do", method = RequestMethod.POST)
	public String pwdAfAuthAf(HttpServletRequest request , String pwd) {
		/* ���ǿ� ����� ȸ����ü�� ������ ��й�ȣ�� ���� */
		ABCMemberDto dto = (ABCMemberDto)(request.getSession().getAttribute("authAf"));
		dto.setPwd(pwd);
		
		// ��������� ������ ����
		request.getSession().invalidate();
		
		// �����ڵ忡 ���� ��й�ȣ ���� ��û
		service.changePwdOnAuth(dto);
		
		return "redirect:/login.do";
	}
	
	/**
	 * �̸��� �����ϴ� �޼���
	 * @param dto ������ ȸ������
	 * @param path ������ �� ã�ư� ���
	 */
	public void emailAuthentication(ABCMemberDto dto, String path) {
		try {
			// �ܼ� ���
			System.out.println(dto);
			
			// ����Ű ����
			String uuid = UUID.randomUUID().toString().replace("-", "");
			dto.setAuthCode(uuid);
			
			/* �߼��� ���� ���� */
			// �۽� �����ּ�
			String from = "dlqjatlr990@gmail.com";
			
			// ���� ����
			String subject = "[ABC Funding]��û�Ͻ� ���������Դϴ�.";
			
			// �̸��� ���ڵ�
			byte[] encodeEmail = Base64.encodeBase64(dto.getEmail().getBytes());
			String content =
				"http://192.168.2.9:8090/ABCFunding/"+path+"?email="+
						new String(encodeEmail)+"&authCode="+uuid;

			/* SMTP ������ �����ϱ� ���� ������ */
			Properties p = new Properties();
			p.put("mail.smtp.host", "smtp.gmail.com");
			p.put("mail.smtp.port", "465");
			p.put("mail.smtp.starttls.enable", "true");
			p.put("mail.smtp.auth", "true");
			p.put("mail.smtp.debug", "true");
			p.put("mail.smtp.socketFactory.port", "465");
			p.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			p.put("mail.smtp.socketFactory.fallback", "false");			
			
			// SMTP �������� ����
			Authenticator auth = new SMTPAuthenticator();
			
			// SMTP�� ���������� ���������� ���� ����
			Session session = Session.getInstance(p, auth);
			
			// ���� ����� ��
			session.setDebug(true);
			
			/* ������ ������ ���� ��ü���� */
			MimeMessage msg = new MimeMessage(session);
			Address fromAddr = new InternetAddress(from);
			Address toAddr = new InternetAddress(dto.getEmail());
			String emailContent = makeEmail(content, dto.getEmail());
			
			// ����
			msg.setSubject(subject);

			// ������ ���
			msg.setFrom(fromAddr); 

			// �޴� ���
			msg.addRecipient(Message.RecipientType.TO, toAddr); 
			
			// �ۼ��� �̸���
			msg.setText(emailContent, "UTF-8");
			
			// MIME ����
			msg.setHeader("content-Type", "text/html;charset=utf-8");
			
			// �������� ����
			Transport.send(msg);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * �̸��� ���� �ۼ� �޼���
	 * @param content ���� ����
	 * @param email �޴� �� �����ּ�
	 * @return ������ HTML String
	 */
	public String makeEmail(String content, String email){
		StringBuffer sb = new StringBuffer(); 

		// �׸� 
		sb.append("<HTML>\n"); 
		
		sb.append("<HEAD>\n"); 
		sb.append("<TITLE>"+"�ȳ����Դϴ�."+"</TITLE>\n"); 
		sb.append("<META content=text/html; charset=utf-8>\n"); 
		sb.append("</HEAD>\n"); 
		sb.append("<BODY text=black vLink=blue aLink=red link=blue bgColor=#ffffff>\n"); 
		//�⺻���� ������ 
		sb.append("<P align=left><B><FONT size=8px face=���� color=black>���� �����ϱ�</FONT></B></P>\n");
		sb.append("<P align=left><B><FONT size=6px face=���� color=black>"+email+"��!! ȯ���մϴ�.</FONT></B></P>\n");
		sb.append("<P align=left><B><FONT size=6px face=���� color=black>�Ʒ��� ��ũ�� ���� ������ �Ϸ��ϼ���.</FONT></B></P>\n");
		
		sb.append("<P align=left><a href='" + content +"'><FONT size=5px face=���� color=blue>���� �����ϱ�!!</FONT></a></P>\n");

		//�⺻���� ������ ����
		sb.append("</BODY>\n"); 
		sb.append("</HTML>\n"); 
		
		return sb.toString();
	}
	
	/**
	 * �̸��� ���� Ȯ�� �޼���
	 * @param dto ȸ�� ����
	 * @param model
	 * @return �α��� �������� Ÿ�����
	 */
	@RequestMapping(value = "authAf.do", method = RequestMethod.GET)
	public String authAf(ABCMemberDto dto, Model model) {
		// �⺻���� �ش� ��ɸ��� ���δ�.
		model.addAttribute("title", "�̸��� ���� :: " + MAIN_TITLE);
		
		try {
			// �̸��� ���ڵ�
			byte[] decoded = Base64.decodeBase64(dto.getEmail().getBytes());
			
			// ���ڵ��� �̸��� ����
			dto.setEmail(new String(decoded));
			
			// �Ϲ�ȸ������ ���� �ο�
			System.out.println(dto);
			service.doAuthMember(dto);
			
			// �ǹ̺Ҹ� : model.addAttribute("status", "100");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/login.do";
	}
	
	/**
	 * �� ���� �󼼺���
	 * @param request �ش� ȸ���� �̸��� ������ �޾ƿ��� ����
	 * @param model ��ȸ�� ������ ��� ����
	 * @return �� ���� �󼼺��� ȭ��
	 */
	@RequestMapping(value = "myInfo.do", method = {RequestMethod.GET,RequestMethod.POST})
	public String myInfo(HttpServletRequest request, Model model) {
		// �⺻���� �ش� ��ɸ��� ���δ�.
		model.addAttribute("title", "������" + MAIN_TITLE);
		
		// �� ���� ȣ�� �� ��´�.
		model.addAttribute("myInfo",service.getMyInfo(request.getParameter("email")));
		return "myInfo.tiles";
	}
	
	/**
	 * �� ���� ���� ����Ʈ ��������
	 */
	@RequestMapping(value = "myLoanInfoList.do", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Map<String, List<ABCMyLoanInfoDto>> myLoanInfoList(ABCMyLoanInfoDto loanListDto, Model model) {
		// �⺻���� �ش� ��ɸ��� ���δ�.
		model.addAttribute("title", "���� ���⳻��" + MAIN_TITLE);

		// ���� ���� ���� ȣ�� �� ��´�.
		List<ABCMyLoanInfoDto> loanLists = service.getMyLoanInfoList(loanListDto.getEmail());
		Map<String, List<ABCMyLoanInfoDto>> map=new HashMap<String, List<ABCMyLoanInfoDto>>();
		map.put("loanList", loanLists);
		
		return map;
	}
}