# Overview

**미션 주제: TDD, BDD 방법론을 이해하고 적용**



학습 계획 정보는 아래와 같음

### Day 1

- [x] 문제 정의: TDD 및 BDD 적용의 필요성 및 목표 정의
- [x] 솔루션 도출: TDD 및 BDD를 적용한 개발 방법론 도입 방안 도출
- [x] 설계: TDD 및 BDD를 적용한 테스트 작성 및 자동화 프로세스 설계
- [x] 테스트 프레임워크 설치 및 환경 설정

### Day 2

- [x] 기본 테스트 케이스 작성
- [x] TDD 방식으로 기능 구현 및 테스트 반복
- [x] 테스트 실패를 통해 문제를 정의하고, 이를 해결하는 코드 작성
- [x] 테스트 통과 시 새로운 테스트 케이스 작성

### Day 3

- [x] BDD 방식으로 사용자 시나리오 작성 및 테스트
- [x] Gherkin 문법을 사용하여 시나리오 작성
- [x] BDD 테스트 실행 및 결과 확인 
- [x] 통합 테스트 작성 및 실행

### Day 4

- [x] 테스트 커버리지 확인 및 보고서 작성
- [x] TDD 및 BDD 적용 사례 연구 및 보고서 작성
- [x] 코드 리팩토링을 통한 테스트 최적화

### Day 5

- [ ] 지속적인 통합(CI) 설정 및 테스트 자동화
- [ ] 최종 결과물 제출 (코드, 테스트 시나리오, 테스트 커버리지 보고서, 적용 사례 보고서)





# 진행 및 완료 사항

## 1. 문제 정의: TDD 및 BDD 적용의 필요성 및 목표 정의

### 1-1. TDD(Test-Driven Development)

테스트 주도 개발(Test-Driven Development)은 테스트 작성으로 소프트웨어 개발을 안내하는 기법이다. 1990년대 후반 Extreme Programming(XP)의 일환으로 Kent Beck이 개발했다고 한다. 일반적으로 TDD는 다음의 세 가지 단계를 반복한다.

1. 추가할 기능에 대한 테스트 작성 (Write Test)
2. 테스트가 통과할 때까지 기능 코드 작성 (Write Code)
3. 새로운 코드와 기존 코드를 구조적으로 개선하는 리팩터링 (Refacor)

이 과정은 'Red-Green-Refactor'로 요약된다. 여기서 중요한 초기 단계는 테스트 케이스 목록 작성이다. 그런 다음 목록에서 하나의 테스트를 선택하고, Red-Green-Refactor를 적용한 후 다음 테스트를 선택한다. 테스트를 올바르게 순서대로 배치하는 것은 중요한 기술로, 디자인의 핵심 사항에 빨리 도달하는 테스트를 선택해야 한다. 이 과정에서 더 많은 테스트를 목록에 추가할 수도 있다.



### 1-2. TDD의 필요성

테스트를 작성하는 것은 다음과 같은 이점들을 제공한다. 

- **SelfTestingCode를 얻음**: 테스트를 통과하기 위해서만 기능 코드를 작성할 수 있다. 

- **기능 분리**: 테스트를 먼저 생각함으로써 코드 인터페이스를 먼저 생각하게 되기 때문에 인터페이스와 구현을 분리하는 데 도움을 줄 수 있다. 이는 많은 프로그래머가 어려움을 겪는 좋은 디자인의 핵심 요소이기도 하다.

- **코드 품질 향상**: TDD는 테스트를 먼저 작성하고 이에 맞춰 코드를 구현하는 방식으로, 코드의 품질을 높이고 유지보수성을 향상시킨다. 이는 잘못된 코드가 초기에 발견되도록 하여 버그를 줄이고 코드의 안정성을 보장힌다.

- **개발 속도 증가**: 초기에는 시간이 더 걸릴 수 있지만, 장기적으로 봤을 때 버그 수정에 드는 시간을 줄여주므로 전체 개발 속도가 증가한다. 테스트가 자동화되어 반복적인 수작업 테스트가 필요 없게 된다.

- **문서화**: 테스트는 코드의 동작을 명확히 설명하는 문서의 역할도 한다. 새로운 팀원이 프로젝트에 합류할 때, 테스트 코드를 통해 시스템의 기능과 동작을 빠르게 이해할 수 있다.



### 1-3. TDD의 목표

TDD는 다음과 같은 목표를 수행하기 위해 작업한다.

- **완벽한 테스트 커버리지**: 코드의 모든 기능이 테스트되어 예상치 못한 버그가 발생하지 않도록 한다. 이를 통해 시스템의 신뢰성을 높이고, 릴리즈 전에 발생할 수 있는 문제를 미리 발견하고 해결한다.
- **클린 코드 작성**: 테스트를 먼저 작성함으로써 불필요한 코드를 작성하지 않게 되어 코드가 간결하고 명확해진다. 또한, 리팩토링 시에도 기존 기능이 정상적으로 동작하는지 확인할 수 있어 안정적인 리팩토링이 가능하다.
- **자동화된 테스트 프로세스**: 테스트가 자동화되어 CI/CD 파이프라인에 통합됨으로써 지속적인 통합 및 배포 과정에서 코드의 품질을 유지할 수 있다. 이는 빠른 피드백을 제공하여 개발 주기를 단축시키는 데 기여한다.



### 1-4. BDD(Behavior-Driven Development)

행위 주도 개발(Behavior-Driven Development, BDD)은 소프트웨어 개발 과정으로, Cucumber라는 도구는 이를 지원하기 위해 만들어졌다. BDD는 이해관계자들 간의 격차를 줄이기 위해 협업을 촉진하고, 빠르고 작은 반복 작업을 통해 피드백과 가치 흐름을 증가시키며, 시스템의 행동에 대해 자동으로 확인되는 문서를 생성할 수 있다.

BDD는 구체적이고 실질적인 예시를 중심으로 협업하여 시스템의 행동을 설명하는 방식으로 개념부터 구현까지 연속적인 협업 과정을 거친다.

또한 BDD는 기존의 애자일 방법론을 대체하지 않고 강화하며, 팀이 애자일의 몇 가지 약속들을 잘 지킬 수 있도록 도와준다.

그래서 사용자의 피드백에 빠르게 대응할 수 있고 최소한의 작업으로 요구를 충족시키기 위해 작은 반복 작업이 권장된다고 한다.



BDD에는 세 가지 실천 방법이 존재한다.

1. **발견(Discovery)**: 시스템의 새로운 기능에 대한 구체적인 예시를 논의한다.
   - 발견 과정에서는 사용자의 관점에서 시스템의 실제 예시를 중심으로 구조화된 대화를 통해 팀의 공유 이해를 구축한다.
2. **형식화: (Formulation)**: 이러한 예시를 자동화할 수 있는 방식으로 문서화합니다.
   - 발견 과정에서 도출된 예시를 문서화하여 팀의 공유 비전을 확인한다. 이 문서는 사람과 컴퓨터 모두 읽을 수 있어야 하며, 이는 자동화된 예시로 구현을 안내한다.
3. **자동화(Automation)**: 문서화된 예시를 테스트로 구현하여 코드를 개발한다.
   - 형식화된 문서를 사용하여 시스템에 테스트로 연결하고, 이 테스트를 통해 구현 코드를 개발한다. 자동화된 예시는 개발 작업을 올바르게 안내하며, 시스템 유지보수 시에도 안전하게 변경할 수 있도록 돕는다.



### 1-5. BDD(Behavior-Driven Development)의 필요성

1. **비즈니스 가치 반영**

BDD는 비즈니스 가치에 초점을 맞추어 사용자 스토리와 기능 요구사항을 정의하고 테스트한다. 이는 개발팀이 비즈니스 목표를 명확히 이해하고 이를 구현하는 데 도움이 된다.



2. **협업 강화**

BDD는 개발자, 테스트 담당자, 비즈니스 이해관계자 간의 커뮤니케이션을 촉진합한다. 공통된 언어(예: Gherkin)를 사용하여 시나리오를 정의함으로써 모든 팀원이 같은 목표를 공유하고 협력할 수 있게 한다.



3. **사용자 중심 경험**

사용자 관점에서 시나리오를 작성하고 테스트함으로써 실제 사용자가 기대하는 기능을 구현할 수 있다. 이는 최종 제품의 사용자 경험을 개선하는 데 중요한 역할을 한다.



### 1-6. BDD의 목표

1. **명확한 요구사항 정의**

사용자 스토리와 시나리오를 통해 요구사항을 명확히 정의하고, 이를 기반으로 테스트를 작성하여 개발 과정에서 요구사항이 잘못 구현되는 것을 방지한다.



2. **지속적인 피드백 제공**

BDD는 각 기능이 기대한 대로 동작하는지 지속적으로 확인하여 피드백을 제공한다. 이는 빠른 문제 해결과 기능 개선을 가능하게 한다.



3. **비즈니스 목표 달성**

BDD의 최종 목표는 소프트웨어가 비즈니스 요구사항을 충족하고, 사용자가 기대하는 가치를 제공하는 것이다. 이는 제품의 성공 가능성을 높이고, 시장에서 경쟁력을 갖추게 한다.



### 1-7. 이번 미션의 목표

위와 같은 TDD와 BDD라는 기법을 바탕으로 이번 미션에서 수행하고자 하는 목표와 배울 수 있는 것들에 대해 아래와 같이 정리할 수 있다.

- **TDD와 BDD의 이해 및 실습**:
  - **TDD**: 테스트를 먼저 작성하고, 이를 통과하도록 코드를 구현하며, 이후 리팩토링을 통해 코드의 품질을 유지하는 방법론을 학습한다.
  - **BDD**: 비즈니스 요구사항을 시나리오로 정의하고, 이를 기반으로 테스트를 작성하여 소프트웨어가 비즈니스 목표를 충족하도록 개발하는 방법론을 익힌다.
- **효과적인 테스트 작성 및 자동화**:
  - JUnit, Mockito, Jest, Mocha 등 주요 테스트 프레임워크를 사용하여 자동화된 테스트를 작성하고, 이를 통해 개발 과정에서 발생할 수 있는 오류를 사전에 발견하고 해결한다.
- **사용자 시나리오 기반의 테스트 수행 능력 향상**:
  - Gherkin 언어를 사용하여 사용자 시나리오를 작성하고, 이를 통해 실제 사용자 관점에서 소프트웨어의 기능을 검증하는 능력을 기른다.
- **TDD와 BDD의 기본 개념 및 차이점 이해**:
  - **TDD**: 테스트 주도 개발의 세 가지 단계인 'Red-Green-Refactor' 사이클을 이해하고 이를 실습한다.
  - **BDD**: 비즈니스 가치에 초점을 맞추어 사용자 스토리를 정의하고, 이를 기반으로 한 테스트 작성 방법을 학습한다.
- **주요 테스트 프레임워크 사용법 숙지**:
  - Jest, Mocha, Chai, JUnit 등의 프레임워크를 사용하여 다양한 테스트를 작성하고, 이를 자동화하는 방법을 익힌다.
- **테스트 커버리지 및 코드 품질 향상**:
  - 테스트 커버리지를 높이는 방법을 학습하고, 코드의 품질을 유지하기 위한 리팩토링 기법을 익힌다. 이를 통해 안정적인 소프트웨어 개발을 수행할 수 있다.
- **BDD 시나리오 작성 및 결과 파일 생성**:
  - Gherkin 언어를 사용하여 BDD 시나리오를 작성하고, 이를 기반으로 테스트를 수행하여 결과 파일을 생성한다. 이를 통해 사용자 요구사항을 충족하는 소프트웨어를 개발할 수 있다.
- **적용 사례 보고서 작성**:
  - TDD와 BDD를 실제 프로젝트에 적용한 사례를 보고서로 작성하여, 이를 통해 학습한 내용을 정리하고 공유한다.





## 2. 솔루션 도출: TDD 및 BDD를 적용한 개발 방법론 도입 방안 도출

### 단계 1: 초기 설정 및 환경 구축

- 테스트 프레임워크 선택: 일반적인 Java 프로젝트에서는 JUnit을 사용한다. JUnit은 널리 사용되는 단위 테스트 프레임워크로, 다양한 테스트 기능을 제공한다.
- 환경 설정: Maven 또는 Gradle을 사용하여 Unit을 프로젝트에 포함시킨다. 지속적 통합(CI) 도구 (예: Jenkins, Github actions)를 설정하여 테스트 자동화를 구축한다.



### 단계 2: TDD 프로세스 적용

- 기본 테스트 케이스 작성: 구현할 기능에 대한 기본적인 테스트 케이스를 작성한다. 이때, 테스트 케이스는 가능한 한 작은 단위로 나누어 작성한다.
- 기능 구현 및 테스트 반복: 테스트 케이스를 통과하는 최소한의 코드를 작성하고, 이를 반복하여 기능을 완성한다. 테스트가 실패할 경우, 문제를 정의하고 이를 해결하는 코드를 작성한다.
- 새로운 테스트 케이스 작성: 기존 테스트 케이스가 통과하면, 추가적인 기능에 대한 새로운 테스트 케이스를 작성한다. 이를 통해 기능을 점진적으로 확장해 나간다.



### 단계 3: BDD 프로세스 적용

- 사용자 시나리오 작성: 사용자 스토리를 기반으로 시나리오를 작성한다. 이때 Gherkin 문법을 사용하여 시나리오를 명확히 정의한다.
- BDD 테스트 작성 및 실행: 시나리오에 따라 BDD 테스트를 작성하고 실행한다. 테스트 결과를 확인하여 요구사항이 정호확히 반영되었는지 검증한다.
- 통합 테스트 작성 및 실행: 개별 기능이 올바르게 통합되는지 확인하기 위해 통합 테스트를 작성하고 실행한다.



### 단계 4: 테스트 커버리지 및 최적화

- **테스트 커버리지 확인**: 테스트 커버리지를 측정하여 코드의 어느 부분이 테스트되지 않았는지 확인한다. 이를 통해 테스트의 완전성을 검증한다.
- **리팩토링 및 최적화**: 코드 리팩토링을 통해 테스트를 최적화하고, 중복된 테스트를 제거한다. 이를 통해 테스트 실행 시간을 단축하고, 유지 보수성을 향상시킨다.



### 단계 5: 지속적 통합 및 최종 결과물 제출

- **지속적 통합(CI) 설정**: 지속적 통합 도구를 통해 자동으로 테스트를 실행하고, 결과를 확인한다. 이를 통해 개발 과정에서 발생할 수 있는 문제를 신속히 발견하고 해결한다.
- **최종 결과물 제출**: 개발된 코드, 테스트 시나리오, 테스트 커버리지 보고서, TDD 및 BDD 적용 사례 보고서를 제출한다.





## 3. 설계: TDD 및 BDD를 적용한 테스트 작성 및 자동화 프로세스 설계

### 개요

1. TDD 설계
   - 테스트 작성: 구현할 기능에 대한 테스트 케이스를 작성합니다. 이 테스트는 처음에 실패하게 된다.
   - 코드 작성: 테스트를 통과할 수 있는 최소한의 코드를 작성한다.
   - 리팩토링: 중복을 제거하고 코드를 최적화한다. 이 과정에서 테스트가 계속 통과하는지 확인한다.
2. BDD 설계
   - 시나리오 작성: Gherkin 문법을 사용하여 사용자 시나리오를 작성한다.
   - 테스트 작성: 시나리오에 맞는 테스트 케이스를 작성합니다.
   - 코드 작성: 테스트를 통과하는 코드를 작성한다.
3. 테스트 자동화 프로세스 설계
   - 테스트 자동화는 지속적인 통합(CI) 환경에서 매우 중요한 역할을 한다. 자동화 된 테스트는 코드 변경 시마다 테스트가 자동으로 실행되어, 새로운 버그가 도입되지 않도록 방지한다.
   - 이번 미션에서는 Java Spring Boot와 테스트 프레임워크 JUnit을 사용하여 TDD 및 BDD 기반의 테스트 자동화 프로세스를 설계해볼 것이다.



### 진행 방향

주제: 비밀번호 유효성 검사



1. 기본 환경 설정:
   - JUnit 설치 확인
   - 스프링 부트 설정
2. TDD를 적용한 테스트 작성 및 코드 구현:
   - **요구 사항**
     - 비밀번호는 최소 8자 이상 12자 이하여야 한다.
     - 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예회를 발생시킨다.
     - 경계조건에 대해 테스트 코드를 작성한다.
   - **테스트 케이스 작성**:
     - 비밀번호 유효성 검사 기능에 대한 테스트 케이스를 먼저 작성한다. 예를 들어, 비밀번호가 유효한지 검증하는 여러 가지 테스트를 포함한다. (비밀번호 길이 검사)
   - **코드 작성:**
     - 테스트를 통과할 수 있는 최소한의 코드를 작성하여 비밀번호 유효성 검사를 구현한다.
   - **리팩토링:**
     - 초기 구현한 코드를 개선하고, 중복 코드를 제거하며 최적화한다. 이. 과정에서 테스트가 계속 통과하는지 확인한다.



3. BDD를 적용한 시나리오 작성 및 테스트:
   - 사용자 시나리오 작성: Gherkin 문법을 사용하여 비밀번호 유효성 검사 시나리오를 작성한다. 예를 들어, 비밀번호 유효성 검사를 위한 시나리오는 다음과 같이 작성할 수 있다.
   - 테스트 작성: 작성된 시나리오에 맞춰 테스트 케이스를 작성한다. 예를 들어, 
     - "**Given** the user provides a password 'Valid1'" 단계에서는 사용자가 유효한 비밀번호를 제공하는 상황을 설정하고, 
     - "**When** the system validates the password" 단계에서는 시스템이 비밀번호를 검증하는 동작을 시뮬레이션한다. 
     - "**Then** the validation result should be 'valid'" 단계에서는 비밀번호가 유효한지 결과를 확인한다.
   - BDD 테스트 실행: 작성된 테스트를 실행하고 결과를 확인한다. 만약 테스트가 실패하면 문제를 파악하고 이를 해결하기 위해 코드를 수정한다.
4. 통합 테스트 작성 및 실행:
   - 통합 테스트 작성: 비밀번호 유효성 검사 기능 전체를 통합 테스트한다.
   - 예를 들어, 다양한 비밀번호를 입력하여 유효성 검사를 통과하는지, 실패하는지 전체 흐름을 테스트한다.
   - 테스트 실행: 통합 테스트를 주기적으로 실행하여 시스템의 안정성을 확인한다.
5. 지속적인 통합(CI) 설정 및 테스트 자동화:
   - CI 도구 설정: Jenkins, GitLab CI, Github Actions 등 CI 도구를 설정하여 코드 변경 시마다 자동으로 테스트가 실행되도록 설정한다. 이는 개발자가 코드를 커밋할 때마다 테스트가 자동으로 실행되어 잠재적인 문제를 조기에 발견할 수 있도록 한다.
   - 자동화 스크립트 작성: CI 도구에서 사용할 스크립트를 작성하여, 코드 빌드, 테스트 실행, 결과 보고서 생성 등을 자동화한다. 이러한 스크립트는 코드가 변경될 때마다 지속적으로 통합 및 배포가 이루어질 수 있도록 한다.



## 4. 테스트 프레임워크 설치 및 환경 설정

실습에 진행하기 앞서 테스트 실습을 진행하기 위한 스프링 부트 프로젝트를 하나 생성해준다.



<img width="504" alt="image" src="https://github.com/user-attachments/assets/f1689beb-13c4-4343-982a-6999e012b6bb">

실습에 앞서서 프로젝트를 새로 만들어 보면 알 수 있듯 build.gradle 파일에는 아래 그림과 같이 JUnit5 프레임워크에 대한 의존성이 이미 추가가 된 모습을 볼 수 있다. 그렇다면 AssertJ만 따로 추가해 주도록 한다.



```
testImplementation 'org.assertj:assertj-core:3.21.1'
```



<img width="449" alt="image" src="https://github.com/user-attachments/assets/78d6fa0f-c811-4893-8c91-17c68e6c8185">

위 사진은 spring 프로젝트 진행 시 구성되는 폴더 구조이다. 일반적으로 main 부분에 들어가는 코드를 프로덕션 코드라 하고, test 부분에 들어가는 코드를 테스트 코드라고 부른다.



보통 새로운 프로젝트를 생성하면 위 사진과 같은 구조로 만들어지기 때문에 별도로 수정해야 할 필요는 없지만 만약 테스트 코드 부분의 패키지와 프로덕션 코드의 패키지 구조가 다르다면 맞춰주는 것이 좋다.



## 5. 기본 테스트 케이스 작성

코드 블럭 안에서 (MacOS 기준) Cmd+N 키를 누르면 아래와 같은 창이 뜨게 되고 Test Method를 선택하면 Test 메소드가 하나 생성된다.

<img width="322" alt="image" src="https://github.com/user-attachments/assets/5778ec22-76a6-4268-844b-b369011e45ce">



또한 @DisplayName()을 통해 괄호 안에 요구사항에 대한 내용을 적어줌으로써 앞서 설명한 문서화 역할을 할 수 있게 됩니다.

```java
public class PasswordValidatorTest {

    @DisplayName("비밀번호가 최소 8자 이상, 12자 이하이면 예외가 발생하지 않는다.")
    @Test
    void validatePasswordTest() {
        assertThatCode(() -> PasswordValidator.validate("123456789"))
                .doesNotThrowAnyException();
    }
}
```

일단 기본적인 테스트 코드를 위와 같이 작성한다.



테스트 코드 실행 시 assertThatCode 함수 안에 들어간 labmda를 실행하게 되고 만약 유요한 비밀번호인 경우 아무런 예외를 던지지 않도록 작성한 코드이다.

- assertThatCode는 assertJ 라이브러리의 메서드로 코드의 가독성을 높여주는 역할을 한다.(doesNotThrowAnyException)



## 6. TDD 방식으로 기능 구현 및 테스트 반복

이를 그럼 직접 실행해 보도록 할 것이다. 실행할 때는 IntelliJ 기준 해당 메서드 부분 코드 라인 넘버 옆에 초록색 플레이 버튼을 눌러주면 된다.



<img width="1337" alt="image" src="https://github.com/user-attachments/assets/b19ac651-de5f-403d-a566-74d69cb8893d">

당연히 처음에는 위 사진과 같이 테스트 실패가 되면서 오류가 나게 된다. 람다의 내용인 PasswordValidator에 대한 클래스를 만들어주지 않았기 때문이기에 그렇다면 다음에 해야할 내용은 너무나 명확해 진다.



TDD 프로세스에 따르면 테스트가 실패했으니 이 테스트를 성공하는 방향의 태스크를 해주면 된다. 그렇기에 이제 PasswordValidator를 만들어 주면 된다.

<img width="888" alt="image" src="https://github.com/user-attachments/assets/8fd9b31e-1d0c-4a86-945f-c508b21443b7">

IntelliJ에서는 오류가 뜨는 부분의 코드에 빨간 글씨로 표시되며 해당 부분에 커서를 둔 채로 ALT + Enter 키를 눌러주면 위 사진과 같이 해당 오류를 해결해주는 몇 가지 추천을 제시해 준다.



위에서는 클래스가 없었기 때문에 오류가 뜬 것이었으므로 클래스를 만들어주는 선택지를 선택하여 main 패키지 부분에 해당 클래스 코드 파일을 만들어준다.



```java
package org.ktb.chatbotbe;

public class PasswordValidator {
    public static void validate(String password) {
        
    }
}
```

이후 위 코드의 내용과 같이 PasswordValidator 클래스에 validate이라는 메서드를 만들어 해당 메서드를 잘 호출할 수 있도록 구현체를 만들어준다. 이 때 해당 메서드에 아무 내용이 없더라도 메서드를 선언했기 때문에 정상적으로 메서드가 호출이 될 것이고 테스트도 잘 통과할 것으로 예상할 수가 있다.



<img width="334" alt="image" src="https://github.com/user-attachments/assets/6d52dc3b-040c-4fcb-9235-9765843cf178">

예상대로 실제 테스트를 구동해 봤을 때 테스트가 성공한 것을 위 사진과 같이 볼 수 있다.



그러나 이렇게 되면 유효성을 검사하는 코드 쪽에서 오류를 throw하는 부분이 없기 때문에 무조건 다 유효하다고 판단되어 아직까지는 의미가 없는 코드이다.



그렇다면 그 다음으로 해야 할 작업은 테스트를 실패시키되 요구사항에 맞는 방향으로 메서드를 수정하는 것이다. 일단 최대한 제일 간단하게 코드를 구현해볼 것이다.

```java
    public static void validate(String password) {
        if (password.length() < 8 || password.length() >  12) {
           throw new IllegalArgumentException("비밀번호는 최소 8자 이상 12자 이하여야 한다."); 
        }
    }	
```



위와 같이 코드를 작성하고 테스트를 돌려봤을 때, 정상적으로 돌아가는 것을 볼 수 있다.



## 7. 테스트 실패를 통해 문제를 정의하고, 이를 해결하는 코드 작성

```java
assertThatCode(() -> PasswordValidator.validate("123456789"))
                .doesNotThrowAnyException();
```

위 상황에서 테스트 코드가 정상적으로 돌아갈 수 있었던 이유는 validate 메서드 호출 인자로 9자리의 비밀번호를 입력했기 때문에 if 문에 걸리지 않아 오류를 던지지 않고 함수가 종료되어 doesNoteThrowAnyException() 을 만족했기 때문이다.



그렇다면 8자 미만의 비밀번호를 입력하게 되면 어떻게 될까?

<img width="433" alt="image" src="https://github.com/user-attachments/assets/177b5737-adbc-4c50-80a5-702292a347ea">

또 예상대로 테스트가 실패하는 상황을 맞이할 수 있게 된다. 이를 통해 다음으로 구현해야 할 요구사항은 아래와 같이 추가할 수 있다.

- 비밀번호가 최소 8자 이상, 최대 12자 이하가 아닌 경우 'IllegalArgumentException'을 발생되는 것을 확인할 수 있어야 한다.



그렇다면 이를 확인할 수 있는 두 번째 테스트 코드를 만들어 볼 것이다.

```java
    @DisplayName("비밀번호가 8자 미만 또는 12자를 초과하는 경우 IllegalArgumentException 예외가 발생한다.")
    @Test
    void validatePasswordExceptionTest() {
        assertThatCode(() -> PasswordValidator.validate("1234"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("비밀번호는 최소 8자 이상 12자 이하여야 한다.");
    }
```

코드의 내용은 앞선 assertThatCode를 통해 PasswordValidator 클래스의 validate 메서드로 비밀번호의 유효성을 검사하는 경우에, 만약 인자로 들어간 비밀번호 문자열의 길이가 8자 미만이거나 12자 초과라면 IllegalArgumentException이 잘 반환되는지, 그리고 앞서 설정한 오류 메세지를 잘 갖고 있는지를 확인하는 내용이다.



즉, 비밀번호 유효성에 위배되었을 때 발생하는 모든 상황이(위에서는 2가지) 전부 잘 일어나는지를 확인하는 것이다. 

- 위 예제에서는 IllegalArgumentException 이라는 예외를 던져야 하고 경고 문자가 제대로 들어왔는지를 확인한다.



```java
@SpringBootTest
class Ktb11Project1ChatbotBeApplicationTests {

    @DisplayName("비밀번호가 최소 8자 이상, 12자 이하이면 예외가 발생하지 않는다.")
    @Test
    void validatePasswordTest() {
        assertThatCode(() -> PasswordValidator.validate("123456789"))
                .doesNotThrowAnyException();
    }

    @DisplayName("비밀번호가 8자 미만 또는 12자를 초과하는 경우 IllegalArgumentException 예외가 발생한다.")
    @Test
    void validatePasswordExceptionTest() {
        assertThatCode(() -> PasswordValidator.validate("12345"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("비밀번호는 최소 8자 이상 12자 이하여야 한다.");
    }
}
```

테스트 실행 결과 역시 아래 사진과 같이 두 테스트 모두 통과한 것을 볼 수 있다.

<img width="646" alt="image" src="https://github.com/user-attachments/assets/1d0ae5b6-d801-4c29-9db4-88b783a7dc5b">



## 8. 테스트 통과 시 새로운 테스트 케이스 작성

우리가 테스트 코드를 작성을 할 때 반드시 따져봐야 하는 경우 중 하나는 경계 조건에서 정상 작동하는지를 확인하는 것이다. 위 예제로 미루어봤을 때, 비밀번호가 8자 미만 또는 12자 초과인 경우 예외를 내는 상황이기 때문에 그 경계 값인 7자, 13자의 경우의 테스트 코드를 반드시 작성해 봐야 하는 것이다.



경계값을 테스트 해야 하는 이유는 이 부분이 통과되는 것이 보장되어야 이후 문제가 될 여지를 남겨두지 않기 때문이다.



이 부분을 더 효율적으로 테스트해보기 위해서 그 동안 사용했던 @Test 대신에 @ParameterizedTest를 사용해볼 것이다.

- @ParameterizedTest에 대한 자세한 내용은 http://assertj.github.io 에서 확인할 수 있다.



```java
    @DisplayName("경계에 있는 길이 값에 대해 IllegalArgumentException 예외가 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"1234567", "1234567890123"})
    void validatePasswordExceptionTest2(String password) {
        assertThatCode(() -> PasswordValidator.validate(password))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("비밀번호는 최소 8자 이상 12 이하여야 한다.");
    }
```

@ParameterizedTest는 여러 개의 data source를 사용하여 테스트하는 것을 의미하고 @ValueSource로 안에 인자들을 어떤 식으로 줄 지 명시한 후 validatePasswordExceptionTest2() 메서드에 인자로 String password와 같이 string 형태의 password가 들어오게 될 것이다.라고 명시를 하면 password 변수에 앞서 @ValueSource에 지정해 둔 비밀번호 값들이 순차적으로 들어와 테스트를 진행하게 된다.

- 이렇게 되면 두 개의 인자에 대한 테스트를 각각 별도로 만들지 않고 하나의 테스트 함수만으로 경계값에 대한 테스트의 커버가 가능해진다.



이 테스트를 실행해보면 두 인자에 대한 값을 모두 테스트한  결과를 보여주게 된다.

<img width="641" alt="image" src="https://github.com/user-attachments/assets/42c96b54-93c4-45e1-bf64-d9c8d363c538">



테스트 코드를 작성하는 이유 중 하나로 '코드에 결함을 발견'하고 '테스트하기 쉬운 코드를 작성하다 보면 더 낮은 결합도의 설계를 얻을 수 있다.'는 이유가 있는데 이를 확인해보기 위해 추가적인 테스트를 진행해 볼 것이다.



방금 설명한 경우를 구현하기 위해 패스워드를 만들어주는 자바 라이브러리를 하나 설치해준다.

```
implementation 'org.passay:passay:1.6.1'
```



이 라이브러리를 기반으로 랜덤한 패스워드를 만들어주는 클래스 하나를 만들어 볼 것이다.

```java
public class RandomPasswordGenerator {
    /**
     * Special charaters allowed in password.
     */

    public static final String ALLOWED_SPL_CHARACTERS = "!@#$%^&*()_+";

    public static final String ERROR_CODE = "ERRONEOUS_SPECIAL_CHARS";

    public String generateRandomPassword() {
        PasswordGenerator passwordGenerator = new PasswordGenerator();

        CharacterData lowerCaseChars = EnglishCharacterData.LowerCase;
        CharacterRule lowerCaseRule = new CharacterRule(lowerCaseChars);
        lowerCaseRule.setNumberOfCharacters(2);

        CharacterData upperCaseChars = EnglishCharacterData.UpperCase;
        CharacterRule upperCaseRule = new CharacterRule(upperCaseChars);
        upperCaseRule.setNumberOfCharacters(2);

        CharacterData digitChars = EnglishCharacterData.Digit;
        CharacterRule digitRule = new CharacterRule(digitChars);
        digitRule.setNumberOfCharacters(2);

        CharacterData specialChars = new CharacterData() {
            @Override
            public String getErrorCode() {
                return ERROR_CODE;
            }

            @Override
            public String getCharacters() {
                return ALLOWED_SPL_CHARACTERS;
            }
        };
        CharacterRule splCharRule = new CharacterRule(specialChars);
        splCharRule.setNumberOfCharacters(2);

        // 0 ~ 12
        return passwordGenerator.generatePassword((int) (Math.random() * 13), splCharRule, lowerCaseRule, upperCaseRule, digitRule);
    }
}
```

조금 길긴 하지만 이 클래스의 역할은 0~12 자리의 random한 패스워드를 생성해주는 것이다.



그 다음은 유저가 비밀번호를 입력하는 상황을 만들어 보기 위해 User라는 클래스를 아래와 같이 만든다.

```java
public class User {
    private String password;
    
    public void initPassword() {
        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        String randomPassword = randomPasswordGenerator.generateRandomPassword();
        
        if(randomPassword.length() >= 8 && randomPassword.length() <= 12) {
            this.password = randomPassword;
        }
    }
}
```

위 코드에서는 패스워드를 랜덤으로 만들어 if문의 조건을 만족하는 경우에만 패스워드가 해당 유저 객체에 세팅되도록 하는 기능을 하고, 이 기능이 제대로 동작하는지 테스트하기 위해 아래와 같은 테스트 코드를 작성한다.

- 이러한 클래스에 대한 테스트를 만들고 싶은 경우 User 부분에 커서를 두고 Command + N을 눌러 Test... 를 선택해주면 자동으로 만들 수 있다.



그 전에 User의 필드인 password 값을 가져오기 위한 getter 메서드를 만들어준다.

- 이 역시 Command+N을 통해 getter 메뉴를 선택하여 쉽게 만들 수 있다.



```java
class UserTest {
    @DisplayName("패스워드를 초기화한다.")
    @Test
    void passwordTest() {
        // given: 이런 User 객체가 주어졌고,
        User user = new User();

        // when: 이 메소드를 호출했을 때,
        user.initPassword();

        // then: 이런 경우를 기대한다.
        assertThat(user.getPassword()).isNotNull();
    }
}
```

UserTest 코드에서는 테스트를 작성하는 방식 중 하나인 given, when, then에 기초하여 User를 생성하고 비밀번호 초기화 메소드를 실행했을 때 비밀번호가 정상적으로 초기화 되는지를 확인하는 코드이다.



이렇게 테스트코드를 계속해서 실행해 보면 매번 다른 비밀번호에 대해 테스트를 진행하는데 어떤 경우엔 실패하고 어떤 경우엔 성공하고를 반복할 것이다. 그 이유는 앞서 비밀번호를 설정할 때 8자에서 12자 사이에 들어왔을 경우에만 설정되도록 해 두었는데 해당 범위에 들지 않는 무작위 패스워드가 들어왔을 때는 오류가 발생하기 때문이다.



이렇게 랜덤한 값이 들어오는 경우에 테스트 코드를 작성하기가 꽤 까다로워 진다.



그 경우에 테스트 코드를 짜기 어려운 이유는 RandomPasswordGenerator에서 패스워드를 몇 글자의 패스워드를 만들어내는 지를 컨트롤할 수 없기 때문이다. 그렇기 때문에 새로운 인터페이스(고정된 패스워드를 만드는)를 만들어 이를 제어하도록 해볼 것이다.



<img width="668" alt="image" src="https://github.com/user-attachments/assets/7a39da8d-5ab1-4d61-b391-73b761611227">

이를 위해 main 부분에 PasswordGenerator라는 인터페이스를 하나 만들어준다. 그리고 해당 인터페이스를 RandomPasswordGenerator에서 구현받도록 설정해줍니다.



그러면 User에서는 RandomPasswordGenerator로부터 새로운 패스워드를 만들어내는 것이 아니라 PasswordGenerator로부터 만들어지게 되는데 PasswordGenerator에서는 generatePassword라는 메서드가 존재하지 않기 때문에 이 메서드를 만들어주기 위해 코드를 수정해 주어야 한다.



그렇게 되면 내 구현체는 어떤 것인지 모르겠지만 generatePassword라는 메소드를 실행했을 때 고정된 password를 받고 그 패스워드를 validate 하는 과정을 진행해나가는 것이다.



그러면 올바른 패스워드만을 고정적으로 반환하는 CorrectFixedPasswordGenerator와 틀린 패스워드만을 고정적으로 반환하는 WrongFixedPasswordGenerator를 test 부분에 만들고 각각에 대한 test를 진행해보자.



[CorrentFixedPasswordGenerator]

```java
public class CorrectFixedPasswordGenerator implements PasswordGenerator{

    @Override
    public String generatePassword() {
        return "12345678"; // 8글자 패스워드
    }
}
```



[WrongFixedPasswordGenerator]

```java
public class WrongFixedPasswordGenerator implements PasswordGenerator{

    @Override
    public String generatePassword() {
        return "12"; // 2글자 패스워드
    }
}
```



위 코드는 우선 단순하게 generatePassword 메서드를 실행시키면 각자에게 하드코딩으로 할당된 값을 반환하도록 되어있다.



[UserTest]

```java
class UserTest {
    @DisplayName("패스워드를 초기화한다.")
    @Test
    void passwordTest() {
        // given: 이런 User 객체가 주어졌고,
        User user = new User();

        // when: 이 메소드를 호출했을 때,
        user.initPassword(new CorrectFixedPasswordGenerator());

        // then: 이런 경우를 기대한다.
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("패스워드가 요구사항에 부합하지 않아 초기화가 되지 않는다.")
    @Test
    void wrongPasswordTest() {
        // given: 이런 User 객체가 주어졌고,
        User user = new User();

        // when: 이 메소드를 호출했을 때,
        user.initPassword(new WrongFixedPasswordGenerator());

        // then: 이런 경우를 기대한다.
        assertThat(user.getPassword()).isNull();
    }
}
```

테스트 코드도 초기화가 되는 경우와 되지 않는 경우 각각에 해당하는 테스트 코드를 만들어 initPassword 메서드의 인자로 앞서 만들어 준 두 클래스를 주입한다.



[User]

```java
public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator) {
//        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        String password = passwordGenerator.generatePassword();

        /**
         * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
         * */
        if(password.length() >= 8 && password.length() <= 12) {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
```

그럼 이제 User에서는 더 범용적으로 사용될 수 있도록 PasswordGenerator 인스턴스 자체를 받아 해당 인스턴스의 generatePassword를 호출하는 형식으로 코드가 수정되었다.



<img width="516" alt="image" src="https://github.com/user-attachments/assets/7630d81d-84a8-400c-8536-b5be8fabc47b">

테스트를 돌려보면 통과하는 것을 볼 수가 있다.



이를 통해 알 수 있는 점은 기존에 내부에서 RandomPasswordGenerator를 받고 있던 상황에서는 조건에 부합한다면 초기화를 하고 그렇지 않다면 초기화를 하지 않았기 때문에 이를 테스트를 하려면 컨트롤 해야 할 부분이 상당히 까다롭고 테스트를 돌릴 때마다 결과가 다르게 나오는 상황이 만들어져 테스트를 쉽게 하지 못하고, 심지어 테스트를 돌릴 때마다 다른 결과가 나오게 된다는 것이다.



그래서 상위에 PasswordGenerator라는 인터페이스를 구현해, 실제로 운영에선 RandomPasswordGenerator로 주입해주겠지만 테스트 코드를 돌릴 때만큼은 PasswordGenerator를 구현한 CorrectFixedPasswordGenerator와 WrongFixedPasswordGenerator 클래스를 대신 사용함으로써 그러한 문제를 해결할 수 있는 것이다.

- 물론 실제로 운영 단계에서는 고정적인 패스워드가 들어오지는 않지만 테스트를 할 때는 구현한 기능이 제대로 동작하는지 검증하기 위해 테스트하기 쉬운 코드를 코드를 만드는 것이 더 효율적이다.



"테스트 하기 쉬운 코드를 작성하다 보면 더 낮은 결합도의 설계를 얻을 수 있음"



위 명제에 대해 다시 생각해보면

```java
// as-is 
RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();

// to-be
String password = passwordGenerator.generatePassword();
```

앞서 살펴 본 initPassword 메서드 부분에서는 초기에 as-is 방식을 사용하여 내부에서 생성하는 패스워드였기 때문에 클래스간 강한 결합이 존재한다고 볼 수 있다. 

그래서 해당 클래스는 RandomPasswordGenerator의 영향을 굉장히 많이 받을 수밖에 없었는데, 이러한 강결합을 느슨한 결합으로 만들어주기 위해서 상위에 interface 하나를 두어, 해당 인터페이스를 통해 더 이상 RandomPasswordGenerator에 대한 의존 관계를 가지지 않을 수 있게 외부에서 주입받음으로써 더욱 느슨한 결합을 가진 코드로 재탄생 시킨 것이다.



그래서 테스트 코드를 작성할 때 무조건 RandomPasswordGenerator를 사용하는 것이 아니라 내가 사용하고 싶은 비밀번호 생성기에 대한 인스턴스 객체 그 자체를 넣어주고 이를 사용하는 User 에서는 그냥 해당 인스턴스의 generatePassword 메서드를 실행시켜주기만 하면 되기 때문에 아무런 문제가 발생하지 않을 수 있는 것이다.



그렇다 보니 테스트 코드도 더 맘편히 작성하게 될 수 있었는데 바로 이것이 저 문장의 의미인 것 같다.



그리고 사실 여기서 구현한 인터페이스는 Functional Interface이기 때문에 Interface를 구현할 필요도 없이 CorrectFixedPasswordGenerator와 WrongFixedPasswordGenerator 대신 lambda를 이용해서 구현하는 것도 가능하다.

```java
// when: 이 메서드를 호출했을 때,
user.initPassword(() -> "1234567");

// ...

// when: 이 메서드를 호출했을 때,
user.initPassword(() -> "12");
```



## 9. BDD 방식으로 사용자 시나리오 작성 및 테스트

BDD는 사용자 시나리오를 통해 시스템의 동작을 정의하고 그에 따라 테스트를 작성하는 방법론이다. 그렇기에 이 섹션에서는 BDD 방식을 사용하여 사용자 시나리오를 작성하고, 이를 기반으로 테스트를 설계하는 과정을 진행해 볼 것이다. 여기서는 Mockito를 사용하여 진행을 할 것이다.



### 사용자 시나리오 작성

사용자 시나리오는 사용자가 시스템과 상호작용하는 과정을 단계별로 설명한다. 다음은 비밀번호 생성 및 검증 기능에 대한 예시 시나리오이다.

**시나리오 1: 사용자가 비밀번호를 생성할 수 있다.**

- 배경:
  - 사용자는 회원가입을 진행하고 있다.
  - 회원 정보를 입력하는 페이지에 접근할 수 잇다.
- 시나리오: 사용자가 유효한 비밀번호를 생성할 수 있다.
  - Given: 사용자는 회원가입 페이지에 있다.
  - When: 사용자가 유효한 비밀번호를 입력하고 회원가입 버튼을 클릭한다.
  - Then: 시스템은 비밀번호가 유효하다는 메시지를 표시한다.



## 10. Gherkin 문법을 사용하여 시나리오 작성

Gherkin 문법은 BDD 기법에서 시나리오를 작성하기 위해 사용하는 언어로, 인간이 사용하는 자연어에 가까운 구조를 갖는다. 그렇기 때문에 기술적인 지식이 별도로 있지 않은 이해관계자들도 시스템 시나리오를 이해할 수 있다.



### Gherkin 문법 개요

Gherkin 문법은 'Feature', 'Background', 'Scenario', 'Given', 'When', 'Then' 키워드를 사용하여 시나리오를 작성한다. 다음은 비밀번호 생성 및 검증 기능에 대한 Gherking 문법으로 작성된 예시이다.



- features/password_generation.feature

```
Feature: Password Generation

	Background:
		Given the user if on the password generation page
	
	Scenraio: User generates a valid password
		When the user enters a valid password and clicks the generate button
		Then the system should display a message indicating the password is valid
	
	Scenrio: User generates an invalid password
		When the user enters an invalid password and clicks the generate button
		Then the system should display a message indicating the password is invalid
```



특징(Feature): 비밀번호 생성

- 배경(Background):
  - 사용자는 비밀번호 생성 페이지에 있다.
- 시나리오(Scenario): 사용자가 유효한 비밀번호를 생성할 수 있다.
  - Given: 사용자는 비밀번호 생성 페이지에 있다.
  - When: 사용자가 유효한 비밀번호를 입력하고 생성 버튼을 클릭한다.
  - Then: 시스템은 비밀번호가 유효하다는 메시지를 표시한다.
- 시나리오(Scenario): 사용자가 유효하지 않은 비밀번호를 생성할 경우
  - Given: 사용자는 비밀번호 생성 페이지에 있다.
  - When: 사용자가 유효하지 않은 비밀번호를 입력하고 생성 버튼을 클릭한다.
  - Then: 시스템은 비밀번호가 유효하지 않다는 메시지를 표시한다.





## 11. BDD 테스트 실행 및 결과 확인

Mockito를 사용할 때 when().thenReturn()와 given().thenReturn() 패턴이 있는데 전자는 org.mockito.Mockito가 제공하는 기능이고 후자는 org.mockito.BddMockito가 제공하는 기능이다.



BDDMockito는 BDD를 사용해서 테스트코드 작성 시 시나리오에 맞게 테스트 코드가 읽히도록 개선된 Mockito Framework이다. BDDMocito는 Mockito를 상속하고 있고 기능도 동일하다. 다만, BDD 구조로 쉽게 읽힐 수 있도록 도와준다.



먼저 테스트할 대상을 만들기 위해 서비스와 컨트롤러를 만들 것이다.

```java
@Service
public class PasswordService {

    public boolean initPassword(User user, PasswordGenerator passwordGenerator) {
        user.initPassword(passwordGenerator);
        return user.getPassword() != null;
    }
}
```

```java
@RestController
@RequestMapping("/password")
public class PasswordController {

    private final PasswordService passwordService;

    public PasswordController(PasswordService passwordService) {
        this.passwordService = passwordService;
    }

    @PostMapping("/init")
    public String initPassword(@RequestBody User user) {
        boolean isPasswordInitialized = passwordService.initPassword(user, new WrongFixedPasswordGenerator());
        if (isPasswordInitialized) {
            return "Password initialized successfully";
        } else {
            return "Password initialization failed";
        }
    }
}
```



그럼 이제 이 서비스 클래스를 테스트하기 위한 테스트 클래스를 만들어 그 안에 BDDMockito를 활용한 테스트 코드를 작성한다.

```java
@ExtendWith(MockitoExtension.class)
public class PasswordServiceTest {

    @InjectMocks
    private PasswordService passwordService;

    @Mock
    private PasswordGenerator passwordGenerator;

    @DisplayName("유효하지 않은 비밀번호 입력 시 비밀번호 초기화를 실패한다.")
    @Test
    void shouldNotInitializePasswordWhenGeneratedPasswordIsInvalid() {
        // Given
        User user = new User();
        given(passwordGenerator.generatePassword()).willReturn("1234");

        // When
        boolean result = passwordService.initPassword(user, passwordGenerator);

        // Then
        assertThat(user.getPassword()).isNull();
        assertThat(result).isFalse();
        then(passwordGenerator).should(times(1)).generatePassword();
        then(passwordGenerator).shouldHaveNoMoreInteractions();
    }

    @DisplayName("유효한 비밀번호 입력 시 비밀번호 초기화를 성공한다.")
    @Test
    void shouldInitializePasswordWhenGeneratedPasswordIsValid() {
        // Given
        User user = new User();
        given(passwordGenerator.generatePassword()).willReturn("123456789");

        // When
        boolean result = passwordService.initPassword(user, passwordGenerator);

        // Then
        assertThat(user.getPassword()).isEqualTo("123456789");
        assertThat(result).isTrue();
        then(passwordGenerator).should(times(1)).generatePassword();
        then(passwordGenerator).shouldHaveNoMoreInteractions();
    }
}
```



해당 코드에 대해 테스트를 돌려 본 결과 잘 동작하는 것을 볼 수 있다.



<img width="575" alt="image" src="https://github.com/user-attachments/assets/0de52d7a-2aad-48a1-ae7c-905bde5ffee9">



## 12. 통합 테스트 작성 및 실행

```java
package org.ktb.chatbotbe.domain.password;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.ktb.chatbotbe.PasswordGenerator;
import org.ktb.chatbotbe.User;
import org.ktb.chatbotbe.WrongFixedPasswordGenerator;
import org.ktb.chatbotbe.domain.password.PasswordService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
public class PasswordServiceTest {

    @InjectMocks
    private PasswordService passwordService;

    @Mock
    private PasswordGenerator passwordGenerator;

    @DisplayName("유효하지 않은 비밀번호 입력 시 비밀번호 초기화를 실패한다.")
    @Test
    void shouldNotInitializePasswordWhenGeneratedPasswordIsInvalid() {
        // Given
        User user = new User();
        given("1234").willReturn("1234");

        // When
        boolean result = passwordService.initPassword("1234");

        // Then
        assertThat(user.getPassword()).isNull();
        assertThat(result).isFalse();
        then(passwordGenerator).should(times(1)).generatePassword();
        then(passwordGenerator).shouldHaveNoMoreInteractions();
    }

    @DisplayName("유효한 비밀번호 입력 시 비밀번호 초기화를 성공한다.")
    @Test
    void shouldInitializePasswordWhenGeneratedPasswordIsValid() {
        // Given
        User user = new User();
        given(passwordGenerator.generatePassword()).willReturn("123456789");

        // When
        boolean result = passwordService.initPassword("123456789");

        // Then
        assertThat(user.getPassword()).isEqualTo("123456789");
        assertThat(result).isTrue();
        then(passwordGenerator).should(times(1)).generatePassword();
        then(passwordGenerator).shouldHaveNoMoreInteractions();
    }
}

```



```java
package org.ktb.chatbotbe.domain.password;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PasswordControllerTest {

    @LocalServerPort
    private int port;

    @Mock
    private PasswordService passwordService;

    @InjectMocks
    private PasswordController passwordController;

    private TestRestTemplate restTemplate;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        restTemplate = new TestRestTemplate();
    }

    @Test
    public void testInitPassword_Success() {
        // Arrange
        String url = "http://localhost:" + port + "/password/init";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        HttpEntity<String> entity = new HttpEntity<>("{\"password\":\"12345678\"}", headers);

        when(passwordService.initPassword(anyString())).thenReturn(true);

        // Act
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);

        // Assert
        assertThat(response.getBody()).isEqualTo("Password initialized successfully");
    }

    @Test
    public void testInitPassword_Failure() {
        // Arrange
        String url = "http://localhost:" + port + "/password/init";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        HttpEntity<String> entity = new HttpEntity<>("{\"password\":\"1234\"}", headers);

        when(passwordService.initPassword(anyString())).thenReturn(false);

        // Act
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);

        // Assert
        assertThat(response.getBody()).isEqualTo("Password initialization failed");
    }
}

```



위 코드를 기반으로 통합 테스트를 돌려보았다.



통합 테스트를 돌리기 위해선 터미널에 아래 명령어를 입력해주면 된다.

- ./gradlew test



<img width="1363" alt="image" src="https://github.com/user-attachments/assets/dbb5d880-3c84-415f-999d-b6a8bc2d5654">





## 13. 테스트 커버리지 확인 및 보고서 작성

테스트 커버리지를 확인하기 위해선 jacocoTest 라이브러리를 적용해 주어야 한다.

build.gradle에서 아래 코드를 추가해주면 등록이 되고 통합 테스트가 완료되면 build 폴더 아래에 테스트 커버리지를 확인할 수 있는 html 파일이 만들어지게 된다.



```
plugins {
	...
    id 'jacoco'
}
jacoco {
    toolVersion = "0.8.8"
    reportsDirectory = layout.buildDirectory.dir('customJacocoReportDir')
}
test {
    // finalizedBy : 이(test) 작업에 대해 주어진 종료자 작업을 추가
    finalizedBy jacocoTestReport // test 작업이 끝나고 jacocoTestReport를 실행
}
jacocoTestReport {
    reports {
        xml.required = false
        csv.required = false
        html.outputLocation = layout.buildDirectory.dir('jacocoHTML')
    }
    // dependsOn : 이 작업에 지정된 종속성을 추가
    dependsOn test // jacocoTestReport 에 test라는 종속성을 추가
    finalizedBy 'jacocoTestCoverageVerification'
}

jacocoTestCoverageVerification {
    violationRules {

        rule {
            enabled = true
            //코드 버커리지 체크 기준
            element = 'CLASS'

            limit {
                counter = 'METHOD'
                value = 'COVEREDRATIO'
                minimum = 0.5
            }
        }
    }
}

dependencies {
	...
	testImplementation('org.jacoco:org.jacoco.core:0.8.6')
}
```



<img width="1045" alt="image" src="https://github.com/user-attachments/assets/92addb7d-3c74-481f-87d3-6e20b1e24d2b">

위 사진은 테스트 커버리지를 시각화하여 보여주는 html이다.



해당 리포트에서 세부 내용을 확인하면 각각의 메서드에 대한 커버리지 퍼센트까지 자세히 볼 수 있으며 코드에서 색깔로도 확인 가능하다. 빨간색은 커버하지 못한 부분, 노란색은 100프로 커버하지 못한 부분, 초록색은 완벽하게 커버된 부분을 나타낸다.



### 분석 보고서

테스트는 Spring Boot Test와 Mockito를 사용하여 작성되었으며, 테스트 커버리지 측정을 위해 JaCoCo를 사용했다.



#### 테스트 요약

- 총 테스트 클래스: 2
- 총 테스트 메소드: 3
- 성공한 테스트 메소드: 3
- 실패한 테스트 메소드: 0



#### 코드 커버리지

- **라인 커버리지 (Line Coverage)**: 코드의 각 라인이 테스트된 비율
- **분기 커버리지 (Branch Coverage)**: 조건문 내의 각 분기가 테스트된 비율

| 항목          | 커버리지(%) |
| ------------- | ----------- |
| 라인 커버리지 | 87%         |
| 분기 커버리지 | 91%         |



#### 커버리지 상세 보고서

1. **전체 커버리지**
   - 총 라인 수: 108
   - 테스트되지 않은 라인 수: 14
   - 라인 커버리지: 87%
   - 총 분기 수: 12
   - 테스트되지 않은 분기 수: 1
   - 분기 커버리지: 91%
   - 복잡도: 24
   - 테스트되지 않은 복잡도: 5
   - 메소드: 33
   - 테스트되지 않은 메소드: 5
   - 클래스: 8
   - 테스트되지 않은 클래스: 0
2. **org.ktb.chatbotbe 패키지**
   - 총 라인 수: 1245
   - 테스트되지 않은 라인 수: 78
   - 라인 커버리지: 78%
   - 총 분기 수: 87
   - 테스트되지 않은 분기 수: 17
   - 분기 커버리지: 87%
   - 복잡도: 16
   - 테스트되지 않은 복잡도: 4
   - 메소드: 17
   - 테스트되지 않은 메소드: 4
   - 클래스: 12
   - 테스트되지 않은 클래스: 3
3. **org.ktb.chatbotbe.domain.password 패키지**
   - 총 라인 수: 249
   - 테스트되지 않은 라인 수: 4
   - 라인 커버리지: 96%
   - 총 분기 수: 8
   - 테스트되지 않은 분기 수: 0
   - 분기 커버리지: 100%
   - 복잡도: 8
   - 테스트되지 않은 복잡도: 1
   - 메소드: 16
   - 테스트되지 않은 메소드: 1
   - 클래스: 6
   - 테스트되지 않은 클래스: 0



#### 결론 및 개선 방안

해당 테스트에서 `PasswordController`와 `PasswordService` 클래스는 높은 라인 커버리지를 달성했다. 그러나, `PasswordController`의 분기 커버리지가 다소 낮은 부분이 있었고 특히, 비밀번호 초기화 실패에 대한 분기 테스트가 필요하다.

**개선 방안:**

1. 비밀번호 초기화 실패 시나리오에 대한 추가 테스트 케이스 작성
2. 예외 상황에 대한 테스트 케이스 강화
3. 테스트 커버리지 도구(JaCoCo)에서 제공하는 리포트를 기반으로 누락된 테스트 항목 보완



## 14. TDD 및 BDD 적용 사례 연구 및 보고서 작성

### 구글의 검색 엔진 - TDD

구글은 세계에서 가장 널리 사용되는 검색 엔진을 운영하고 있으며, TDD를 통해 검색 알고리즘의 품질을 보장하고 있다. 구글의 개발팀은 새로운 검색 기능을 추가하거나 기존 기능을 개선할 때마다, 먼저 테스트 코드를 작성하고 이를 바탕으로 기능을 구현한다. 예를 들어, 새로운 검색 필터 기능을 추가할 때, 해당 기능의 모든 가능한 시나리오를 테스트 코드로 작성하고, 테스트를 통과할 수 있도록 구현한다.

이러한 TDD 접근 방식은 구글 검색 엔진의 정확성과 신뢰성을 높이는 데 큰 기여를 하고 있다. 테스트 코드가 먼저 작성되기 때문에, 개발자는 예상치 못한 버그를 사전에 발견하고 수정할 수 있으며, 새로운 기능이 기존 기능과 충돌하지 않도록 보장할 수 있다.



### 페이스북의 뉴스 피드 알고리즘 - TDD

페이스북은 전 세계 수십억 명의 사용자가 이용하는 소셜 미디어 플랫폼으로, 뉴스 피드 알고리즘의 정확성과 개인화 수준을 높이기 위해 TDD를 적극적으로 활용하고 있다. 페이스북의 개발팀은 뉴스 피드에 표시될 콘텐츠를 선정하는 알고리즘을 개선할 때마다, 먼저 테스트 코드를 작성하여 새로운 알고리즘이 사용자의 관심사와 맞는지, 성능이 향상되는지를 검증한다.

페이스북의 TDD 적용 사례는 뉴스 피드 알고리즘의 정확성을 높이고, 사용자의 만족도를 극대화하는 데 큰 도움이 되었다. 또한, 테스트 코드 작성이 우선되기 때문에, 알고리즘의 변경이 기존 시스템에 미치는 영향을 최소화할 수 있다.



### 트위터의 트윗 작성 기능 - BDD

트위터는 전 세계 수백만 명의 사용자가 실시간으로 소식을 공유하는 소셜 미디어 플랫폼이다. 트위터는 트윗 작성 기능을 개선하기 위해 BDD를 적극적으로 활용하고 있다. 트위터의 개발팀은 새로운 트윗 작성 기능을 추가할 때마다, 먼저 'Given-When-Then' 형식을 사용하여 사용자 시나리오를 정의한다.

예를 들어, "사용자가 트윗 작성 버튼을 클릭했을 때, 새로운 트윗 작성 창이 나타나고, 작성된 트윗이 성공적으로 게시되는지"에 대한 시나리오를 작성한다. 이 시나리오를 바탕으로 테스트 코드를 작성하고, 테스트를 통과할 수 있는 코드를 구현한다. 이러한 BDD 접근 방식은 트위터의 트윗 작성 기능의 사용성을 높이고, 버그를 줄이는 데 큰 기여를 하고 있다.



### 에어비앤비의 예약 시스템 - BDD

에어비앤비는 전 세계 숙박 시설을 연결하는 플랫폼으로, 사용자가 숙소를 예약하는 과정을 간소화하고 사용자 경험을 향상시키기 위해 BDD를 도입했다. 에어비앤비의 개발팀은 예약 시스템의 새로운 기능을 추가하거나 기존 기능을 개선할 때, 'Given-When-Then' 형식을 사용하여 사용자 시나리오를 정의한다.

예를 들어, "사용자가 특정 날짜에 숙소를 검색했을 때, 해당 날짜에 예약 가능한 숙소 목록이 나타나는지"에 대한 시나리오를 작성한다. 이 시나리오를 기반으로 테스트 코드를 작성하고, 테스트를 통과할 수 있는 코드를 구현한다. 이러한 BDD 접근 방식은 에어비앤비의 예약 시스템의 신뢰성과 사용성을 크게 향상시켰다. 또한, 비기술적 이해관계자도 기능 정의와 테스트 과정에 참여할 수 있기 때문에, 요구사항의 명확성과 안전성을 보장할 수 있었다.



### 정리

TDD와 BDD는 각각의 철학과 접근 방식을 가지고 있지만, 궁극적인 목표는 동일하다. 바로 소프트웨어의 품질을 보장하고, 개발자와 이해관계자 간의 소통을 원활하게 하는 것이다. TDD는 코드의 품질을 높이고, 버그를 줄이는 데 효과적이며, BDD는 사용자 중심의 개발과 요구사항 명확화에 강점을 가진다.

각각의 프로젝트와 팀의 특성에 따라 TDD와 BDD 중 적합한 방법론을 선택하여 적용하는 것이 중요하다. 소규모 프로젝트나 기술적 요구사항이 명확한 경우에는 TDD가 적합할 수 있으며, 대규모 프로젝트나 사용자 중심의 기능이 중요한 경우에는 BDD가 효과적일 수 있다.

따라서, 소프트웨어 개발자는 TDD와 BDD의 원리와 적용 사례를 잘 이해하고, 프로젝트의 특성에 맞게 적절한 방법론을 선택하여 적용하는 것이 중요하다. 이를 통해 소프트웨어의 품질을 높이고, 개발 과정에서의 오해와 재작업을 줄일 수 있을 것이다.



## 15. 코드 리팩토링을 통한 테스트 최적화

### 자주 쓰이는 message 변수로 분리

프로덕션 코드 중 컨트롤러 부분을 작성할 때 최종 응답으로 메시지 문자열을 반환하는 경우가 있는데 이를 테스트하기 위해서 이 응답 문자열이 제대로 오는지 확인할 필요가 있다.



이런 경우에 문자열을 그대로 작성하여 둘이 같은지 비교한다고 해도 사람이 직접 타이핑을 하기 때문에 실수를 할 수 있다. 그래서 이럴 때는 해당 문자열을 따로 변수로 빼고 해당 변수를 사용하는 방식으로 그 문제를 간소화시킬 수 있다.



```
// Before
assertThat(response.getBody()).isEqualTo("Password initialization failed");
```



```
// After
private static final String WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE;
assertThat(response.getBody()).isEqualTo(WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE);
```



그러면 이 변수가 필요한 상황이 또 있을 때 이 변수를 사용하기만 하면 되기 때문에 재사용성을 증가시켰다고 할 수 있다.



## 16. 지속적인 통합(CI) 설정 및 테스트 자동화

### CI 도구 선택

- Github Actions



### Github Actions 설정

- 워크플로우
  - `on`: 워크플로우가 실행될 이벤트를 정의합니다. 여기서는 main 브랜치에 대한 `push`와 `pull_request` 이벤트에서 워크플로우가 실행됩니다.
  - `jobs`: 워크플로우 내에서 실행할 작업을 정의합니다. build 작업은 Java 프로젝트의 빌드 및 테스트를 수행합니다.
    - `runs-on`: 워크플로우가 실행될 환경을 정의합니다. 여기서는 최신 Ubuntu 버전을 사용합니다.
    - `steps`: 각 작업 내에서 실행될 단계들을 정의합니다.
      - `Checkout code`: 코드를 체크아웃합니다.
      - `Set up JDK 11`: JDK 11을 설정합니다.
      - `Cache Gradle packages`: Gradle 패키지를 캐시하여 빌드 시간을 단축합니다.
      - `Grant execute permission for gradlew`: Gradle Wrapper에 실행 권한을 부여합니다.
      - `Build with Gradle`: 프로젝트를 빌드합니다.
      - `Run tests`: 테스트를 실행합니다.
      - `Generate JaCoCo test report`: JaCoCo 테스트 보고서를 생성합니다.



### 결과 확인









## 17. 최종 결과물 제출 (코드, 테스트 시나리오, 테스트 커버리지 보고서, 적용 사례 보고서)

- [x] 코드
- [x] 테스트 시나리오
- [x] 테스트 커버리지 보고서
- [x] 적용 사례 보고서





# 작업 중 발생한 이슈/해결 방법

.



# 새롭게 알게 된 내용

.



# Reference

- https://testing.googleblog.com/2014/04/the-real-test-driven-development.html
- https://link.springer.com/article/10.1007/s10664-020-09895-8





