package com.abcfund.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.abcfund.model.dto.ABCJudgeResultDto;
import com.abcfund.model.service.ABCAdminSerivce;

/**
 * ������ ȭ���� �����ϴ� ��Ʈ�ѷ� Ŭ����
 * @author 9age
 *
 */
@Controller
public class ABCAdminController {
	@Autowired
	ABCAdminSerivce adminservice;
	
	/** �⺻ ���� */
	public static String MAIN_TITLE = "ABC Funding";
	
	/**
	 * �ɻ���� ȭ������ �̵��ϴ� �޼���
	 * @param model
	 * @return �ɻ���� Ÿ�����
	 */
	@RequestMapping (value="judgeManage.do", method = {RequestMethod.GET,RequestMethod.POST})
	public String judgeManage(Model model) {
		// �⺻���� �ش� ��ɸ��� ���δ�.
		model.addAttribute("title", "�ɻ���� :: " + MAIN_TITLE);
		
		// �ɻ��� ������ ����Ʈ ȣ�� �� ���
		model.addAttribute("judgeList", adminservice.getJudgeList());
		
		return "judgelist.tiles";
	}
	
	/**
	 * �ɻ��� ��ȭ������ �̵��ϴ� �޼���
	 * @param model
	 * @return �ɻ���� Ÿ�����
	 */
	@RequestMapping (value="judgeDetail.do", method = {RequestMethod.GET,RequestMethod.POST})
	public String judgeDetail(HttpServletRequest request,Model model) {
		// �⺻���� �ش� ��ɸ��� ���δ�.
		model.addAttribute("title", "�ɻ�󼼳��� :: " + MAIN_TITLE);
		
		// �ش� �ɻ���� loancode�� ���������� �޾ƿ� ��ȸ
		int loanCode = Integer.parseInt(request.getParameter("loanCode"));
		model.addAttribute("judgeDetail", adminservice.getJudgeDetail(loanCode));
		
		return "judgedetail.tiles";
	}
	
	/**
	 * �ɻ��� ��ȭ�鿡�� �ɻ��� ó���ϴ� �޼���
	 * @param model
	 * @return �ɻ縮��Ʈ Ÿ�����
	 */
	@RequestMapping (value="judgeDetailAf.do", method = {RequestMethod.GET,RequestMethod.POST})
	public String judgeDetailAf(Model model,ABCJudgeResultDto jrdto) {
		// �⺻���� �ش� ��ɸ��� ���δ�.
		model.addAttribute("title", "�ɻ��� :: " + MAIN_TITLE);
		
		// �ɻ��� ������ db�� �Է��Ѵ�.
		adminservice.addJudgeResult(jrdto);
		
		return "redirect:/judgeManage.do";
	}
}
