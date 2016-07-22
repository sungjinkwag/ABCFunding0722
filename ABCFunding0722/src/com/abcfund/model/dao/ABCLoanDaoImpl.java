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
 * 대출 신청에 대한 DAO 클래스
 * @author 9age
 *
 */
@Repository
public class ABCLoanDaoImpl implements ABCLoanDao {
	@Autowired
	private SqlSession sqlSession;
	
	/** MyBatis 대출신청 네임스페이스 */
	private String nameSpace = "ABCLoan.";

	/**
	 * 대출 신청 정보 등록
	 */
	@Override
	public void addLoan(ABCLoanDto ldto) {
		System.out.println(ldto.toString());
		sqlSession.insert(nameSpace + "addLoan", ldto);
	}
	
	/**
	 * 회원 신용등급 등록
	 */
	@Override
	public void addCreditRating(ABCLoanSubDto lsdto) {
		sqlSession.update(nameSpace + "addCreditRating", lsdto);
	}

	/**
	 * 심사 대기 등록을 위한 대출 코드 얻어오기
	 */
	@Override
	public int getLoanCode() {
		return (int) sqlSession.selectOne(nameSpace + "getLoanCode");
	}

	/**
	 * 대출 신청 후 심사 대기 등록
	 */
	@Override
	public void addJudge(int lcode) {
		sqlSession.insert(nameSpace + "addJudge",lcode);
	}
	
}
