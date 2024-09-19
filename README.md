# 물류 관리 시스템
<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
<img src="https://capsule-render.vercel.app/api?type=wave&color=auto&height=300&section=header&text=물류관리시스템&fontSize=90" />

## :mortar_board: 목차
[1. 개요](#1-개요)

[2. 주요 기능](#2-주요기능)

[3. 문제 해결](#3-문제-해결)

[4. 서비스 구성 및 실행 방법](#4-서비스구성-및-실행-방법)



## 1. 개요
### :computer: 프로젝트 개요
**물류 관리 시스템(Logistics Management System)** 은 물류 프로세스를 관리하는 시스템으로, **허브**, **업체**, **상품**, **주문** 등 각 정보의 효율적 연동과 검색 기능을 제공합니다.  
이 프로젝트는 **Spring Cloud**, **FeignClient**, **Eureka** 등의 기술을 활용하여 마이크로서비스 간 독립성을 유지하며, 도메인 주도 설계(DDD)를 적용하고 외부 서비스와의 데이터 통신을 원활하게 처리하는 것을 목표로 했습니다.

### 프로젝트 진행 배경 및 기간
- **개발 기간**: 8일
- **팀 구성**: 4명
- **주요 도전과제**:
  - **마이크로서비스 간 통신 문제 해결**: Spring Cloud Eureka와 FeignClient를 이용한 서비스 간 통신 구현
  - **복잡한 검색 기능 구현**: QueryDSL을 이용해 검색 조건을 확장하고, 다양한 도메인의 데이터를 효율적으로 검색하는 시스템 구축

### 프로젝트 결과
- 각 도메인의 CRUD + Search를 구현.
- **FeignClient**를 이용하여 외부 서비스와의 연동을 구현.
- **QueryDSL**을 통해 복잡한 검색 기능을 구축하였으며, 다양한 조건에서 빠른 결과를 도출할 수 있었습니다.

<hr>


### :computer: 기술 스택
#### Platform
![Windows](https://img.shields.io/badge/Windows-2496ED)
![IntelliJ](https://img.shields.io/badge/IntelliJ-2496ED)

#### SERVER
![Docker](https://img.shields.io/badge/Doker-2496ED)
#### RDBMS
![Postgres](https://img.shields.io/badge/Postgres-2496ED)
![Jpa](https://img.shields.io/badge/Jpa-2496ED)

#### Application Development / Skills
![Java](https://img.shields.io/badge/Java-2496ED)
![Spring Eureka](https://img.shields.io/badge/Spring%20Cloud-00FF7F)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-00FF7F)
![Feign Client](https://img.shields.io/badge/Feign%20Client-2496ED)
<hr>

### :busts_in_silhouette: 팀원 소개
- 팀장 - 김휘수 :walking:  [Github](https://github.com/notitle12)
- 팀원 - 위성구 :walking:  [Github](https://github.com/weseonggu)
- 팀원 - 이성원 :walking:  [Github](https://github.com/lsw71311)
- 팀원 - 김민철 :walking:  [Github](https://github.com/kmc198989)
<hr>

### :flags: 기본 규칙
- 계층구조 : DDD 및 클린 아키텍처


## 2. 주요기능
:arrow_right: 위성구
본인 역할 :
- Spring Eureka, FeignClient, Config Server, Api Gateway, Zipkin 초기 셋팅 및 실행
- AWS S3를 사용한 공유라이브러리 운영
- 깃 리포지토리를 사용하여 설정파일 관리
- Api Gateway JWT 검증 및 인가 구현
- 각 마이크로 서비스에서 프록시를 사용한 권한 정보를 사용한 확인 구현

:arrow_right: 김휘수
본인 역할 :
- 회원가입 및 로그인 기능 구현
- 사용자 관리 기능 구현
- 스프링 시큐리티 및 JWT 인증 시스템 구축
- 배송담당자 도메인 설계 및 구현
- 슬랙 메시지 서비스 초안 설계

:arrow_right: 이성원
본인 역할 :
- 허브, 허브 경로 도메인 구현
- QueryDsl 이용 Search 기능 구현
- 슬랙 메시지 발송, 날씨 정보 기능 구현

:arrow_right: 김민철
본인 역할:
- 업체 및 상품 도메인 설계 및 구현
- QueryDsl를 활용한 복잡한 검색 기능 개발
- FeignClient를 사용해 외부 서비스와의 통신 및 데이터 연동 처리

## 3. 아키텍쳐 구조
![image](https://teamsparta.notion.site/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F83c75a39-3aba-4ba4-a792-7aefe4b07895%2F24147ff9-25d6-489e-bd5a-89a58b1ba588%2Fimage.png?table=block&id=f9a145b0-b593-4f02-ae9a-1f6f85e3ff33&spaceId=83c75a39-3aba-4ba4-a792-7aefe4b07895&width=1420&userId=&cache=v2)

## 3. 문제 해결
:arrow_right: 발생한 문제
- 공유 라이브러리를 Maven Repository에 배포 실패
    - AWS S3를 사용하여 배포 (멀티 모듈 프로젝트로 구성으로 해결가능)

## 4. 서비스구성 및 실행 방법
- JAVA 버전 : 17

- 스프링부트 버전 : 3.3.3

- 설정 파일 : application.yml(로컬용), application-product.yml(배포용)

















