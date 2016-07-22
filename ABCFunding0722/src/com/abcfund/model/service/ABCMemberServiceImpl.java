package com.abcfund.model.service;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcfund.model.dao.ABCAccountDao;
import com.abcfund.model.dao.ABCMemberDao;
import com.abcfund.model.dto.ABCAccountDto;
import com.abcfund.model.dto.ABCMemberDto;
import com.abcfund.model.dto.ABCMyInfoDto;
import com.abcfund.model.dto.ABCMyLoanInfoDto;
import com.abcfund.util.ABCUtility;

/**
 * ȸ�� �� ���� ���� Ŭ����
 * @author 9age
 *
 */
@Service
public class ABCMemberServiceImpl implements ABCMemberService {
	/** ȸ���� DAO */
	@Autowired
	private ABCMemberDao dao;
	
	/** ������ DAO */
	@Autowired
	private ABCAccountDao accDao;
	
	/**
	 * ȸ�� ��� �޼���
	 * ȸ�� ��ϰ� ���ÿ� ������µ� �߱�
	 * @param dto ȸ�� ��ü
	 */
	@Override
	public void addMemeber(ABCMemberDto dto) {
		// ȸ�� ���
		dao.addMemeber(dto);
		
		/* ������� ���� �� ��� */
		StringBuilder accountNo = new StringBuilder();
		accountNo.append(ABCUtility.randomNumber(3));
		accountNo.append("-");
		accountNo.append(ABCUtility.randomNumber(6));
		accountNo.append("-");
		accountNo.append(ABCUtility.randomNumber(3));
		
		ABCAccountDto accDto = 
			new ABCAccountDto(accountNo.toString(), dto.getEmail(), dto.getName());		
		accDao.addAccount(accDto);
	}
	
	/**
	 * ȸ�� ����� ���������� �Ϲ�ȸ������ �����ϴ� �޼���
	 * @param dto ȸ�� ��ü
	 */
	@Override
	public void doAuthMember(ABCMemberDto dto) {
		dao.doAuthCode(dto);
	}
	
	/**
	 * �α����ϴ� �޼���
	 * @param dto ȸ�� ��ü
	 * @return �α��� ������ true
	 */
	@Override
	public ABCMemberDto login(ABCMemberDto dto) {
		return dao.login(dto);
	}
	
	/**
	 * �� �������� ��й�ȣ ������ �� ȣ���ϴ� �޼���
	 * @param dto ȸ�� ��ü
	 */
	@Override
	public void changePwd(ABCMemberDto dto) {
		dao.changePwd(dto);
	}
	
	/**
	 * ȸ���� �����ڵ带 �����ϴ� �޼���.
	 * ��й�ȣ ã��� �̸��� �����Ϸ��� ��� ���
	 * @param dto ȸ�� ��ü
	 */
	@Override
	public void changeAuthCode(ABCMemberDto dto) {
		dao.changeAuthCode(dto);
	}
	
	/**
	 * �̸��� �������� ��й�ȣ�� ������ �� ����ϴ� �޼���
	 * @param dto ȸ�� ��ü
	 */
	@Override
	public void changePwdOnAuth(ABCMemberDto dto) {
		dao.changePwdOnAuth(dto);
	}

	@Override
	public ABCMyInfoDto getMyInfo(String email) {
		return dao.getMyInfo(email);
	}

	@Override
	public List<ABCMyLoanInfoDto> getMyLoanInfoList(String email) {
		return dao.getMyLoanInfoList(email);
	}

}
