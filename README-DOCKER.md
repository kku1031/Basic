# Docker 데이터베이스 설정 가이드

## PostgreSQL 컨테이너 실행

### 1. 도커 컨테이너 시작

**Linux/Mac (Bash):**
```bash
docker run -d \
  --name cogirihub-postgres \
  -e POSTGRES_DB=cogirihub \
  -e POSTGRES_USER=cogirihub \
  -e POSTGRES_PASSWORD=12341234 \
  -p 5432:5432 \
  -v postgres_data:/var/lib/postgresql/data \
  postgres:15
```

**Windows PowerShell:**
```powershell
docker run -d --name cogirihub -e POSTGRES_DB=cogirihub -e POSTGRES_USER=cogirihub -e POSTGRES_PASSWORD=12341234 -p 5432:5432 -v postgres_data:/var/lib/postgresql/data postgres:15
```

또는 PowerShell에서 백틱(`` ` ``) 사용:
```powershell
docker run -d `
  --name cogirihub-postgres `
  -e POSTGRES_DB=cogirihub `
  -e POSTGRES_USER=cogirihub `
  -e POSTGRES_PASSWORD=12341234 `
  -p 5432:5432 `
  -v postgres_data:/var/lib/postgresql/data `
  postgres:15
```

### 2. 컨테이너 상태 확인
```bash
docker ps
```

### 3. 데이터베이스 로그 확인
```bash
docker logs -f cogirihub-postgres
```

### 3-1. 컨테이너 내부 접속 (PostgreSQL CLI)
```bash
docker exec -it cogirihub-postgres psql -U cogirihub -d cogirihub
```

**Windows PowerShell:**
```powershell
docker exec -it cogirihub-postgres psql -U cogirihub -d cogirihub
```

**컨테이너 내부에서 직접 실행할 경우:**
```bash
psql -U cogirihub -d cogirihub
```

**주의:** 
- 컨테이너 이름: `cogirihub-postgres` (Docker 컨테이너 식별자)
- 데이터베이스 사용자명: `cogirihub` (PostgreSQL 사용자)
- 데이터베이스명: `cogirihub`

### 3-2. 컨테이너 내부 접속 (Bash/Shell)
```bash
docker exec -it cogirihub-postgres bash
```

**Windows PowerShell:**
```powershell
docker exec -it cogirihub-postgres bash
```

만약 bash가 없다면 (Alpine 기반이거나 bash가 없는 경우):
```bash
docker exec -it cogirihub-postgres sh
```

**Windows PowerShell:**
```powershell
docker exec -it cogirihub-postgres sh
```

### 4. 컨테이너 중지
```bash
docker stop cogirihub-postgres
```

### 5. 컨테이너 삭제
```bash
docker rm cogirihub-postgres
```

### 6. 컨테이너 중지 및 삭제 (한 번에)
```bash
docker rm -f cogirihub-postgres
```

### 7. 볼륨 삭제 (데이터 완전 삭제)
```bash
docker volume rm postgres_data
```

### 8. 기존 컨테이너가 있으면 삭제 후 재실행

**Linux/Mac (Bash):**
```bash
docker rm -f cogirihub-postgres
docker run -d \
  --name cogirihub-postgres \
  -e POSTGRES_DB=cogirihub \
  -e POSTGRES_USER=cogirihub \
  -e POSTGRES_PASSWORD=12341234 \
  -p 5432:5432 \
  -v postgres_data:/var/lib/postgresql/data \
  postgres:15
```

**Windows PowerShell:**
```powershell
docker rm -f cogirihub-postgres
docker run -d --name cogirihub-postgres -e POSTGRES_DB=cogirihub -e POSTGRES_USER=cogirihub -e POSTGRES_PASSWORD=12341234 -p 5432:5432 -v postgres_data:/var/lib/postgresql/data postgres:15
```

## 데이터베이스 정보
- **호스트**: localhost
- **포트**: 5432
- **데이터베이스명**: cogirihub
- **사용자명**: cogirihub
- **비밀번호**: 12341234

## 애플리케이션 실행 순서

### 1단계: Docker 컨테이너 실행

**Windows PowerShell (한 줄):**
```powershell
docker run -d --name cogirihub -e POSTGRES_DB=cogirihub -e POSTGRES_USER=cogirihub -e POSTGRES_PASSWORD=12341234 -p 5432:5432 -v postgres_data:/var/lib/postgresql/data postgres:15
```

**Windows PowerShell (백틱 사용):**
```powershell
docker run -d `
  --name cogirihub-postgres `
  -e POSTGRES_DB=cogirihub `
  -e POSTGRES_USER=cogirihub `
  -e POSTGRES_PASSWORD=12341234 `
  -p 5432:5432 `
  -v postgres_data:/var/lib/postgresql/data `
  postgres:15
```

**Linux/Mac (Bash):**
```bash
docker run -d --name cogirihub-postgres -e POSTGRES_DB=cogirihub -e POSTGRES_USER=cogirihub -e POSTGRES_PASSWORD=12341234 -p 5432:5432 -v postgres_data:/var/lib/postgresql/data postgres:15
```

### 2단계: 애플리케이션 실행
```bash
./gradlew bootRun
```

**Windows PowerShell:**
```powershell
.\gradlew.bat bootRun
```

**중요:** 테이블은 **Spring Boot 애플리케이션이 시작될 때만** 생성됩니다!
- 애플리케이션 실행 전: 테이블 없음 (정상)
- 애플리케이션 실행 중: 데이터베이스 연결 → 테이블 자동 생성
- 애플리케이션 종료 후: 테이블은 유지됨

애플리케이션이 시작되면 `ddl-auto: create` 설정으로 `@Entity`가 적용된 테이블(`users`)이 자동으로 생성됩니다.

### 3단계: 테이블 생성 확인

애플리케이션이 정상적으로 시작된 후 (콘솔에 "Started ApiApplication" 메시지 확인), PostgreSQL에 접속하여 확인:

```powershell
docker exec -it cogirihub-postgres psql -U cogirihub -d cogirihub
```

그 다음:
```sql
\dt          -- 테이블 목록 확인
\d users     -- users 테이블 구조 확인
```

## 트러블슈팅

### 데이터베이스 연결 오류 ("The connection attempt failed")

**1. Docker 컨테이너가 실행 중인지 확인:**
```powershell
docker ps
```

컨테이너가 보이지 않으면:
```powershell
docker start cogirihub-postgres
```

또는 컨테이너가 없다면 다시 생성:
```powershell
docker run -d --name cogirihub-postgres -e POSTGRES_DB=cogirihub -e POSTGRES_USER=cogirihub -e POSTGRES_PASSWORD=12341234 -p 5432:5432 -v postgres_data:/var/lib/postgresql/data postgres:15
```

**2. PostgreSQL이 준비될 때까지 대기:**
컨테이너를 시작한 후 몇 초 기다려야 PostgreSQL이 완전히 초기화됩니다. 로그 확인:
```powershell
docker logs cogirihub-postgres
```

"database system is ready to accept connections" 메시지가 보이면 준비된 것입니다.

**3. 포트 충돌 확인:**
다른 애플리케이션이 5432 포트를 사용 중일 수 있습니다:
```powershell
netstat -ano | findstr :5432
```

**4. 컨테이너 로그 확인:**
```powershell
docker logs -f cogirihub-postgres
```

**5. 데이터베이스 연결 테스트:**
```powershell
docker exec -it cogirihub-postgres psql -U cogirihub -d cogirihub -c "SELECT version();"
```

## 주의사항
- 데이터는 `postgres_data` 볼륨에 저장됩니다.
- `ddl-auto: create` 설정은 애플리케이션 시작 시 기존 테이블을 삭제하고 새로 생성합니다.
- 프로덕션 환경에서는 반드시 비밀번호를 변경하세요.
- 컨테이너를 삭제해도 볼륨은 유지되므로 데이터는 보존됩니다.
- PostgreSQL이 완전히 초기화되기까지 5-10초 정도 걸릴 수 있습니다.

