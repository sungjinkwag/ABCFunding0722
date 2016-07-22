/**
 * 
 */
package com.abcfund.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abcfund.model.dto.ABCJudgeDto;
import com.abcfund.model.dto.ABCJudgeResultDto;

/**
 * 관리자 화면의 DAO 클래스
 * @author 9age
 *
 */
@Repository
public class ABCAdminDaoImpl implements ABCAdminDao {
	private static final long serialVersionUID = -5750103480903548432L;

	@Autowired
	private SqlSession sqlSession;

	/** MyBatis 관리자 네임스페이스 */
	private String nameSpace = "ABCAdmin.";
	
	/**
	 * 심사상태가 대기인 리스트를 조회
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ABCJudgeDto> getJudgeList() {
		return (List<ABCJudgeDto>)sqlSession.selectList(nameSpace+"getJudgeList");
	}

	/**
	 * 심사상태가 대기인 심사건의 상세 내용 조회
	 * @param loanCode 해당 심사건의 대출신청코드
	 */
	@Override
	public ABCJudgeDto getJudgeDetail(int loanCode) {
		return (ABCJudgeDto)sqlSession.selectOne(nameSpace+"getJudgeDetail", loanCode);
	}

	/**
	 * 심사결과 정보를 갱신
	 * @param ABCJudgeResultDto 심사결과 정보를 담은 DTO 객체
	 */
	@Override
	public void addJudgeResult(ABCJudgeResultDto jrdto) {
		sqlSession.update(nameSpace+"addJudgeResult", jrdto);
	}
	
}
