create table abc_account(
	account_no varchar2(14) not null,
	email varchar2(51) not null,
	balance number not null,
	account_holder varchar2(12) not null,
	loan_code number
);

select * from abc_account;
alter table abc_account
add constraint pk_account_no primary key(account_no);

alter table abc_account
add constraint fk_account_email foreign key(email) references abc_member(email);

comment on table abc_account is 'ȸ���� ��������Դϴ�.';
comment on column abc_account.account_no is '���¹�ȣ�Դϴ�. ����3-����6����3 ������ �� 14�ڸ� �����ϴ�.';
comment on column abc_account.email is 'ȸ���� �̸����� �����ϴ� ����Ű�Դϴ�. � ȸ���� ���������� ��Ÿ���ϴ�.';
comment on column abc_account.balance is '��ġ��(�ܾ�)�Դϴ�. 0�̻��� ������ �����ϴ�.';
comment on column abc_account.account_holder is '�������Դϴ�. �ش� ���¸� ���� ȸ���� �̸��Դϴ�.';