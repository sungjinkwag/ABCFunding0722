--drop table abc_loan_transaction;
--drop sequence seq_loan_transaction;
create table abc_loan_transaction(
	loan_seq number not null,
	loan_code number not null,
	interest_money number not null,
	total_repay number not null,
	stack_repay number not null,
	progress varchar2(12) not null,
	collect_rate number(3) not null,
	round number(2) not null
);

create sequence seq_loan_transaction;

alter table abc_loan_transaction add(
	constraint pk_loan_seq primary key(loan_seq),
	constraint fk_loan_code foreign key(loan_code) references abc_loan(loan_code)
);

comment on table abc_loan_transaction is '���⿡ ���õ� ���� ���̺��Դϴ�.';
comment on column abc_loan_transaction.loan_seq is '���⳻���� �ĺ��� �⺻Ű�Դϴ�.';
comment on column abc_loan_transaction.loan_code is '� ������ �������� �ĺ��� ����Ű�Դϴ�.';
comment on column abc_loan_transaction.interest_money is '���ڱ��̸� ������� 8%�Դϴ�.';
comment on column abc_loan_transaction.total_repay is '�ѻ�ȯ���̸� ����� + ���ڱ��Դϴ�.';
comment on column abc_loan_transaction.stack_repay is '������ȯ��, ������� ��ȯ�� �ݾ��� �Ѿ��Դϴ�.';
comment on column abc_loan_transaction.progress is '��ȯ�����Ȳ�Դϴ�. �ִ� �ѱ�6���Դϴ�.';
comment on column abc_loan_transaction.collect_rate is 'ȸ�������Դϴ�. ������ȯ���� �ѻ�ȯ������ ���� ���Դϴ�.';
comment on column abc_loan_transaction.round is '����ȸ�����̸� 0�̻��� ���� �ִ� 2�ڸ��Դϴ�.';