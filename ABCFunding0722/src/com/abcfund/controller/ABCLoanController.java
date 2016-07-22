/**
 * 
 */
package com.abcfund.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.abcfund.model.dto.ABCLoanDto;
import com.abcfund.model.dto.ABCMemberDto;
import com.abcfund.model.service.ABCLoanService;

/**
 * �����û ��Ʈ�ѷ�
 * @author 9age
 *
 */
@Controller
public class ABCLoanController {
	@Autowired
	ABCLoanService loanService;
	
	/** �⺻ ���� */
	public static String MAIN_TITLE = "ABC Funding";
	
	/**
	 * �����û ������ �̵� �޼���
	 * ���� ������ �ϰ� �ٷ� �����û �������� �̵�
	 * @param model
	 * @return �����û �������� Ÿ�����
	 * @throws Exception
	 */
	@RequestMapping(value = "loan.do", method = {RequestMethod.GET,RequestMethod.POST})
	public String loan(Model model,HttpServletRequest request ,ABCMemberDto dto) throws Exception {
		// ���� ����
		model.addAttribute("title", "�����û :: "+MAIN_TITLE);
		
		return "loan.tiles";
	}
	
	/**
	 * �����û ���� ȣ�� �� ȭ���̵��ϴ� �޼���
	 * @param model
	 * @return �����û �������� Ÿ�����
	 * @throws Exception
	 */
	@RequestMapping(value = "loanAf.do", method = {RequestMethod.GET,RequestMethod.POST})
	@Transactional
	public String loanAf(Model model,HttpServletRequest request ,ABCLoanDto ldto) throws Exception {
		// ���� ����
		model.addAttribute("title", "�����û ó���� :: "+MAIN_TITLE);
		
		// ���� ��û�� �̹��� ���� ���ε�
		MultipartFile uploadfile = ldto.getUploadfile();
		if (uploadfile != null) {
			String fname = uploadfile.getOriginalFilename();
			ldto.setFname(fname);
			System.out.println(fname);
			try{
				File file = new File("C:/workspace/ABCFunding0718/WebContent/uploadfile/" + fname);
				uploadfile.transferTo(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// ���� ��û ���
		loanService.addLoan(ldto);
		
		return "loanSuc.tiles"; // ���� ��û ���� ȭ������ �̵�
	}
	
}
