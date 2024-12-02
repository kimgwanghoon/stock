# [인프런] 재고시스템으로 알아보는 동시성이슈 해결방법
[인프런 강의](https://www.inflearn.com/course/%EB%8F%99%EC%8B%9C%EC%84%B1%EC%9D%B4%EC%8A%88-%EC%9E%AC%EA%B3%A0%EC%8B%9C%EC%8A%A4%ED%85%9C)

## [v1] 동시성 고려되지 않은 재고관리 로직
 - 메소드에 `@Transactional` 사용하여 DB 트랜잭션 처리
 - 다중 스레드로 동시에 재고처리시 원하는 결과가 나오지 않는다.

## [v2] synchronized로 동시성 제어하기
  - 메소드에 `synchronized`를 사용하여 동시성 제어
    - `@Transactional`과 `synchronized`를 같이 사용하면 `@Transactional`의 동작으로 인해 이전과 같은 문제가 발생한다.
  - `synchronized`의 사용은 같은 프로세스에서만 동시성을 보장하기 때문에 분산 서비스 환경에서는 적합하지 않기에 거의 사용하지 않는다.
