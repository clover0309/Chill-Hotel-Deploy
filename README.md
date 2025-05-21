# 호텔 예약 시스템 프로젝트

## 프로젝트 개요

이 프로젝트는 호텔 예약 및 관리 시스템을 구현한 웹 애플리케이션입니다. 사용자는 객실 예약, 다이닝 예약, 시설 이용 등 호텔의 다양한 서비스를 이용할 수 있으며, 관리자는 예약 관리, 객실 관리, 회원 관리 등의 기능을 수행할 수 있습니다.

## 기술 스택

### 프론트엔드

- Next.js 14
- TypeScript
- Tailwind CSS
- shadcn/ui
- React Query

### 백엔드

- Spring Boot 3.4
- Spring Security
- Spring Data JPA
- MySQL 8
- Redis

## 프로젝트 구조

```
SIST-HotelProject/
├── front-end/           # 프론트엔드 애플리케이션 (Next.js)
│   ├── app/             # 페이지 및 라우팅
│   ├── components/      # 재사용 가능한 컴포넌트
│   ├── lib/             # 유틸리티 함수 및 설정
│   └── hooks/           # 커스텀 React 훅
│
└── back-end/            # 백엔드 애플리케이션 (Spring Boot)
    ├── src/main/java/   # Java 소스 코드
    └── src/main/resources/ # 설정 파일 및 리소스
```

## 주요 기능

- 사용자 인증 및 권한 관리
- 객실 조회 및 예약
- 다이닝 예약
- 시설 정보 조회 및 예약
- 멤버십 관리
- 마이페이지 (예약 조회/취소)
- 관리자 대시보드

## 개발 현황

- [x] 프로젝트 초기 설정
- [x] 목업 완성
- [ ] 백엔드 API 개발
- [ ] 프론트엔드 구현
- [ ] 테스트 및 배포

## 프로젝트 구동 방법

### 프론트엔드 실행

```bash
cd front-end
npm install
npm run dev
```

### 백엔드 실행

```bash
cd back-end
./gradlew bootRun
```
