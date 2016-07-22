package com.abcfund.model.dao;

import java.util.List;

import com.abcfund.model.dto.ABCMemberDto;
import com.abcfund.model.dto.ABCMyInfoDto;
import com.abcfund.model.dto.ABCMyLoanInfoDto;

/**
 * 회원에 대한 DAO 인터페이스
 * @author Beom
 *
 */
public interface ABCMemberDao {
	void addMemeber(ABCMemberDto dto);
	void doAuthCode(ABCMemberDto dto);
	ABCMemberDto login(ABCMemberDto dto);
	void changePwd(ABCMemberDto dto);
	void changeAuthCode(ABCMemberDto dto);
	void changePwdOnAuth(ABCMemberDto dto);
	ABCMyInfoDto getMyInfo(String email);
	List<ABCMyLoanInfoDto> getMyLoanInfoList(String email);
}
