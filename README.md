# 노강민 학번 202230210

## 3월 25일
 내용 
 



## 3월 15일
 내용
 커밋방법 - 
 파일 수정후 메시지에 수정한 내용 요약해서 커밋 누르기(메시지 입력안할시 커밋 안됨)
 이그노어 - 
 파일명 및 확장자 입력시 커밋할때 입력된 파일명 및 확장자 커밋에서 제외됨

## 3월 22일
 * 내용
 * <h2> 자바 플랫폼에 독립성 / 자바 응용프로그램 실행 환경 </h2>
 * wora(write once run anywhere)
    1. 한번 작성된 코드는 모든 플랫 폼에서 실행되는게 자바의 특징
    2. c/c++ 등 기존언어가 가진 플랫폼 종속성 극복
    3. 네트워크에 연결된 어느 클라이언트에서나 실행가능

 * wora를 가능하게 하는 자바의 특징
    1. 바이트코드(byte code)
        * 자바소스를 컴파일한 목적 코드
        * cpu에 종속되지않는 코드


* 실행환경
    * 자바가상기계+자바 플랫폼의 다향한 클래스 라이브러리(자바 api)



* 자바와 실행 환경 
    * 자바소스 코드 파일-> 컴파일러 ->바이트코드(test class) -> 자바프로그램 (자바 가상기계) 운영체제,하드웨어

* jdk
    * 자바 응용 개발환경
* jre
    1. 자바 실행 환경
    2. 개발자가 아닌경우 jre만따로 다운로드가능
* jdk 와 jre 다운로드
   * 오라클에서 다운로드 가능
* jdk의 bin 디렉토리에 포함된 주요 개발 도구
    1. javac  자바 커마일러로 자바 소스를 바이트코드로 변환
    2. java  자바프로그램 실행기, 자바 가상기계를 작동시켜 자바프로그램 실행
    3. javadoc  자바 소스로부터 HTML 형식의 API 도큐먼트 생성
    4. jar  자바 클래스 파일을 압축한 자바 아카이브 파일(.jar) 생성, 관리
    5. jmod  자바의 모듈 파일(.Jmod)을 만들거나 모듈 파일의 내용 출력
    6. jlink  응용프로그램에 맞춘 맞춤형(custom) JRE 생성
    7. jdb  자바 응용프로그램의 실행 중 오류를 찾는 데 사용하는 디버거
    8. javap  클래스 파일의 바이트 코드를 소스와 함께 보여주는 디어셈블러

* jdk 는 유료와 무료 로 나뉨
    * open jdk - 무료 
      * ㄴ대중적인 jdk

* 자바 api
    * 자바api
        1. jdk에 포한됨 클래스 라이브러리
        2. 개발자들은 api를 이용하여 자바클래스들을 선택해 개발
        * (개발자들이 사용하도록 미리 만들어놓은 유용한 자바 클래스들 집합)
* 자바 간단한 대표적인 예시
    1. 메모장(txt)파일로 간다히 작성해도 컴파일이 가능하다
       *  ex> 메모장 이룸을 자바 클래스랑 똑같이 만든후 코드 작성후 확장자를 java로 바꾼후 실행

* 자바 응용프로그램 종류
    1. 자바 응용프로그럄으로 개발된 게임
    2. 서블릿 응용프로그램 (서버용 자바 프로그램)
    3. 안드로이드 앱  (메모리 사용양이적은 임베디드 프로그램 - EX-> iot, tv, 블루레이 셋톱박스 등등 )

* 자바의 특성
    1. 플랫품 독립성
        * 하드웨어, 운영체제 종속되지 않는 바이트 코드로 플랫폼 독립성
    2. 객체지향
        * 캡슐화, 상속, 다향성 지원
    3. 클래스로 캡술화
        * 자바의 모든 변수나 함수는 클래스 내에 선언
        * 클래스 안에서 클래스 작성가능
    4. 소스(*.java)와 클래스(*.class) 파일
        * 하나의소스 파일에 여러 클래스를 작성가능
            * public 클래스는 하나만 가능
        * 소스 파일의 이름과 public으로 선언된 클래스 이름은 같아야함
        * 클래스 파일에는 하나의 클래스만 존재
            * 다수의 클래스를 가진 자바 소스를 컴파일 하면 클래스마다 별도 클래스 파일 생성 해야됨

* 자바의 특징(2)
    1. 실행코드 배포
        * 구성
            1. 한개의 class 파일 또는 다수의 class 파일로 구성
            2. 여러 풀더에 걸쳐 다수의 클래스 파일로 구성된 경우 : jar압축 파일로 배포
        * 자바 응용프로그램의 실행은 main() 메소드에서 시작
            1. 하나의 클래스 파일에 두개 이상의 main()매소드가 있을 수 없음
                * 각클래스 파일이 main() 메소드를 포합하는 것은 상관 없음
    2. 패키지
        * 서로 관련 있는 여러 클ㄹ스를 패키지로 묶어 관리
        * 패키지는 풀더 개념
            * ex> java.lang.System은 java₩lang 디렉토리의 System.class 파일
    3. 멀티 스레드
        * 여러개 스레드를 동시 수행 환경 지원
            1. 자바는 운영체제 없이 멀티스레드 지원
            2. c/c++ 프로그램은 멀티스레드를 위해 운영체체 api 호출
    4. 가비지 컬렉션
        * 자바 언어는 메모리 할당 기능은 있어도 메모리 변환 기능 없음
            * 사용하지 않는 메모리는 자바 가상 기계에 의해 자동 변환 -가비지 컬렉션

* 자바의 특징 (3)
    1. 실시간 응용 프로그램에 부적합
        * 실행 도중 예측할 수 없는 시점에 가비지 컬레션 실행 때문
            * 응용프로그램의 일시적 중단 발생
    2. 자바 프로그램은 안전
        * 타입 체크 엄격
        * 물리적 주소를 사용하는 포인터 개념 없음
    3. 프록램 작성 쉬움
        * 포인터 개념 없음
        * 동격 메모리 변환 하지 않음
        * 다양한 라이브러리 지원
    4. 실행 속도 개선을 위한 JIT 컴파일러사용
        * 자바는 바이트 코드를 인터프러터 방식으로 실행
            * 기계어가 실행되는 것보다 느림
        * JIT 컴파일 기법으로 실행속도 계선
            * JIT 컴파일 - 실행 중에 바이트 코드를 기계어 코드로 컴파일하여 기계어를 실하는 기법

* 식별자란?
    1. 클래스,변수,상수,매소드 등에 붙는 이름
    2. 식별자의 원칙
        1. 특수 문자 공백 또는 앱의 식별자로 사용 불가능하나 공백, _ , $ 는사용가능
        2. 유니코드 문자 사용가능 , 한글 사용가능
        3. 자바 언어의 키워드는 식별자로 사용불가
        4. 위에 1번에서 사용가능 하다한 특수문자들을 첫번째 문자로도 사용 가능하나 일반적으로 잘사용하지 않음 
        5. 블린 리터널(true, false) or (null) 은 식별자로 사용불가
        6. 길이제한 없음
    3. 대소문자 구별
        * int barChar; 와 int barchar; 는 서로 다른 식별자로 취급 
* 리터널 정수 리터널
    1. 리터널
        * 프로그램에서 직접 표현한 값
        * 정수, 실수, 문자, 논리, 문자열 이터널 있음
    2. 정수 리터널
        * 10진수, 8진수, 16진수, 2진수 리터널
        * 정수 리터널은 int 형으로 컴파일
        * long 타입 리터널은 숫자뒤에 L 또는 l을 붙여 표시

* <h2> 요번주 학습 목표 </h2>
1. 자바의 프로그램의 기본구조 이해
2. 자바의 데이터 타입 이해
3. 자바에서 키 입력 받는 방법 이해
4. 자바의 연산자 이해
5. 자바의 조건문(if - else 와 switch) 이해

* java 에서 println("hello") 에서 println 을 쓰는 이유는 ln 을 빼고 print 만쓰면 출력후 자동 줄바꿈이 안되기때문 
    1. 만약 print에서도 줄바꿈을 원하면 print("hi \n")   -> \n <- 사용하여 줄바꿈 시행



 * eclips 가 자바 기본 개발화경이지만 vscode가 더 편하여 사용 