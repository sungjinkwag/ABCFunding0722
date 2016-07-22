package com.abcfund.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ���ڿ� ���õ� ��Ʈ�ѷ�
 * @author 9age
 *
 */
@Controller
public class ABCInvestController {
	/** �⺻ ���� */
	public static String MAIN_TITLE = "ABC Funding";
	
	/**
	 * �����ϱ� �������� �̵��ϴ� �޼���
	 * @param model ������ ������ ��ü
	 * @return �����ϱ� �������� Ÿ�����
	 */
	@RequestMapping(value="invest.do", method=RequestMethod.GET)
	public String invest(Model model) {
		model.addAttribute("title", "�����ϱ� :: "+MAIN_TITLE);
		
		return "invest.tiles";
	}
	
	/**
	 * ���� ��ǰ�� ������ �� �ش� ���������� �̵��ϴ� �޼���
	 * @param model ���� ����
	 * @return ���� ���������� Ÿ����� 
	 */
	@RequestMapping(value="investDetail.do", method=RequestMethod.GET)
	public String investDetail(Model model) {
		model.addAttribute("title", "���� ������ :: "+MAIN_TITLE);
		
		return "investDetail.tiles";
	}
	
	/**
	 * ���ڽ�û ȭ������ �̵��ϴ� �޼���
	 * @param model ���� ����
	 * @return ���ڽ�û �������� Ÿ�����
	 */
	@RequestMapping(value="doInvest.do", method=RequestMethod.GET)
	public String doInvest(Model model) {
		model.addAttribute("title", "���ڽ�û :: "+MAIN_TITLE);
		
		return "doInvest.tiles";
	}
	
	/**
	 * ���ڽ�û�Ϸ� ȭ������ �̵��ϴ� �޼���
	 * @param model ���� ����
	 * @return ���ڿϷ� �������� Ÿ�����
	 */
	@RequestMapping(value="investSuc.do", method=RequestMethod.POST)
	public String investSuc(Model model) {
		model.addAttribute("title", "���ڿϷ� :: "+MAIN_TITLE);
		
		return "investSuc.tiles";
	}
}
