create table abc_invest(
	invest_seq number not null,
	email varchar2(51) not null,
	loan_code number not null,
	invest_money number(4) not null
);

create sequence seq_invest;

alter table abc_invest add(
	constraint pk_invest_seq primary key(invest_seq),
	constraint fk_invest_email foreign key(email) references abc_member(email),
	constraint fk_invest_loan_code foreign key(loan_code) references abc_loan(loan_code)
);

comment on table abc_invest is '���ڰ��� ���̺��Դϴ�.';
comment on column abc_invest.invest_seq is '�������̺��� �ĺ��� �⺻Ű�Դϴ�.';
comment on column abc_invest.email is '� ȸ���� ���� ���ڵ����� �ĺ��ϴ� ����Ű�Դϴ�.';
comment on column abc_invest.loan_code is '� ������ ���� ���ڵ����� �ĺ��ϴ� ����Ű�Դϴ�.';
comment on column abc_invest.invest_money is '���ڱ��̸� 0�̻��� �����Դϴ�.';