package com.abcfund.util;

import java.util.Random;

/**
 * ABC �ݵ��� ����ϴ� ��ƿ Ŭ����
 * ������� �ʰ� Ŭ����(static) �޼��常�� ���
 * @author 9age
 *
 */
public final class ABCUtility {
	/**
	 * ������ �ڸ�����ŭ ������ �����ϴ� �޼���
	 * @param count ������ ������ �ڸ���
	 * @return ������ ����
	 */
	public static String randomNumber(int count) {
		// ���� ������
		Random random = 
			new Random((long)(Math.random()*System.currentTimeMillis()));
		
		// ���� ���̱�
		StringBuilder randNum = new StringBuilder();
		for(int idx = 0; idx < count; idx++) {
			randNum.append(random.nextInt(10));
		}
		
		return randNum.toString();
	}
}
