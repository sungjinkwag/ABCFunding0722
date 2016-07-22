package com.abcfund.model.dto;

import java.io.Serializable;

/**
 * ȸ�����Խ� �ڵ����� �־����� ��������� Ŭ����
 * @author 9age
 */
public class ABCAccountDto implements Serializable {
	private static final long serialVersionUID = -3828036421861465715L;
	
	/** 
	 * ������¹�ȣ
	 * ����3-����6����3 ������ �� 14�� 
	 */
	private String accountNo;
	
	/**
	 * ������ ���������� �ĺ��� ȸ���� �̸���
	 */
	private String email;
	
	/**
	 * ��ġ��(�ܾ�)
	 */
	private int balance;
	
	/**
	 * ������(ȸ�� �̸�)
	 */
	private String accountHolder;

	/** �⺻ ������ */
	public ABCAccountDto() {}

	/**
	 * ��ü �����͸� �޴� ������
	 * @param accountNo ������¹�ȣ
	 * @param email ȸ���� �̸���
	 * @param balance ��ġ��
	 * @param accountHolder ȸ���� �̸�
	 */
	public ABCAccountDto(String accountNo, String email, int balance, String accountHolder) {
		this(accountNo, email, accountHolder);
		this.balance = balance;
	}
	
	/**
	 * ��ġ���� ������ ��� �����͸� �޴� ������
	 * @param accountNo
	 * @param email
	 * @param accountHolder
	 */
	public ABCAccountDto(String accountNo, String email, String accountHolder) {
		super();
		this.accountNo = accountNo;
		this.email = email;
		this.accountHolder = accountHolder;
	}

	/**
	 * @return the accountNo
	 */
	public String getAccountNo() {
		return accountNo;
	}

	/**
	 * @param accountNo the accountNo to set
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
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
	 * @return the accountHolder
	 */
	public String getAccountHolder() {
		return accountHolder;
	}

	/**
	 * @param accountHolder the accountHolder to set
	 */
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ABCAccountDto [accountNo=" + accountNo + ", email=" + email + ", balance=" + balance
				+ ", accountHolder=" + accountHolder + "]";
	}
}
