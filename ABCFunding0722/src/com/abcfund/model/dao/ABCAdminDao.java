/**
 * 
 */
package com.abcfund.model.dao;

import java.io.Serializable;
import java.util.List;

import com.abcfund.model.dto.ABCJudgeDto;
import com.abcfund.model.dto.ABCJudgeResultDto;

/**
 * ������ ȭ���� DAO �������̽�
 * @author 9age
 *
 */
public interface ABCAdminDao extends Serializable {
	List<ABCJudgeDto> getJudgeList();
	ABCJudgeDto getJudgeDetail(int loanCode);
	void addJudgeResult(ABCJudgeResultDto jrdto);
}
