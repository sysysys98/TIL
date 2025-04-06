USE `ssafy_corporation`;

# Q1. 카타시안 곱 
select empno, ename, job from emp;

# Q2. 사번 7788인 사원의 이름, 업무, 부서번호, 부서이름 조회

-- INNER JOIN 키워드 사용해보자.
SELECT *
FROM emp
INNER JOIN dept
ON emp.DEPTNO = dept.DEPTNO
WHERE EMPNO = 7788;

-- using
SELECT ename, job, deptno, dname
FROM emp
INNER JOIN dept
USING (deptno) -- deptno라는 요소가 emp에도 dept에도 있다라고 미리 말해줌
-- 이렇게 하면 두 테이블에 중복되는 요소가 있어도 오류나지 않음(아니면 as로 어느 테이블의 요소 갖고올건지 명시를해주거나)
WHERE empno = 7788;

-- OUTER JOIN
# 부서 없는 직원 한 명 고용
INSERT INTO emp
VALUES (7777, "유아름", "MANAGER", 7839, "2025-03-19", 10000, null, null);

SELECT ename, emp.deptno, dept.dname
FROM emp, dept
WHERE emp.deptno = dept.deptno;

-- 한쪽 테이블을 기준을 두고 쓰겠다
SELECT ename, emp.deptno, dept.dname
FROM emp
LEFT OUTER JOIN dept -- outer 빼고 걍 left라고 써도 데이터는 잘 나오긴 함 그냥 이게 정석일 뿐
on emp.deptno = dept.deptno;

SELECT ename, dept.deptno, dept.dname
FROM emp
RIGHT OUTER JOIN dept
on emp.deptno = dept.deptno;

-- 셀프 조인
# 모든 사원의 이름, 매니저 번호, 매니저 이름 갖고오기
SELECT e1.empno, e1.ename, e1.mgr, e2.ename
FROM emp e1, emp e2
WHERE e1.mgr = e2.empno;
-- inner join으로도 위는 가능하다!emp

-- 근데 위처럼 하면 king이 안 나옴(매니저가 없어서)
-- 그럼 아우터조인하면됨
SELECT e1.empno, e1.ename, e1.mgr, e2.ename
FROM emp e1
LEFT OUTER JOIN emp e2
ON e1.mgr = e2.empno;

-- 비 동등 조인(Non-Equi JOIN)
SELECT e.empno, e.ename, e.sal, sg.grade
FROM emp e, selgrade sg
WHERE e.sal BETWEEN sg.losal and sg.hisal
