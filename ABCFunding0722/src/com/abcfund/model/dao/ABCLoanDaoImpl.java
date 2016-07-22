/**
 * 
 */
package com.abcfund.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abcfund.model.dto.ABCLoanDto;
import com.abcfund.model.dto.ABCLoanSubDto;

/**
 * ���� ��û�� ���� DAO Ŭ����
 * @author 9age
 *
 */
@Repository
public class ABCLoanDaoImpl implements ABCLoanDao {
	@Autowired
	private SqlSession sqlSession;
	
	/** MyBatis �����û ���ӽ����̽� */
	private String nameSpace = "ABCLoan.";

	/**
	 * ���� ��û ���� ���
	 */
	@Override
	public void addLoan(ABCLoanDto ldto) {
		System.out.println(ldto.toString());
		sqlSession.insert(nameSpace + "addLoan", ldto);
	}
	
	/**
	 * ȸ�� �ſ��� ���
	 */
	@Override
	public void addCreditRating(ABCLoanSubDto lsdto) {
		sqlSession.update(nameSpace + "addCreditRating", lsdto);
	}

	/**
	 * �ɻ� ��� ����� ���� ���� �ڵ� ������
	 */
	@Override
	public int getLoanCode() {
		return (int) sqlSession.selectOne(nameSpace + "getLoanCode");
	}

	/**
	 * ���� ��û �� �ɻ� ��� ���
	 */
	@Override
	public void addJudge(int lcode) {
		sqlSession.insert(nameSpace + "addJudge",lcode);
	}
	
}
