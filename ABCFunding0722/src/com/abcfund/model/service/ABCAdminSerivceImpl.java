/**
 * 
 */
package com.abcfund.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcfund.model.dao.ABCAdminDao;
import com.abcfund.model.dto.ABCJudgeDto;
import com.abcfund.model.dto.ABCJudgeResultDto;

/**
 * 관리자 화면을 제어하기 위한 서비스 구현 클래스
 * @author 9age
 *
 */
@Service
public class ABCAdminSerivceImpl implements ABCAdminSerivce {
	private static final long serialVersionUID = -7863882862366262619L;
	
	@Autowired
	ABCAdminDao adao;
	
	/**
	 * 심사대기 리스트를 호출하는 메서드
	 */
	@Override
	public List<ABCJudgeDto> getJudgeList() {
		return adao.getJudgeList();
	}

	/**
	 * 심사대기 상세내용을 호출하는 메서드
	 * @param loanCode 대출코드
	 */
	@Override
	public ABCJudgeDto getJudgeDetail(int loanCode) {
		return adao.getJudgeDetail(loanCode);
	}

	/**
	 * 심사결과를 처리하는 메서드 호출
	 * @param ABCJudgeResultDto 심사결과 정보를 담은 DTO 객체
	 */
	@Override
	public void addJudgeResult(ABCJudgeResultDto jrdto) {
			adao.addJudgeResult(jrdto);
	}

}
