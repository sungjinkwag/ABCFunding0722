package com.abcfund.model.dao;

import com.abcfund.model.dto.ABCLoanDto;
import com.abcfund.model.dto.ABCLoanSubDto;

/**
 * �����û�� ���� DAO �������̽�
 * @author 9age
 *
 */
public interface ABCLoanDao {
	void addLoan(ABCLoanDto ldto);
	void addCreditRating(ABCLoanSubDto lsdto);
	int getLoanCode();
	void addJudge(int lcode);
}
