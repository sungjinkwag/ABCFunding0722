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
 * ������ ȭ���� DAO Ŭ����
 * @author 9age
 *
 */
@Repository
public class ABCAdminDaoImpl implements ABCAdminDao {
	private static final long serialVersionUID = -5750103480903548432L;

	@Autowired
	private SqlSession sqlSession;

	/** MyBatis ������ ���ӽ����̽� */
	private String nameSpace = "ABCAdmin.";
	
	/**
	 * �ɻ���°� ����� ����Ʈ�� ��ȸ
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ABCJudgeDto> getJudgeList() {
		return (List<ABCJudgeDto>)sqlSession.selectList(nameSpace+"getJudgeList");
	}

	/**
	 * �ɻ���°� ����� �ɻ���� �� ���� ��ȸ
	 * @param loanCode �ش� �ɻ���� �����û�ڵ�
	 */
	@Override
	public ABCJudgeDto getJudgeDetail(int loanCode) {
		return (ABCJudgeDto)sqlSession.selectOne(nameSpace+"getJudgeDetail", loanCode);
	}

	/**
	 * �ɻ��� ������ ����
	 * @param ABCJudgeResultDto �ɻ��� ������ ���� DTO ��ü
	 */
	@Override
	public void addJudgeResult(ABCJudgeResultDto jrdto) {
		sqlSession.update(nameSpace+"addJudgeResult", jrdto);
	}
	
}
