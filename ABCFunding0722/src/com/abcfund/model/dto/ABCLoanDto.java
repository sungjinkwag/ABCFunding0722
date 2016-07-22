package com.abcfund.model.dto;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

/**
 * �����û ������ ��ƿ��� DTO Ŭ����
 * @author 9age
 *
 */
public class ABCLoanDto implements Serializable {
	private static final long serialVersionUID = 9200611464827898619L;

	/** �����ǰ�� �ĺ��� �����ڵ� */
	private int loanCode;
	
	/** ������ ������� 
	 * �ݵ�������,�ݵ��Ϸ�,��ȯ��,��ȯ�Ϸ�
	 * �ѱ۷� �ִ�6��
	 */
	private String progress;
	
	/**
	 * ���� ���ڵ� �ݾ�
	 * 0�̻��� ���� 
	 */
	private int currentMoney;
	
	/** 
	 * ���� ������ ������ ��
	 * 0�̻��� ����
	 */
	private int jointCount;
	
	/**
	 * ���� ȸ�� ��
	 * 0�̻��� ����
	 */
	private int round;
	
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
	 * ���� �ݸ�
	 * 8% ���� �ݸ�
	 */
	private int interestRate;
	
	/**
	 * ��ȯ���
	 * �����ݱյ���һ�Ȯ ������� ����
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
	 * �Ұ����� ����
	 */
	private MultipartFile uploadfile;
	
	/**
	 * �ݵ���û �Ⱓ
	 * �Է°��� �� : 1~7
	 * ������ ��
	 */
	private int expiryDate;

	/**
	 * �⺻ ������
	 */
	public ABCLoanDto() {}

	/**
	 * ��� �Ķ���͸� ������ ������
	 * @param loanCode �����ڵ�
	 * @param progress �������
	 * @param currentMoney ������� ������ �ݾ�
	 * @param jointCount ������� ������ �ο���
	 * @param round ���� ��ȯ ȸ����
	 * @param eamil ���� ��û���� �̸���
	 * @param name ���� ��û���� �̸�
	 * @param birth ���� ��û���� �������
	 * @param gender ���� ��û���� ����
	 * @param employType �������
	 * @param scale ȸ��Ը�
	 * @param serve �����Ⱓ
	 * @param salary ����
	 * @param interestRate ����ݸ�
	 * @param repayType �����ȯ���(�����ݱյ����)
	 * @param loanType ���ⱸ��(���νſ����)
	 * @param loanMoney �����û��
	 * @param loanDate �����û�Ⱓ
	 * @param repay �����ȯ��
	 * @param title �Ұ����� ����
	 * @param intro �Ұ����� ����
	 * @param fname �Ұ����� ���� �̸�
	 * @param uploadfile �Ұ����� ����
	 * @param expiryDate �ݵ������Ⱓ
	 */
	public ABCLoanDto(int loanCode, String progress, int currentMoney, int jointCount, int round, String email, String name,
			String birth, String gender, String employType, String scale, int serve, int salary, int interestRate,
			String repayType, String loanType, int loanMoney, int loanDate, int repay, String title, String intro,
			String fname, MultipartFile uploadfile, int expiryDate) {
		super();
		this.loanCode = loanCode;
		this.progress = progress;
		this.currentMoney = currentMoney;
		this.jointCount = jointCount;
		this.round = round;
		this.email = email;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.employType = employType;
		this.scale = scale;
		this.serve = serve;
		this.salary = salary;
		this.interestRate = interestRate;
		this.repayType = repayType;
		this.loanType = loanType;
		this.loanMoney = loanMoney;
		this.loanDate = loanDate;
		this.repay = repay;
		this.title = title;
		this.intro = intro;
		this.fname = fname;
		this.uploadfile = uploadfile;
		this.expiryDate = expiryDate;
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
	 * @return the currentMoney
	 */
	public int getCurrentMoney() {
		return currentMoney;
	}

	/**
	 * @param currentMoney the currentMoney to set
	 */
	public void setCurrentMoney(int currentMoney) {
		this.currentMoney = currentMoney;
	}

	/**
	 * @return the jointCount
	 */
	public int getJointCount() {
		return jointCount;
	}

	/**
	 * @param jointCount the jointCount to set
	 */
	public void setJointCount(int jointCount) {
		this.jointCount = jointCount;
	}

	/**
	 * @return the round
	 */
	public int getRound() {
		return round;
	}

	/**
	 * @param round the round to set
	 */
	public void setRound(int round) {
		this.round = round;
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
	 * @return the uploadfile
	 */
	public MultipartFile getUploadfile() {
		return uploadfile;
	}

	/**
	 * @param uploadfile the uploadfile to set
	 */
	public void setUploadfile(MultipartFile uploadfile) {
		this.uploadfile = uploadfile;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return loanCode + ", " + progress + ", " + currentMoney + ", " + jointCount + ", " + round + ", " + email + ", "
				+ name + ", " + birth + ", " + gender + ", " + employType + ", " + scale + ", " + serve + ", " + salary
				+ ", " + interestRate + ", " + repayType + ", " + loanType + ", " + loanMoney + ", " + loanDate + ", "
				+ repay + ", " + title + ", " + intro + ", " + fname + ", " + uploadfile + ", " + expiryDate;
	}

}
