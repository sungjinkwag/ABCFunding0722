--drop table abc_invest_transaction;
--drop sequence seq_invest_transaction;

create table abc_invest_transaction(
	invest_transaction_seq number not null,
	invest_seq number not null,
	intend_profit number not null,
	total_collect number not null,
	stack_collect number not null,
	progress varchar2(12) not null,
	collect_rate number(3) not null,
	round number(2) not null
);

create sequence seq_invest_transaction;

alter table abc_invest_transaction add(
	constraint pk_invest_transaction_seq primary key(invest_transaction_seq),
	constraint fk_invest_seq foreign key(invest_seq) references abc_invest(invest_seq)
);

comment on table abc_invest_transaction is '���ڿ� ���õ� ���� ���̺��Դϴ�.';
comment on column abc_invest_transaction.invest_transaction_seq is '���ڳ��� ���̺��� �ĺ��ϴ� �⺻Ű�Դϴ�.';
comment on column abc_invest_transaction.invest_seq is '��� ���� ���̺��� ���������� �ĺ��ϴ� ����Ű�Դϴ�.';
comment on column abc_invest_transaction.intend_profit is '���� ���ͱ��Դϴ�. ���ڱݿ� ���� ���ͷ�0.06�� ���� ���Դϴ�.';
comment on column abc_invest_transaction.total_collect is '�� ȸ�����Դϴ�. ���ڱݿ� �������ͱ��� ���� ���Դϴ�.';
comment on column abc_invest_transaction.stack_collect is '����ȸ�����Դϴ�. �� ȸ����/����Ⱓx��ȸ������ ����� ���Դϴ�.';
comment on column abc_invest_transaction.progress is '��ȯ�����Ȳ�Դϴ�. �ִ� �ѱ�6���Դϴ�.';
comment on column abc_invest_transaction.collect_rate is 'ȸ�������Դϴ�. ����ȸ������ ��ȸ�������� ���� ���Դϴ�.';
comment on column abc_invest_transaction.round is '����ȸ�����̸� 0�̻��� ���� �ִ� 2�ڸ��Դϴ�.';