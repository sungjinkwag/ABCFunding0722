package com.abcfund.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abcfund.model.dao.ABCLoanDao;
import com.abcfund.model.dto.ABCLoanDto;
import com.abcfund.model.dto.ABCLoanSubDto;
import com.abcfund.util.ABCUtility;

/**
 * 대출 신청에 대한 서비스 클래스
 * @author 9age
 *
 */
@Service
public class ABCLoanServiceImpl implements ABCLoanService {

	/** 대출신청 DAO */
	@Autowired
	private ABCLoanDao ldao;
	
	/**
	 * 대출 신청 등록 메서드
	 * @param ldto 대출 신청 정보를 담은 객체
	 */
	@Override
	@Transactional
	public void addLoan(ABCLoanDto ldto) {
		// 대출 신청 정보 등록
		ldao.addLoan(ldto);
		
		// 해당 회원 신용등급 생성 및 등록
		int creditRating = Integer.parseInt(ABCUtility.randomNumber(1));
		ABCLoanSubDto lsdto = new ABCLoanSubDto(creditRating,ldto.getEmail());
		
		ldao.addCreditRating(lsdto);
		
		// 대출 신청 정보 등록 후 대출코드를 받아와 심사 테이블에 심사대기건으로 등록
		int lcode = ldao.getLoanCode();
		ldao.addJudge(lcode);
		
	}

}
