package com.abcfund.model.dao;

import com.abcfund.model.dto.ABCLoanDto;
import com.abcfund.model.dto.ABCLoanSubDto;

/**
 * 대출신청에 대한 DAO 인터페이스
 * @author 9age
 *
 */
public interface ABCLoanDao {
	void addLoan(ABCLoanDto ldto);
	void addCreditRating(ABCLoanSubDto lsdto);
	int getLoanCode();
	void addJudge(int lcode);
}
