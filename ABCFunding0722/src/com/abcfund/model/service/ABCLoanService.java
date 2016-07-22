/**
 * 
 */
package com.abcfund.model.service;

import com.abcfund.model.dto.ABCLoanDto;

/**
 * 대출신청에 대한 서비스 인터페이스
 * @author 9age
 *
 */
public interface ABCLoanService {
	void addLoan(ABCLoanDto ldto);
}
