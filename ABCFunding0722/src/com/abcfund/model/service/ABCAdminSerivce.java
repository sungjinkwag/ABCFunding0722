/**
 * 
 */
package com.abcfund.model.service;

import java.io.Serializable;
import java.util.List;

import com.abcfund.model.dto.ABCJudgeDto;
import com.abcfund.model.dto.ABCJudgeResultDto;

/**
 * 관리자 화면을 제어하기 위한 서비스 인터페이스
 * @author 9age
 *
 */
public interface ABCAdminSerivce extends Serializable {
	List<ABCJudgeDto>getJudgeList();
	ABCJudgeDto getJudgeDetail(int loanCode);
	void addJudgeResult(ABCJudgeResultDto jrdto);
}
