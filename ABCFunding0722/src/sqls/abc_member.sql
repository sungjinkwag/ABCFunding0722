--drop table abc_member;
create table abc_member(
  email varchar2(51),
  pwd varchar2(20) not null,
  name varchar2(12) not null,
  birth varchar2(8) not null,
  gender varchar2(4) not null,
  credit_rating number(1) not null,
  loan_count number not null,
  invest_count number not null,
  grade number(1) not null,
  auth_code varchar2(50) not null
);

alter table abc_member
add constraint pk_member_email primary key(email);

comment on column abc_member.email is 'ȸ���� �̸����̸� �� 51���� ���������� ���� �⺻Ű�Դϴ�.';
comment on table abc_member is 'ũ���� �ݵ� ȸ�� ���̺��Դϴ�.';
comment on column abc_member.name is 'ȸ���� �̸��Դϴ�. �ѱ۷� �ִ� 6���Դϴ�.';
comment on column abc_member.pwd is 'ȸ���� ��й�ȣ�Դϴ�. ���ҹ��� �� ���ڸ� �����Ͽ� �ִ�20���Դϴ�.';
comment on column abc_member.birth is 'ȸ���� ��������Դϴ�. ���б�ȣ ���� �ٿ��� �� 8���Դϴ�.';
comment on column abc_member.gender is 'ȸ���� �����Դϴ�. �ѱ۷� 2���̸�, ���� �Ǵ� ���ڰ��� �����ϴ�..';
comment on column abc_member.credit_rating is 'ȸ���� �ſ����Դϴ�. 1~9���� �ý��ۿ��� �ڵ����� �ο��˴ϴ�.';
comment on column abc_member.loan_count is 'ȸ���� ����Ǽ��Դϴ�. 0�̻��� ������ �����ϴ�.';
comment on column abc_member.invest_count is 'ȸ���� ���ڰǼ��Դϴ�. 0�̻��� ������ �����ϴ�.';
comment on column abc_member.grade is 'ȸ���� ����Դϴ�. 1�� �Ϲ�ȸ��, 2�� �������̸� �⺻���� 1�Դϴ�.';
comment on column abc_member.auth_code is 'ȸ�������� ���� �̸��� �����ڵ��Դϴ�.';