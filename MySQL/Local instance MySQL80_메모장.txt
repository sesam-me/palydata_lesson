-- 예습 : join transaction 정규화 trigger procedure


-- 유저생성
-- CREATE USER 'playdata'@'*' identified by '1q2w3e4r!!';
use mysql;
select * from user;

-- 유저삭제
-- use mysql; 
-- DELETE FROM UstudentstudentSER WHERE user = "test" and host = "localhost";

-- user
CREATE USER 'test'@'%' identified by '1q2w3e4r';

-- 권한 DCL Data control Language 권한 주고 뺏기
grant all privileges on test.* to 'test'@'localhost';
flush privileges;
-- create 변경가능 :  insert, select 등등 권한주기 부분 설정 가능
revoke create on test.* from 'test'@'%'; 
-- 비밀번호 변경
SET password for 'test'@'%' = "1q2w3e4r!!";


-- ----------------- 유저만들기
-- user name : playdata
CREATE USER 'playdata'@'localhost' identified by '1q2w3e4r!!';
create database test1;
-- playdata가 test1에 있는 모든 권한을 줌
grant all privileges on test1.* to 'playdata'@'localhost';
flush privileges;




-- safe모드 끄기
SET sql_safe_updates=0;

show databases;
create database test; -- test 폴더 생성
use test; -- test에 들어가기
show tables; -- 행제목 보여줌

create table students(
name varchar(255), -- string 대신 -> varchar(글자수)
age int,
major varchar(255)
);

drop table students;

-- insert into 테이블_명(내가 넣고 싶은 필드명들을 넣고) --괄호() 생략하면 전체를 넣고싶을 때
-- values (필드대도);
insert into students
values("골드", 20, "전기");

-- select 내가 보고 싶은 필드들(전체는 *) 입력 from 테이블이름
select * from students;
delete from students;

-- update 테이블_명
-- set 내가 바꿀 필드명 = value  : 값을 바꿈 
update students
set name = "맥북"; 

-- create drop alter : DDL 데이터 정의어
-- 테이블 데이터베이스를 정의하고 수정하는 명령어

-- insert delete update select : DML 데이터 조작어
-- 







-- 유저 생성
-- CREATE USER 'test'@'localhost' identified by '1q2w3e4r!!';

-- select * from USER;

-- 유저 삭제 
-- use mysql;
-- DELETE FROM USER WHERE user="test" and host = "localhost";


-- ----------------------- 문제1
create table academy(
name varchar(255),
locationx float,
locationy float,
master varchar(233)
);

insert into academy
values("플레이데이터", 37.1, 127.01, "우용");
insert into academy
values("플레이데이터2", 37.1, 127.01, "은혜");

select * from academy;


