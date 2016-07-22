package com.abcfund.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 투자와 관련된 컨트롤러
 * @author 9age
 *
 */
@Controller
public class ABCInvestController {
	/** 기본 제목 */
	public static String MAIN_TITLE = "ABC Funding";
	
	/**
	 * 투자하기 페이지로 이동하는 메서드
	 * @param model 제목을 설정할 객체
	 * @return 투자하기 페이지의 타일즈명
	 */
	@RequestMapping(value="invest.do", method=RequestMethod.GET)
	public String invest(Model model) {
		model.addAttribute("title", "투자하기 :: "+MAIN_TITLE);
		
		return "invest.tiles";
	}
	
	/**
	 * 대출 상품을 눌렀을 때 해당 상세페이지로 이동하는 메서드
	 * @param model 제목 설정
	 * @return 투자 상세페이지의 타일즈명 
	 */
	@RequestMapping(value="investDetail.do", method=RequestMethod.GET)
	public String investDetail(Model model) {
		model.addAttribute("title", "투자 상세정보 :: "+MAIN_TITLE);
		
		return "investDetail.tiles";
	}
	
	/**
	 * 투자신청 화면으로 이동하는 메서드
	 * @param model 제목 설정
	 * @return 투자신청 페이지의 타일즈명
	 */
	@RequestMapping(value="doInvest.do", method=RequestMethod.GET)
	public String doInvest(Model model) {
		model.addAttribute("title", "투자신청 :: "+MAIN_TITLE);
		
		return "doInvest.tiles";
	}
	
	/**
	 * 투자신청완료 화면으로 이동하는 메서드
	 * @param model 제목 설정
	 * @return 투자완료 페이지의 타일즈명
	 */
	@RequestMapping(value="investSuc.do", method=RequestMethod.POST)
	public String investSuc(Model model) {
		model.addAttribute("title", "투자완료 :: "+MAIN_TITLE);
		
		return "investSuc.tiles";
	}
}
