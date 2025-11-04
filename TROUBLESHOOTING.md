# 애플리케이션 시작 오류 해결 가이드

## 문제: 애플리케이션이 시작되지 않음

### 1단계: Docker 컨테이너 확인

**PowerShell에서 실행:**
```powershell
docker ps
```

`cogirihub-postgres` 컨테이너가 보이지 않으면:

```powershell
# 기존 컨테이너 확인 (중지된 것도 포함)
docker ps -a

# 컨테이너가 있으면 시작
docker start cogirihub-postgres

# 컨테이너가 없으면 생성
docker run -d --name cogirihub-postgres -e POSTGRES_DB=cogirihub -e POSTGRES_USER=cogirihub -e POSTGRES_PASSWORD=12341234 -p 5432:5432 -v postgres_data:/var/lib/postgresql/data postgres:15
```

### 2단계: PostgreSQL 준비 상태 확인

컨테이너를 시작한 후 5-10초 기다린 다음:

```powershell
# 로그 확인
docker logs cogirihub-postgres
```

**확인할 메시지:**
```
database system is ready to accept connections
```

### 3단계: 데이터베이스 연결 테스트

```powershell
docker exec -it cogirihub-postgres psql -U cogirihub -d cogirihub -c "SELECT version();"
```

성공하면 PostgreSQL이 정상 작동 중입니다.

### 4단계: 포트 확인

다른 애플리케이션이 5432 포트를 사용 중인지 확인:

```powershell
netstat -ano | findstr :5432
```

### 5단계: 애플리케이션 실행

모든 확인이 완료되면:

```powershell
.\gradlew.bat bootRun
```

### 6단계: 오류 로그 확인

애플리케이션 실행 후 콘솔에서 다음 오류를 확인:
- `JDBCConnectionException` → 데이터베이스 연결 실패
- `The connection attempt failed` → Docker 컨테이너 문제
- `Port already in use` → 포트 충돌

## 빠른 해결 방법

**컨테이너 완전 재시작 (모든 데이터 삭제):**
```powershell
docker rm -f cogirihub-postgres
docker volume rm postgres_data
docker run -d --name cogirihub-postgres -e POSTGRES_DB=cogirihub -e POSTGRES_USER=cogirihub -e POSTGRES_PASSWORD=12341234 -p 5432:5432 -v postgres_data:/var/lib/postgresql/data postgres:15
```

**10초 대기 후 애플리케이션 실행:**
```powershell
.\gradlew.bat bootRun
```

