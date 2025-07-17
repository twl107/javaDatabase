select * from test1;

show databases;

show tables;

select * from test1;

-- 테이블 생성
create table test1(
	name varchar(20)	not null,
	age int default 20,
	birthday datetime now(),
	job char(6),
	gender char(2) default '여자',
	address varchar(10) default '서울'
);



-- 테이블 구조보기
desc busan;		/* test1테이블 구조보기 */

create table busan (
	idx int not null auto_increment,	/* idx 자동증가 설정 */
    name varchar(20) not null,
    age int,
	primary key(idx)
);

insert into busan (name, age) values ('홍길동',30);
insert into busan values (default,'김말숙',20);
insert into busan values (default,'이기자',22);
insert into busan values (default,'오나라',24);
insert into busan values (default,'김연아',27);
insert into busan values (default,'강감찬',23);
insert into busan values (default,'소나무',32);
insert into busan values (default,'이하늘',33);
insert into busan values (default,'대나무',42);
insert into busan values (default,'감나무',37);
insert into busan values (default,'고인돌',42);

select * from busan;

-- 필드 추가(add column column)
alter table busan add column job char(10);
desc busan;

-- 필드 속성 변경(modify column)
alter table busan modify column job char(15);

-- 필드명 변경(change column)
alter table busan change column job work varchar(20);

-- 필드 삭제(drop colomn)
alter table busan drop column work;

select * from test1;

-- test1 테이블에 성별필드(gender : char(2) default '여자') 추가
alter table test1 add column gender char(2) default '여자';
alter table test1 add column address varchar(10) default '서울';

insert into test1 values ('강순식나',40,default,'',default,'제주');
insert into test1 values ('순식나',default,default,'',default,'제주');
insert into test1 values ('나순식',default,default,'',default,'청주');
insert into test1 values ('홍나순',default,default,'',default,'제주');
insert into test1 values ('홍길순',default,default,'',default,'청주');
insert into test1 values ('아톰',default,default,'',default,'청주');
insert into test1 values ('비톰',33,'2022-9-20','회사원','남자','서울');
insert into test1 values ('씨톰',55,2020-3-3,'학생',default,'청주');
insert into test1 values ('디톰',39,default,'장군','남자','서울');
insert into test1 values ('이톰',43,default,'','남자','서울');

select * from test1 where name = '홍길동';
select * from test1 where name = '홍길';
select * from test1 where gender = '남자';
select * from test1 where age < 30;
select * from test1 where age>=30 and age < 40;
select * from test1 where address = '청주';
select * from test1 where job = '회사원';
select * from test1 where job = '회사원' or job = '장군';
select * from test1 where job = '장군' and age < 30;
select * from test1 where gender = '여자';
select * from test1 where gender = '여자' and address = '서울';
select * from test1 where birthday < '2000-1-1';
select * from test1 where birthday >= '2025-1-1' and birthday <= '2025-12-31';
select * from test1 where job = '회사원' and gender='남자';
select * from test1 where name like '홍%';
select * from test1 where name like '%나%';
select * from test1 where name like '%나%' and address = '청주';
select distinct * from test1 where name like '%톰';
select * from test1 where age >= 30 and age <40;
select * from test1 where age between 30 and 40;
select * from test1 where address='제주' or address='청주';
select * from test1 where address in('부산','서울');

select name,age,address from test1 where address in('부산','서울');
select name as 이름,age as 나이,address as 주소 from test1 where address in('부산','서울');

-- update 테이블 set 필드명 = '변경할값' where 조건식;
-- 이기자의 주소를 '부산'으로 변경
update test1 set address = '부산' where name = '이기자';

-- 나이가 20대인 자료?
select * from test1 where age between 20 and 29 and address = '서울';

-- 나이가 20대 서울인 자료에 대하여 성별을 '남자'로 변경?
update test1 set gender = '남자' where age between 20 and 29 and address = '서울';

-- 나이가 20대 서울인 자료에 대하여 나이를 1살씩 추가한다?
update test1 set age = age+1 where age between 20 and 29 and address = '서울';

-- 서울에 사는 직업이 '장군' 보여주시오.
select * from test1 where address = '서울' and job = '장군';

-- delete from 테이블명 where 조건식;
-- 서울에 사는 직업이 '장군'인 자료를 삭제하시오.
delete from test1 where address = '서울' and job = '장군';

rename table test2 to test1;

show tables;

select * from test1;


-- 성명 오름차순 정렬?
select * from test1 order by name;

-- 나이 내림차순 정렬?
select * from test1 order by age desc;

-- 성별 오름차순?
select * from test1 order by gender;

-- 성별 오름차순, 성별이 같으면 나이가 많은 사람순으로...?
select * from test1 order by gender, age desc;

-- 5명만 출력 limit
select * from test1 where address = '서울' limit 5;