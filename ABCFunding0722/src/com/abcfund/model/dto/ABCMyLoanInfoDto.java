/**
 * 
 */
package com.abcfund.model.dto;

import java.io.Serializable;

/**
 * @author 9age
 *
 */
public class ABCMyLoanInfoDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 725294898092999866L;

	/**
	 * ���� ��û���� �̸���
	 */
	private String email;
	
	/** �����ǰ�� �ĺ��� �����ڵ� */
	private int loanCode;
	
	/** ������ ������� 
	 * �ݵ�������,�ݵ��Ϸ�,��ȯ��,��ȯ�Ϸ�
	 * �ѱ۷� �ִ�6��
	 */
	private String progress;
	
	/**
	 * ���� �ݸ�
	 * 8% ���� �ݸ�
	 */
	private int interestRate;
	
	/**
	 * ��ȯ���
	 * �����ݱյ���һ�ȯ ������� ����
	 */
	private String repayType;
	
	
	/**
	 * ���ⱸ��
	 * ���νſ����� ����
	 */
	private String loanType;
	
	/**
	 * �����û��
	 * ������ ��
	 */
	private int loanMoney;
	
	/**
	 * ����Ⱓ
	 * �Է°��ɰ� : 1~12,18,24
	 * ������ ������ 
	 */
	private int loanDate;
	
	/**
	 * �����ȯ��
	 * �Է°��� �� : 1,5,10,15,20,25
	 * ������ ��
	 */
	private int repay;
	
	/**
	 * �ݵ���û �Ⱓ
	 * �Է°��� �� : 1~7
	 * ������ ��
	 */
	private int expiryDate;
	
	/**
	 * ���� �ܾ�
	 * ���� �����ִ� ��ȯ�ؾ��� ���� �ܾ�
	 */
	private int balance;

	/**
	 * �⺻ ������
	 */
	public ABCMyLoanInfoDto() {}

	/**
	 * ��ü ������ ������ �⺻ ������
	 * @param email
	 * @param loanCode
	 * @param progress
	 * @param interestRate
	 * @param repayType
	 * @param loanType
	 * @param loanMoney
	 * @param loanDate
	 * @param repay
	 * @param expiryDate
	 * @param balance
	 */
	public ABCMyLoanInfoDto(String email, int loanCode, String progress, int interestRate, String repayType,
			String loanType, int loanMoney, int loanDate, int repay, int expiryDate, int balance) {
		super();
		this.email = email;
		this.loanCode = loanCode;
		this.progress = progress;
		this.interestRate = interestRate;
		this.repayType = repayType;
		this.loanType = loanType;
		this.loanMoney = loanMoney;
		this.loanDate = loanDate;
		this.repay = repay;
		this.expiryDate = expiryDate;
		this.balance = balance;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the loanCode
	 */
	public int getLoanCode() {
		return loanCode;
	}

	/**
	 * @param loanCode the loanCode to set
	 */
	public void setLoanCode(int loanCode) {
		this.loanCode = loanCode;
	}

	/**
	 * @return the progress
	 */
	public String getProgress() {
		return progress;
	}

	/**
	 * @param progress the progress to set
	 */
	public void setProgress(String progress) {
		this.progress = progress;
	}

	/**
	 * @return the interestRate
	 */
	public int getInterestRate() {
		return interestRate;
	}

	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

	/**
	 * @return the repayType
	 */
	public String getRepayType() {
		return repayType;
	}

	/**
	 * @param repayType the repayType to set
	 */
	public void setRepayType(String repayType) {
		this.repayType = repayType;
	}

	/**
	 * @return the loanType
	 */
	public String getLoanType() {
		return loanType;
	}

	/**
	 * @param loanType the loanType to set
	 */
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	/**
	 * @return the loanMoney
	 */
	public int getLoanMoney() {
		return loanMoney;
	}

	/**
	 * @param loanMoney the loanMoney to set
	 */
	public void setLoanMoney(int loanMoney) {
		this.loanMoney = loanMoney;
	}

	/**
	 * @return the loanDate
	 */
	public int getLoanDate() {
		return loanDate;
	}

	/**
	 * @param loanDate the loanDate to set
	 */
	public void setLoanDate(int loanDate) {
		this.loanDate = loanDate;
	}

	/**
	 * @return the repay
	 */
	public int getRepay() {
		return repay;
	}

	/**
	 * @param repay the repay to set
	 */
	public void setRepay(int repay) {
		this.repay = repay;
	}

	/**
	 * @return the expiryDate
	 */
	public int getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(int expiryDate) {
		this.expiryDate = expiryDate;
	}

	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return email + ", " + loanCode + ", " + progress + ", " + interestRate + ", " + repayType + ", " + loanType
				+ ", " + loanMoney + ", " + loanDate + ", " + repay + ", " + expiryDate + ", " + balance;
	}

	
	
}
