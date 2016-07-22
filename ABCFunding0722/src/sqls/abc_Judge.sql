create table abc_judge(
	judge_seq number not null,
	loan_code number not null,
	commentary varchar2(2000) not null,
	result number(1) not null
);

create sequence seq_judge;

alter table abc_judge add(
	constraint pk_judge_seq primary key(judge_seq),
	constraint fk_judge_loan_code foreign key(loan_code) references abc_loan(loan_code)
);

comment on table abc_judge is '�����û�� ���� �ɻ����̺��Դϴ�.';
comment on column abc_judge.judge_seq is '�ɻ����̺��� �ĺ��� �⺻Ű�Դϴ�.';
comment on column abc_judge.loan_code is '� ������ �ɻ��� �������� �ĺ��ϴ� ����Ű�Դϴ�.';
comment on column abc_judge.commentary is '�ɻ����Դϴ�. �ִ� 2000byte�Դϴ�.';
comment on column abc_judge.result is '�ɻ����Դϴ�. 0�̸� �ɻ���, 1�̸� ����, -1�̸� �����Դϴ�.';