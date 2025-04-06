# Q1. 숫자관련 함수 사용
-- 2의 3제곱
SELECT pow(2,3) AS "2^3"
FROM dual;

-- 8 나누기 3의 나머지
SELECT mod(8, 3);

-- 최대값, 최솟값,
SELECT greatest(8,17,30,44,89), least(2147,20,52,73,0);

-- 반올림
SELECT round(3.1415925358979), round(3.1415925358979, 0), round(3.1415925358979, 1), round(3.1415925358979, 2), round(3.1415925358979,3);

# Q2. 문자 관련 함수
-- 아스키 코드값 얻기 (대전3반 김규민 배짱왕)
SELECT ascii('0'), ascii('A'), ascii('a');

-- concat 메서드를 써보자.
SELECT concat(ename, '님 반갑습니다.') AS 인사말
FROM emp;

-- 이름의 길이가 5인 직원의 이름을 조회
SELECT ename
FROM emp
WHERE length(ename) = 4;

SELECT length('김싸피'), char_length('김싸피');

SELECT length('😊'), char_length('😊');

-- 문자열 변경
SELECT replace('Hello abc abc', 'abc', 'ssafy');

-- 문자열 인덱스 (1부터 시작)
SELECT instr('Hello SSAFY', "SSAFY");

-- 모든 직원의 이름 3자리조회
SELECT substr(ename, 1, 3)
FROM emp;


-- LPAD RPAD
SELECT lpad('SSAFY', 10, '*'), rpad('SSAFY', 3, '*');

-- REVERSE
SELECT reverse('Hello SSAFY!');


# Q3. 날짜 관련함수
-- 2초 더하기
SELECT addtime('2025-03-18 10:48:29', '2');

-- 날짜차이
SELECT datediff("2026-01-07", "2025-03-18");


-- 오늘은?
SELECT now(), day(now()), month(now()), year(now()), yearweek(now());


# Q4. 트랜잭션 사용해보기
-- 오토커밋 이제 부터 안한다...
SET autocommit = 0;

USE ssafy;

CREATE TABLE test_table(val VARCHAR(20));

START TRANSACTION;
INSERT INTO test_table VALUES ('A');
INSERT INTO test_table VALUES ('B');
INSERT INTO test_table VALUES ('C');
INSERT INTO test_table VALUES ('D');
INSERT INTO test_table VALUES ('E');
ROLLBACK;

SELECT * FROM test_table;

-- 커밋
START TRANSACTION;
INSERT INTO test_table VALUES ('S');
INSERT INTO test_table VALUES ('S');
INSERT INTO test_table VALUES ('A');
INSERT INTO test_table VALUES ('F');
INSERT INTO test_table VALUES ('Y');

COMMIT;















