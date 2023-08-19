# <div align=center>팀명 : Sixman</div>

<div align=center> 

| **Front End**  |                       **정회엽(팀장)**                       |  **이인우**   |                      **이종범**                      |
| -------------- | :----------------------------------------------------------: | :-----------: | :--------------------------------------------------: |
| **Front 역할** |                                                              |               |                                                      |
| **Back End**   |                      **김호빈(부팀장)**                      |  **박정우**   |                      **임한준**                      |
| **Back 역할**  | 로그인, 회원가입 API<br />Spring Security<br />AWS 및 CI/CD 구현 | 질문 API 구현 | 답변, 댓글 API 구현<br />엔티티 작성 및 DB 설계 구현 |

</div> 

<br>

# <div align=center>📚 STACKS</div>

스택 이미지 추가
---

# 📝 [목차](#index) <a name = "index"></a>

- [개요](#outline)
- [설계](#structure)
- [아키텍처](#structure)
- [결과물](#outputs)
- [ERD](#erd)  
- [테스트 및 모니터링](#test)
- [왜 이 기술을 사용했는가?](#why)
- [성과 및 회고](#retrospection)

<br>

# 📝 개요 <a name = "outline"></a>

<details>
   <summary> 본문 확인 (👈 Click)</summary>
<br />
Codestates pre-project Stackoverflow 클론 코딩입니다.
프로젝트 기간 : 8.4 ~ 8.23 (약 2.5주)
배포 서버 ☞ http://sixman-front-s3.s3-website.ap-northeast-2.amazonaws.com/
</details>

<br>



# 📈 아키텍처  <a name = "structure"></a>

<details>
   <summary> 본문 확인 (👈 Click)</summary>
<br />

<div align="center">
 아키텍처 이미지
</div>

- EC2 로 백엔드 서버 배포, S3 에 프론트 엔드 서버 배포
- RDS(MySQL) 구성, 이메일 인증 번호 저장 서버로 Redis Cluster 구성
- 프로필 이미지용 S3 버킷 생성 및 presignedURL 발급
- CloudWatch 로 로그 관리 및 모니터링
- Error 발생 시 SNS 로 알림 전송(Email)

</details>

<br>

# 🎁 결과물  <a name = "outputs"></a>

<details>
   <summary> 본문 확인 (👈 Click)</summary>
<br />

## 로그인/회원가입
### 로그인

<div align="center">
 로그인 페이지 이미지
</div>

- 비밀번호 찾기
- 일반 로그인 및 OAuth 로그인

<br>

### 회원가입
<div align="center">
 회원 가입 이미지
</div>

- 이메일 인증을 통한 회원가입

<br>

### 비밀번호 찾기

<div align="center">
 비밀번호 찾기 이미지
</div>

- 이메일 인증을 통한 비밀번호 찾기 기능

<br>


## 메인 페이지
### 질문 목록 조회 페이지
<div align="center">
 질문 목록 이미지
</div>

- 페이징을 통한 질문 조회
- 추천순, 최신순, 조회순으로 질문 조회
- 태그로 필터링 기능
- 질문 생성 기능

<br>

### 질문 상세 페이지
<div align="center">
 질문 상세 페이지 이미지
</div>
- 질문, 답변, 댓글 조회 및 수정, 삭제
- 질문 및 답변 추천 기능
- 답변 정렬 기능 (추천순, 최신순)

<br>

### 질문 생성 페이지
<div align="center">
 질문 생성 페이지 이미지
</div>

<br>


## 마이페이지
### 프로필
<div align="center">
 마이 페이지 이미지
</div>

<br>

### 활동
<div align="center">
 마이 페이지 activity 이미지
</div>

- 작성한 질문, 답변, 질문에 대한 태그 조회 기능
<br>

### 정보 변경
<div align="center">
  마이 페이지 settings 이미지
</div>

- 프로필 내용 변경 페이지

<br>


# 📈 ERD <a name = "erd"></a>

<details>
   <summary> 본문 확인 (👈 Click)</summary>
<br />


<div align="center">
 erd 이미지 추가
</div>


</details>

<br>

# 🔨 테스트 및 모니터링 <a name = "test"></a>

<details>
   <summary> 본문 확인 (👈 Click)</summary>
<br />

## 개발자 테스트
<div align="center">
 개발자 테스트 이미지
</div>

- 총 000 개 개발자 테스트 진행 -> 0개 성공
- 개발자 테스트 목록 바로가기 ☞ https://docs.google.com/spreadsheets/d/1j2-iqo2TJuri0KunnhVAj8OvrOuz28Dur0TpCuien_8/edit#gid=980196063

<br>

## Backend Unit Test
<div align="center">
 유닛 테스트 이미지
</div>

- 총 000 개의 유닛 테스트 진행

<br>

## nGrinder 부하 테스트
<div align="center">
 nGrinder 테스트 이미지
</div>

- nGrinder 테스트 설명

<br>

## CloudWatch
<div align="center">
 cloudwatch 이미지
</div>

- cloudwatch 를 통한 리소스별 응답시간 모니터링
- error 로그 발생 시 SNS 를 통한 이메일 알림

<Br>


# 💎 왜 이 기술을 사용했는가? <a name = "why"></a>

<details>
   <summary> 본문 확인 (👈 Click)</summary>
<br />

## API 문서화

<div align="center">
 API 문서화 이미지
</div>

API 문서 바로가기  ☞  http://ec2-43-201-249-199.ap-northeast-2.compute.amazonaws.com

프로젝트 초기에는 설계 단계에서 만든 Excel 로 API 를 사용했습니다. 하지만 개발 단계에서 필요없는 API 를 빼거나 추가적인 API 를 넣는 일이 빈번했고 Excel 을 일일히 관리할 수 없었습니다. 따라서 개발 단계에 맞춰 자동으로 API 를 문서화할 수 있는 RestDocs 를 사용했습니다.
API 문서는 Swagger 와 RestDocs 을 비교했는데 아래와 같은 이유로 RestDocs 를 사용했습니다.
1. Swagger 는 프로덕션 코드에 어노테이션이 붙기 때문에 코드의 가독성이 떨어집니다.
2. Swagger 는 테스트 기반이 아니기에 기능이 100% 동작한다고 확신할 수 없습니다.

<br>

## Querydsl
Member, Question 을 조회할 때 연관된 모든 질문이나 답변, 댓글 등을 모두 조회하게 됩니다. 이 때 쿼리문이 복잡해지기 때문에 JPQL 이나 Native Query 를 사용해야 하게 되는데, 쿼리문이 길어질 경우 오타나 문법적인 오류 등 휴먼 에러가 발생할 수 있습니다. 정적 쿼리가 아닌 이상 런타임 시점에 오류를 알 수 있게 됩니다.
따라서 위와 같은 문제를 해결하기 위해 Querydsl 을 부분적으로 사용했고 아래와 같은 이점이 있었습니다.
1. Querydsl 은 컴파일 시점에 타입을 검사하기 때문에, 잘못된 필드명이나 데이터 유형 사용과 같은 오류를 빠르게 감지할 수 있습니다.
2. 복잡한 조건을 기반으로 쿼리를 동적으로 생성할 수 있습니다. 이를 통해 동일한 메서드 내에서 다양한 조건 및 필터를 적용한 쿼리를 구성할 수 있습니다.
3. Querydsl을 사용하면 쿼리가 실제 쿼리문처럼 작성되기 때문에 가독성이 좋습니다.

<br>

## 이메일 인증 구현 -> Redis
회원가입 또는 패스워드 인증 시 이메일로 인증 코드를 보내게 됩니다. 이때 보낸 인증 코드를 다시 클라이언트로부터 받게 되는데, 서버를 인증 코드가 맞는지 확인하기 위해 코드를 서버에 저장하고 있어야 합니다.
이를 위해서 이메일로 보낸 코드를 Redis 에 저장하고 인증 코드 확인 시 Redis 에서 해당 이메일에 대한 코드를 찾아서 비교합니다.
Redis 는 메모리 기반이기 때문에 데이터를 빠르게 읽고 쓸 수 있습니다. 또한 데이터에 대해 TTL(Time To Live)을 설정할 수 있습니다. 이메일 인증 코드의 경우, 일정 시간(5분)이 지나면 자동으로 만료되도록 설정했습니다.

<Br>

## S3 프로필 이미지 저장
프로필 이미지를 저장하는 방법은 두 가지가 있었습니다. 첫번째는 mysql 에 bytecode 로 저장하는 방법이고, 두번째는 s3 버킷에 정적 파일로 저장하는 방법입니다. 아래와 같은 사항이 고려됐습니다.
1. 관계형 데이터베이스에 대용량의 이미지를 데이터베이스에 저장하면 데이터베이스의 I/O 성능에 부정적인 영향을 줄 수 있습니다.
2. 반대로 S3 는 정적 콘텐츠를 제공하기 위해 최적화되어 있기 때문에 이미지를 빠르게 제공할 수 있습니다.


<Br>



# 📌 성과 및 회고 <a name = "retrospection"></a>

<details>
   <summary> 본문 확인 (👈 Click)</summary>
<br />



</details>

<br>