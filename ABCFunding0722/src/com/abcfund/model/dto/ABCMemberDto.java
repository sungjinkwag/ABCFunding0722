package com.abcfund.model.dto;

import java.io.Serializable;

/**
 * @author 9age
 *
 */
public class ABCMemberDto implements Serializable {
	private static final long serialVersionUID = -2375416330944745782L;
	
	/** ȸ�� �̸��� */
	private String email;
	
	/** ȸ�� �̸��� ���ڸ� */
	private String email1;
	
	/** ȸ�� �̸��� ���ڸ� */
	private String email2;
	
	/** 
	 * ȸ�� ��й�ȣ
	 * ������ҹ���, ����, Ư������ ������ 6~20�ڱ��� 
	 */
	private String pwd;
	
	/**
	 * ȸ�� �̸�
	 * �ѱ� 6�ڱ���
	 */
	private String name;
	
	/**
	 * ȸ�� �������
	 * �����ھ��� �� 8�ڸ�
	 */
	private String birth;
	
	/** ȸ�� ���⵵ */
	private String year;
	
	/** ȸ�� ���� */
	private String month;
	
	/** ȸ�� ���� */
	private String day;
	
	/**
	 * ȸ�� ����
	 * ���� �Ǵ� ����
	 */
	private String gender;
	
	/**
	 * ȸ�� �ſ���
	 * 1~9����
	 */
	private int creditRating;
	
	/**
	 * ����Ǽ�
	 * 0�̻��� ����
	 */
	private int loanCount;
	
	/**
	 * ���ڰǼ�
	 * 0�̻��� ����
	 */
	private int investCount;
	
	/**
	 * ȸ�� ���
	 * �Ϲ�ȸ���� 1, �����ڴ� 2
	 * �⺻�� 1
	 */
	private int grade;
	
	/**
	 * ȸ�������� ���� �̸��� �����ڵ�
	 */
	private String authCode;

	/**
	 * �ƹ��͵� ���� �⺻������
	 */
	public ABCMemberDto() {}

	/**
	 * @param email ��ü �̸���
	 * @param email1 �̸��� ���ڸ�
	 * @param email2 �̸��� ���ڸ�
	 * @param pwd ��й�ȣ
	 * @param name �̸�
	 * @param birth �������
	 * @param year ����
	 * @param month ����
	 * @param day ����
	 * @param gender ����
	 * @param creditRating �ſ���
	 * @param loanCount ����Ǽ�
	 * @param investCount ���ڰǼ�
	 * @param grade ȸ�����
	 */
	public ABCMemberDto(String email, String email1, String email2, String pwd, String name, String birth, String year,
			String month, String day, String gender, int creditRating, int loanCount, int investCount, int grade) {
		super();
		this.email = email;
		this.email1 = email1;
		this.email2 = email2;
		this.pwd = pwd;
		this.name = name;
		this.birth = birth;
		this.year = year;
		this.month = month;
		this.day = day;
		this.gender = gender;
		this.creditRating = creditRating;
		this.loanCount = loanCount;
		this.investCount = investCount;
		this.grade = grade;
	}

	/**
	 * email1�� email2�� ���� �־�� �Ѵ�.
	 * @return the email
	 */
	public String getEmail() {
		if(email==null)
			email = email1 + "@" + email2;
		return email;
	}

	/**
	 * @return the email1
	 */
	public String getEmail1() {
		return email1;
	}

	/**
	 * @return the email2
	 */
	public String getEmail2() {
		return email2;
	}

	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * year, month, day�� ���� �־�� ��.
	 * @return the birth
	 */
	public String getBirth() {
		if(birth==null)
		birth = year + month + day;
		return birth;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @return the month
	 */
	public String getMonth() {
		return month;
	}

	/**
	 * @return the day
	 */
	public String getDay() {
		return day;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @return the creditRating
	 */
	public int getCreditRating() {
		return creditRating;
	}

	/**
	 * @return the loanCount
	 */
	public int getLoanCount() {
		return loanCount;
	}

	/**
	 * @return the investCount
	 */
	public int getInvestCount() {
		return investCount;
	}

	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * @return the authCode
	 */
	public String getAuthCode() {
		return authCode;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param email1 the email1 to set
	 */
	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	/**
	 * @param email2 the email2 to set
	 */
	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(String month) {
		this.month = month;
	}

	/**
	 * @param day the day to set
	 */
	public void setDay(String day) {
		this.day = day;
	}

	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param birth the birth to set
	 */
	public void setBirth(String birth) {
		this.birth = birth;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @param creditRating the creditRating to set
	 */
	public void setCreditRating(int creditRating) {
		this.creditRating = creditRating;
	}

	/**
	 * @param loanCount the loanCount to set
	 */
	public void setLoanCount(int loanCount) {
		this.loanCount = loanCount;
	}

	/**
	 * @param investCount the investCount to set
	 */
	public void setInvestCount(int investCount) {
		this.investCount = investCount;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	/**
	 * @param authCode the authCode to set
	 */
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ABCMemberDto [email=" + email + ", email1=" + email1 + ", email2=" + email2 + ", pwd=" + pwd + ", name="
				+ name + ", birth=" + birth + ", year=" + year + ", month=" + month + ", day=" + day + ", gender="
				+ gender + ", creditRating=" + creditRating + ", loanCount=" + loanCount + ", investCount="
				+ investCount + ", grade=" + grade + "]";
	}
	
	
}