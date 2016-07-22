create table abc_member_manage(
  member_manage_seq number,
  email varchar2(51) not null,
  total_invest_count number,
  current_invest_count number,
  total_profit number,
  stack_invest_money number,
  total_loan_count number,
  current_loan_count number,
  stack_loan_money number,
  stack_repay number
);

alter table abc_member_manage
add constraint pk_member_seq primary key( member_manage_seq);

alter table abc_member_manage
add constraint fk_member_manage_email foreign key(email) references abc_member(email);

create sequence seq_member_mange;

comment on table abc_member_manage is '�����ڰ� �����ϴ� ȸ������ ���̺��Դϴ�.';
comment on column abc_member_manage.member_manage_seq is 'ȸ������ ���̺��� �ĺ��ϴ� �������Դϴ�.';
comment on column abc_member_manage.email is 'ȸ�� ���̺��� email �÷��� �����ϴ� ����Ű�Դϴ�. ȸ���������� �ΰ������� ȸ���� �����Ͱ� �ʿ��� �� ����մϴ�.';
comment on column abc_member_manage.total_invest_count is '�� ����Ƚ�� �Դϴ�. �� ȸ���� �� ���� Ƚ���� ��Ÿ���ϴ�. 0�̻��� ������ �����ϴ�.';
comment on column abc_member_manage.current_invest_count is '���� ���� �Ǽ��Դϴ�. ���� �󸶳� ���������� ��Ÿ���ϴ�. 0�̻��� ������ �����ϴ�.';
comment on column abc_member_manage.total_profit is '���ڸ� �ؼ� �󸶳� ���������� ��Ÿ���� �� ���ͱ��Դϴ�. 0�̻��� ������ �����ϴ�.';
comment on column abc_member_manage.stack_invest_money is '�󸶳� ���� �ߴ����� ��Ÿ���� �������ڱ��Դϴ�. 0�̻��� ������ �����ϴ�.';
comment on column abc_member_manage.total_loan_count is 'ȸ���� �� ���� �Ǽ��� ��Ÿ���ϴ�. 0�̻��� ������ �����ϴ�.';
comment on column abc_member_manage.current_loan_count is '���� �������� �Ǽ��� ��Ÿ���ϴ�. 0�̻��� ������ �����ϴ�.';
comment on column abc_member_manage.stack_loan_money is '�󸶳� �����ߴ����� ��Ÿ���� ����������Դϴ�. 0�̻��� ������ �����ϴ�.';
comment on column abc_member_manage.stack_repay is '���²� ��ȯ�� �ݾ��� ��ģ ������ȯ���Դϴ�. 0�̻��� ������ �����ϴ�.';