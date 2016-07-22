package com.abcfund.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abcfund.model.dao.ABCLoanDao;
import com.abcfund.model.dto.ABCLoanDto;
import com.abcfund.model.dto.ABCLoanSubDto;
import com.abcfund.util.ABCUtility;

/**
 * ���� ��û�� ���� ���� Ŭ����
 * @author 9age
 *
 */
@Service
public class ABCLoanServiceImpl implements ABCLoanService {

	/** �����û DAO */
	@Autowired
	private ABCLoanDao ldao;
	
	/**
	 * ���� ��û ��� �޼���
	 * @param ldto ���� ��û ������ ���� ��ü
	 */
	@Override
	@Transactional
	public void addLoan(ABCLoanDto ldto) {
		// ���� ��û ���� ���
		ldao.addLoan(ldto);
		
		// �ش� ȸ�� �ſ��� ���� �� ���
		int creditRating = Integer.parseInt(ABCUtility.randomNumber(1));
		ABCLoanSubDto lsdto = new ABCLoanSubDto(creditRating,ldto.getEmail());
		
		ldao.addCreditRating(lsdto);
		
		// ���� ��û ���� ��� �� �����ڵ带 �޾ƿ� �ɻ� ���̺� �ɻ�������� ���
		int lcode = ldao.getLoanCode();
		ldao.addJudge(lcode);
		
	}

}
