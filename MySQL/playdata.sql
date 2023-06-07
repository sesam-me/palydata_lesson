SET sql_safe_updates=0;
drop table student;

use test1;
drop table student;

-- #primary key
-- 고유한 값을 같은 식별 id
-- null X, 중복 X
-- key값이 있기 때문에 빠른 조회 가능

-- #unique key
-- null O (primary key와 차이점)-> null값은 중복 가능, 중복 X
-- "null" 은 null과 다름 

-- #auto_increment
-- 자동으로 primary key를 증가하면서 넣어줌
create table student(
id int primary key auto_increment, -- #primary key #auto_increment
name varchar(255) unique key  -- #unique key
, age int
,major varchar(255)
,birth date
);

select * from student; -- student table 보기
desc student; -- table 정보를 보고 싶을 때

-- 이렇게 data변경하는 건 사용하고 삭제하는게 좋음 ->왜? 데이터가 변경되는 실수?를 할 수 있기때문에
update student
set age = age + 1;

insert into student(name, major, birth)
values("브론즈", "컴공", "2020-06-01"); -- major에 "컴공,경제학" 콤마를 넣어서 하는 건 좋지 않음.
insert into student(name,major, birth)
values("골드", "컴공", "2020-05-21");
insert into student(name,major, birth)
values("실버", "컴공", "2020-05-22");
insert into student(name,major, birth)
values("레드", "컴공", "2020-06-03");
insert into student(name,major, birth)
values("그린", "환경", "2020-06-03");
insert into student(name,major, birth)
values("떱디", "환경", "2020-06-03");
insert into student(name,major, birth)
values("전기", "기계", "2020-06-03");
insert into student(name,major, birth)
values("화학", "화학", "2020-06-03");
insert into student(name,major, birth)
values("그린", "환경", "2020-06-03");


-- # 문제. 컴공을 맨위로 올려라
select
	id, name, age, major, birth
from
	(SELECT
		*, if(major="컴공",1,0) as is컴공
	FROM
		student) as 1
	ORDER BY is컴공 desc;
    
select *
from student
case
	when major = "컴공" then 2
	when major = "기계" or major = "전기" then 1
	when major = "화학" then 0.1
	else 0
end as point 
oder by potin desc;


-- #과별 인원
-- id가 1인 전공의 개수를 세라(id는 고유값이니 count는 1임)
select id, major, count(major) 
from student
-- 순서 1. where 먼저
-- 1=1 : true라는 뜻으로, 모두 나오게 하라는 뜻임
where 1=1 
-- 순서 2. group by
group by major, id
-- 순서 3. order by
-- order by 1 : true라는 뜻으로 모든 값을 보려고 한 것임?
order by 1;


select *
from student
where name = 8 or 1=1;





select * from student;
select *, substr(now(),1,4) - substr(birth,1,4) as age from student where age >2 order by birth desc, name, major desc; -- asc desc 
update student set age = substr(now(),1,4) - substr(birth,1,4);

-- # 6월생만 뽑아라
select * from student
where "06" = substr(birth, 6,2);

select * from student
where birth >= "2020-06-01";













select * from student 
where major != "컴공" or age = 21 or magor is not null; -- where는 조건 : null은 is null 이렇게 넣어야함

select * from student
where major = "자연인" limit 1, 2; -- 1번째부터 2번째까지 보여줌

delete from student where id =3; -- id = 3번 삭제

-- 집계함수 : max min count sum avg / 집계함수는 데이터용량이 클 때 쓰면 안됨! 꺼질 수도 있음
select sum(age) from student; -- 나이 합계
select count(*) from student; -- 멸출 있냐
select avg(age) from student; -- 평균
select max(age) from student;


-- #alter table
alter table student add column adult boolean;
desc student; -- adult가 추가 되었는지 확인

alter table student drop column adult;
desc student; -- adult가 삭제 되었는지 확인

select * from student;

update student
set adult = 1 -- set adult = age>=20 도 가능함
where age>=20;

update student
set adult = 0
where age<20;

select *, age>=20 as isAdult, if(major="컴공","좀함","함") as talent from student; -- as 생략 가능, isAdult로 컬럼명 변경 가능  // 원본은 그대로고 보여주는 것만 추가함
select * from student;

select now();
select date_add(now(), interval 1 month); -- 한달 후
select now(), date_add(now(), interval 1 month), concat( "두 날짜 차이는 ",datediff(date_add(now(), interval 1 month), now()), "일 입니다.");

select *, ifnull(major, "비공개")
, concat( id , ", " , age)
, convert(id ,char(20)) as con
, cast(age AS char(20)) as ca
from student;

select cast(now() as date) as f;
select convert(now(), date) as f, substr(now(), 1, 10); -- substr : now()값을 1부터 10번째까지 자르겠다.(DB는 1부터 시작)





-- 6/7
select *
from student
where major in ("컴공","전기");

-- name 브론즈, 전기와 같은 과인 사람들을 찾으세요.
-- >> sub query
-- explain
SELECT 
    *
FROM
    student
WHERE
    major IN (SELECT 
            major
        FROM
            student
        WHERE
            name IN ('브론즈' , '전기'));
		
        
        
-- tcl : 트랜젝션 제어어
start transaction; -- safe point임, delete를 하기 전에 하면 좋음
-- delete from student;
select * from student;
rollback;
commit;


insert into student(name,major, birth)
values("화학1", "화학", "2020-06-03");

-- 제 1정규형(1NF)
-- 부분 종속

-- # 1 primary key
-- create table student(
-- id int primary key auto_increment, -- #primary key #auto_increment
-- name varchar(255) unique key  -- #unique key
-- , age int
-- ,major varchar(255)
-- ,birth date
-- );

-- #2 primary key
-- drop table student1;
create table student1(
id int ,
name varchar(255) unique key  -- #unique key
,age int
,major varchar(255) not null default "비공개" -- delault는 null임
,birth date
,create_date datetime default now()
,primary key(id, name) 
);



insert into student1 (id, name) values(1, "골드");
select * from student1;

drop table student1;
create table student1(
id int
,name varchar(255)
-- ,major varchar(255)
,create_date datetime default now()
,primary key(id, name) 
);

drop table majors;
create table majors(
student_id int,
major varchar(255),
primary key (student_id, major),
foreign key  (student_id) references student1(id) -- # foreign key : 참조하는 key에 id가 없으면 안들어감
);


drop table majors;
create table majors(
id int primary key auto_increment,
-- student_id int, 
major varchar(255)
-- primary key (student_id, major),
);


insert into student1 (id, name) values(1, "골드");
insert into student1 (id, name) values(2, "실버");
insert into student1 (id, name) values(3, "브론즈");
insert into student1 (id, name) values(4, "골론즈");
insert into majors (student_id, major) values(1, "기계");
insert into majors (student_id, major) values(1, "전기");
insert into majors (student_id, major) values(2, "컴공");
insert into majors (student_id, major) values(5, "컴공");

-- # 
select * from student1 as s, majors as m
where s.id = m.student_id;  -- 2개 테이블 한번에 출력
-- inner join과 결과가 같다. 하지만 이건 처음에 불러온느 쿼리가 student1을 모두 불러와서 시작하고
-- inner join은 3개만 불러오고 시작함 그래서 inner join이 더 좋을 것 같지만,,, DB가 알아서 처리해줘서 결론은 똑같이 처리함 ㅎ.ㅎ개취

-- # inner join
-- explain
select * from student1 as s
inner join majors as m -- # inner join 완전 겹치는 부분만 가져옴
on s.id = m.student_id; -- on : 조건 

-- # left join
-- explain
select * from student1 as s -- 여기가 left
left join majors as m -- left join : student1(left)을 기준으로 majors와 id 교집합 반환
-- on s.id = m.student_id -- on : 조건



-- 
create table student_major(
student_id int,
major_id int,
primary key(student_id, major_id),
foreign key(student_id) references student1(id),
foreign key(major_id) references majors(id)
);

select * from majors;
insert into majors (major) values ( "기계");
insert into majors (major) values ( "전기");
insert into majors (major) values ( "컴공");
insert into majors (major) values ( "환경");
insert into majors (major) values ( "법학");
select * from student1;
select * from majors;
select * from student_major;

insert into student_major values(1,1);
insert into student_major values(2,1);
insert into student_major values(1,3);


-- #방법1
select s.name, m.major from student1 as s
inner join student_major as sm on s.id = sm.student_id
inner join majors as m on m.id = sm.major_id;

-- # 방법2
select s.name, m.major from student_major as sm
inner join student1 as s on s.id = sm.student_id
inner join majors as m on m.id = sm.major_id;


 -- # ERD
 -- # EER Diagram - 1:1, n:m은 안쓰는게 나음
 
 -- 프로그래머 limit
 
 
 
 
 
 
 
 
 
 
 -- # like 
 -- 골씨를 뽑아라
 select *
 from student1
 where name like "골%"; -- 골씨를 찾겠다
 
  select *
 from student1
 where name like "골_";
 -- % : 글자수 상관없이 전체 찾겠다.
 -- _ : 글자수 지정하여 찾겠다.
 
 
 
 
create table student1_graduate(
id int 
,name varchar(255)
,create_date datetime default now()
,primary key(id)
);
select * from student1_graduate;
select * from student1;
insert into student1_graduate(id, name, create_date)
(select id, name, create_date from student1 where name ="골론즈");

-- 골론즈는 졸업생이니, 재학생 리스트에서 삭제alter
start transaction;
delete from student1 where name = "골론즈";
rollback;

-- delete from student1 where id = (select * from student1 where name = "골론즈" limit 1); -- 같은 테이블을 조회에서 삭제하려 함으로 에러
delete from student1 where id = (select * from (select id from student1 where name = "골론즈" limit 1 ) as o) ; -- safe모드가 되어 있을 경우


-- # union 합집합
select id, name, create_date from student1
union
select id, name, create_date from student1_graduate
order by id desc;

select * from student1;

-- # unionall
select id, name, create_date from student1
union all
select id, name, create_date from student1_graduate



-- # INDEX
create table student_major2(
student_id int,
major_id int,
primary key(student_id, major_id),
index a (major_id) -- a는 숨어져서 index?
);