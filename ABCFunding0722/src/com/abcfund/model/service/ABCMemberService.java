package com.abcfund.model.service;

import java.util.List;

import org.json.JSONArray;

import com.abcfund.model.dto.ABCMemberDto;
import com.abcfund.model.dto.ABCMyInfoDto;
import com.abcfund.model.dto.ABCMyLoanInfoDto;

/**
 * @author 9age
 *
 */
public interface ABCMemberService {
	void addMemeber(ABCMemberDto dto);
	void doAuthMember(ABCMemberDto dto);
	ABCMemberDto login(ABCMemberDto dto);
	void changePwd(ABCMemberDto dto);
	void changeAuthCode(ABCMemberDto dto);
	void changePwdOnAuth(ABCMemberDto dto);
	ABCMyInfoDto getMyInfo(String email);
	List<ABCMyLoanInfoDto> getMyLoanInfoList(String email);
}