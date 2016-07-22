create table abc_loan(
	loan_code number not null,
	email varchar2(51) not null,
	progress varchar2(12) not null,
	current_money number(4) not null,
	join_count number not null,
	round number(2) not null,
	
	employ_type varchar2(12) not null,
	scale varchar2(8) not null,
	serve number(2) not null,
	salary number(7) not null,
	
	loan_type varchar2(12) not null,
	repay_type varchar2(14) not null,
	interest_rate number(1) not null,
	loan_money number(8) not null,
	loan_date number(2) not null,
	repay number(2) not null,
	
	title varchar2(100) not null,
	fname varchar2(4000) not null,
	intro varchar2(4000) not null,
	expiry_date number(1) not null
);

alter table abc_loan
add constraint pk_loan_code primary key(loan_code);

alter table abc_loan
add constraint fk_loan_email foreign key(email) references abc_member(email);

create sequence seq_loan;

comment on table abc_loan is '������� ���̺��Դϴ�.';
comment on column abc_loan.loan_code is '�����ǰ�� �ĺ��� �����ڵ��Դϴ�.';
comment on column abc_loan.email is '� ȸ���� �����ǰ������ �ĺ��ϴ� ����Ű�Դϴ�.';
comment on column abc_loan.progress is '������ ������¸� ��Ÿ���ϴ�. �ݵ�������,�ݵ��Ϸ�,��ȯ��,��ȯ�ϷḦ ��Ÿ���ϴ�. �ѱ۷� �ִ�6���Դϴ�.';
comment on column abc_loan.current_money is '���� ���ڵ� �ݾ��� ��Ÿ���ϴ�. 0�̻��� �����Դϴ�.';
comment on column abc_loan.join_count is '���� ������ ������ ���Դϴ�. 0�̻��� �����Դϴ�.';
comment on column abc_loan.round is '���� ȸ�� ���� ��Ÿ���ϴ�. 0�̻��� �����Դϴ�.';
comment on column abc_loan.employ_type is '������¸� ��Ÿ���ϴ�. �ѱ۷� �ִ�6���Դϴ�.';
comment on column abc_loan.scale is 'ȸ��Ը��̸� �ѱ۷� �ִ� 4���Դϴ�.';
comment on column abc_loan.serve is '�����Ⱓ�̸� 0�̻��� ���� 2���Դϴ�.';
comment on column abc_loan.salary is '������ ��Ÿ���� 0�̻��� ���� 7���Դϴ�.';
comment on column abc_loan.loan_type is '���ⱸ���̸� ���νſ����� �����Դϴ�.';
comment on column abc_loan.repay_type is '��Ȳ����̸� �����ݱյ��ȯ���� �����Դϴ�.';
comment on column abc_loan.interest_rate is '�ݸ��̸� 8�� �����Դϴ�.';
comment on column abc_loan.loan_money is '�����û�ݾ��̸� 0�̻��� ���� 8��, �ִ� 5000���Դϴ�.';
comment on column abc_loan.loan_date is '����Ⱓ�̸� ���� 2�ڸ�, 1~12,18,24 �� �ϳ��� �����ϴ�.';
comment on column abc_loan.repay is '��ȯ���̸� ���� 2�ڸ�, 1,5,10,15,20,25 �� �ϳ��� �����ϴ�.';
comment on column abc_loan.title is '��ǰ��(����)�̸� �ѱ۷� 50�ڱ����Դϴ�.';
comment on column abc_loan.fname is '�̹��� ����̸� 4000byte���� �����մϴ�.';
comment on column abc_loan.intro is '�Ұ����̸� 4000byte���� �����մϴ�.';
comment on column abc_loan.expiry_date is '�ݵ��Ⱓ�̸� �ݵ� �� ������ �� �ִ� �ִ� �Ⱓ�� �ǹ��մϴ�. 1~7������ ����, �ִ� �������Դϴ�.';
