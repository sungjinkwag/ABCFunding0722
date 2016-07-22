package com.abcfund.model.dto;

import java.io.Serializable;

/**
 * ������ ȭ�鿡�� �ɻ������� �������� DTO Ŭ����
 * @author 9age
 *
 */
public class ABCJudgeDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6341871635936761418L;

	/** �����ǰ�� �ĺ��� �����ڵ� */
	private int loanCode;
	
	/**
	 * ���� ��û���� ��û�ڵ�
	 */
	private int judgeSeq;
	
	/**
	 * ���� ��û���� �̸���
	 */
	private String email;
	
	/**
	 * ���� ��û���� �̸�
	 */
	private String name;
	
	/**
	 * ���� ��û���� �������
	 */
	private String birth;
	
	/**
	 * ���� ��û���� ����
	 */
	private String gender;
	
	/** ������ ������� 
	 * �ݵ�������,�ݵ��Ϸ�,��ȯ��,��ȯ�Ϸ�
	 * �ѱ۷� �ִ�6��
	 */
	private String progress;
	
	/**
	 * �������
	 * ������,��������,�Ƹ�����Ʈ,����
	 * �ѱ� �ִ� 6��
	 */
	private String employType;
	
	/**
	 * ȸ��Ը�
	 * ����,�߰߱��,�߼ұ��,��ŸƮ��
	 * �ѱ� �ִ� 4��
	 */
	private String scale;
	
	/**
	 * �����Ⱓ
	 * 0�̻��� 2�ڸ� ����
	 */
	private int serve;
	
	/**
	 * ����
	 * ������ ����
	 * 0�̻��� 7�ڸ� ����
	 */
	private int salary;
	
	/**
	 * ���ⱸ��
	 * ���νſ����� ����
	 */
	private String loanType;
	
	/**
	 * ��ȯ���
	 * �����ݱյ���һ�Ȯ ������� ����
	 */
	private String repayType;
	
	/**
	 * ���� �ݸ�
	 * 8% ���� �ݸ�
	 */
	private int interestRate;
	
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
	 * �Ұ����� ����
	 */
	private String title;
	
	/**
	 * �Ұ����� ����
	 */
	private String intro;
	
	/**
	 * �Ұ����� ���� �̸�
	 */
	private String fname;
	
	/**
	 * �ݵ���û �Ⱓ
	 * �Է°��� �� : 1~7
	 * ������ ��
	 */
	private int expiryDate;
	
	/**
	 * ���� ��û���� �ſ���
	 */
	private int creditRating;

	/**
	 * �⺻ ������
	 */
	public ABCJudgeDto() {}

	/**
	 * @param loanCode
	 * @param judgeSeq
	 * @param email
	 * @param name
	 * @param birth
	 * @param gender
	 * @param progress
	 * @param employType
	 * @param scale
	 * @param serve
	 * @param salary
	 * @param loanType
	 * @param repayType
	 * @param interestRate
	 * @param loanMoney
	 * @param loanDate
	 * @param repay
	 * @param title
	 * @param intro
	 * @param fname
	 * @param expiryDate
	 * @param creditRating
	 */
	public ABCJudgeDto(int loanCode, int judgeSeq, String email, String name, String birth, String gender,
			String progress, String employType, String scale, int serve, int salary, String loanType, String repayType,
			int interestRate, int loanMoney, int loanDate, int repay, String title, String intro, String fname,
			int expiryDate, int creditRating) {
		super();
		this.loanCode = loanCode;
		this.judgeSeq = judgeSeq;
		this.email = email;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.progress = progress;
		this.employType = employType;
		this.scale = scale;
		this.serve = serve;
		this.salary = salary;
		this.loanType = loanType;
		this.repayType = repayType;
		this.interestRate = interestRate;
		this.loanMoney = loanMoney;
		this.loanDate = loanDate;
		this.repay = repay;
		this.title = title;
		this.intro = intro;
		this.fname = fname;
		this.expiryDate = expiryDate;
		this.creditRating = creditRating;
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
	 * @return the judgeSeq
	 */
	public int getJudgeSeq() {
		return judgeSeq;
	}

	/**
	 * @param judgeSeq the judgeSeq to set
	 */
	public void setJudgeSeq(int judgeSeq) {
		this.judgeSeq = judgeSeq;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the birth
	 */
	public String getBirth() {
		return birth;
	}

	/**
	 * @param birth the birth to set
	 */
	public void setBirth(String birth) {
		this.birth = birth;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
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
	 * @return the employType
	 */
	public String getEmployType() {
		return employType;
	}

	/**
	 * @param employType the employType to set
	 */
	public void setEmployType(String employType) {
		this.employType = employType;
	}

	/**
	 * @return the scale
	 */
	public String getScale() {
		return scale;
	}

	/**
	 * @param scale the scale to set
	 */
	public void setScale(String scale) {
		this.scale = scale;
	}

	/**
	 * @return the serve
	 */
	public int getServe() {
		return serve;
	}

	/**
	 * @param serve the serve to set
	 */
	public void setServe(int serve) {
		this.serve = serve;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the intro
	 */
	public String getIntro() {
		return intro;
	}

	/**
	 * @param intro the intro to set
	 */
	public void setIntro(String intro) {
		this.intro = intro;
	}

	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
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
	 * @return the creditRating
	 */
	public int getCreditRating() {
		return creditRating;
	}

	/**
	 * @param creditRating the creditRating to set
	 */
	public void setCreditRating(int creditRating) {
		this.creditRating = creditRating;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return loanCode + ", " + judgeSeq + ", " + email + ", " + name + ", " + birth + ", " + gender + ", " + progress
				+ ", " + employType + ", " + scale + ", " + serve + ", " + salary + ", " + loanType + ", " + repayType
				+ ", " + interestRate + ", " + loanMoney + ", " + loanDate + ", " + repay + ", " + title + ", " + intro
				+ ", " + fname + ", " + expiryDate + ", " + creditRating;
	}
		
}
