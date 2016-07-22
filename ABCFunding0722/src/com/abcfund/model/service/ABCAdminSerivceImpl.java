/**
 * 
 */
package com.abcfund.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcfund.model.dao.ABCAdminDao;
import com.abcfund.model.dto.ABCJudgeDto;
import com.abcfund.model.dto.ABCJudgeResultDto;

/**
 * ������ ȭ���� �����ϱ� ���� ���� ���� Ŭ����
 * @author 9age
 *
 */
@Service
public class ABCAdminSerivceImpl implements ABCAdminSerivce {
	private static final long serialVersionUID = -7863882862366262619L;
	
	@Autowired
	ABCAdminDao adao;
	
	/**
	 * �ɻ��� ����Ʈ�� ȣ���ϴ� �޼���
	 */
	@Override
	public List<ABCJudgeDto> getJudgeList() {
		return adao.getJudgeList();
	}

	/**
	 * �ɻ��� �󼼳����� ȣ���ϴ� �޼���
	 * @param loanCode �����ڵ�
	 */
	@Override
	public ABCJudgeDto getJudgeDetail(int loanCode) {
		return adao.getJudgeDetail(loanCode);
	}

	/**
	 * �ɻ����� ó���ϴ� �޼��� ȣ��
	 * @param ABCJudgeResultDto �ɻ��� ������ ���� DTO ��ü
	 */
	@Override
	public void addJudgeResult(ABCJudgeResultDto jrdto) {
			adao.addJudgeResult(jrdto);
	}

}
