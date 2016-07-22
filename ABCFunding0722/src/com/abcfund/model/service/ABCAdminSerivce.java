/**
 * 
 */
package com.abcfund.model.service;

import java.io.Serializable;
import java.util.List;

import com.abcfund.model.dto.ABCJudgeDto;
import com.abcfund.model.dto.ABCJudgeResultDto;

/**
 * ������ ȭ���� �����ϱ� ���� ���� �������̽�
 * @author 9age
 *
 */
public interface ABCAdminSerivce extends Serializable {
	List<ABCJudgeDto>getJudgeList();
	ABCJudgeDto getJudgeDetail(int loanCode);
	void addJudgeResult(ABCJudgeResultDto jrdto);
}
