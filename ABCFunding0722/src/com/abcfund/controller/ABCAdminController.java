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
 * 관리자 화면을 제어하는 컨트롤러 클래스
 * @author 9age
 *
 */
@Controller
public class ABCAdminController {
	@Autowired
	ABCAdminSerivce adminservice;
	
	/** 기본 제목 */
	public static String MAIN_TITLE = "ABC Funding";
	
	/**
	 * 심사관리 화면으로 이동하는 메서드
	 * @param model
	 * @return 심사관리 타일즈명
	 */
	@RequestMapping (value="judgeManage.do", method = {RequestMethod.GET,RequestMethod.POST})
	public String judgeManage(Model model) {
		// 기본제목에 해당 기능명을 붙인다.
		model.addAttribute("title", "심사관리 :: " + MAIN_TITLE);
		
		// 심사대기 상태인 리스트 호출 후 담기
		model.addAttribute("judgeList", adminservice.getJudgeList());
		
		return "judgelist.tiles";
	}
	
	/**
	 * 심사대기 상세화면으로 이동하는 메서드
	 * @param model
	 * @return 심사관리 타일즈명
	 */
	@RequestMapping (value="judgeDetail.do", method = {RequestMethod.GET,RequestMethod.POST})
	public String judgeDetail(HttpServletRequest request,Model model) {
		// 기본제목에 해당 기능명을 붙인다.
		model.addAttribute("title", "심사상세내용 :: " + MAIN_TITLE);
		
		// 해당 심사건의 loancode를 웹에서부터 받아와 조회
		int loanCode = Integer.parseInt(request.getParameter("loanCode"));
		model.addAttribute("judgeDetail", adminservice.getJudgeDetail(loanCode));
		
		return "judgedetail.tiles";
	}
	
	/**
	 * 심사대기 상세화면에서 심사결과 처리하는 메서드
	 * @param model
	 * @return 심사리스트 타일즈명
	 */
	@RequestMapping (value="judgeDetailAf.do", method = {RequestMethod.GET,RequestMethod.POST})
	public String judgeDetailAf(Model model,ABCJudgeResultDto jrdto) {
		// 기본제목에 해당 기능명을 붙인다.
		model.addAttribute("title", "심사결과 :: " + MAIN_TITLE);
		
		// 심사결과 정보를 db에 입력한다.
		adminservice.addJudgeResult(jrdto);
		
		return "redirect:/judgeManage.do";
	}
}
