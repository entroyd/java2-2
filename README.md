<h1> 노강민 학번 202230210<h1>

정상작동







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

## 4월 29일
# 정수 리터럴
15 -> 10진수
015 -> 0으로 시작하면 8진수, 10진수로 13
0x15 -> 0x로 시작하면 16진수, 10진수로 21
0b0101 -> 0b로 시작하면 2진수, 10진수로 5

## Long 타입으로 지정할땐 
long i = 24l; 이런식으로 l이나 L을 붙이면 된다

## 실수 리터럴
실수 리터럴은 소수점 형태나 지수형태로 실수를 표현한 값
예: 12. 12.0 .1234 0.1234 1234E-4

## 실수 리터럴은 double타입으로 자동 처리되며 변수와 함꼐 사용하면 된다
double d = 0.1234;
double e = 1234E-4; <- 1234E-4 = 1234x10<sup>-4</sup>이므로 0.1234와 동일

## 숫자 뒤에 f또는 F를 붙이면 float으로 d 또는 D를 붙이면 double타입으로 강제 변환 할수있다
float f = 0.1234f; <- 0.1234는 원래 double타입이므로 
double w = .1234D; <- .1234D와 .1234는 동일

# 문자 리터럴
문자 리터럴은 단일 인용부호('')로 문자를 표현하거나 \u 다음에 문자의 유니코드값을 사용하여 표한한다 
예: 'a', 'W', '가’, '3', '글'

변수와 함께쓰면
char a = 'W';
char b = '글';
char c = \uae00; <- 글의 유니코드 값 ae00을 \u뒤에 사용

# 특수문자 리터럴
백슬래쉬(\) 다음에 특수 기호를 붙여서 표한하는데 이를 이스케이프 시퀸스(escape sequence)라고 한다

종류
'\b' <- 백스페이스
'\t' <- 탭
'\n' <- 라인피드(줄바꿈)
'\f' <- 폼피드(커서를 다음 페이지의 시작부분으로 넘김)
'\r' <- 캐리지 리턴(커서를 다음줄로 넘기지 않고 첫 번째 위치로 넘김)
'\"' <- 큰따옴표
'\'' <- 작은따옴표
'\\' <- 백슬래쉬(역슬래쉬)

# null 리터럴
null은 기본 타입에 사용하지못하고 객체 레퍼런스에 대입된다

## null은 int,double,boolean등과 같은 기본타입에 적용불가

String str = null; <- 이런식으로 사용

# 문자열(String) 리터럴
"hello"와 같이 큰따옴표에 묶어서 표현한다
String str = "hello";

# var 키워드
java10부터 var키로드를 사용하여 타입을 생략하고 간단히 변수선언 가능
var키워드는 자동으로 타입 결정
## 초깃값이 주어지지 않으면 오류 발생
## 지역 변수로만 사용가능

# 상수 
리터럴을 상수로 선언하면 변수처럼 표현 가능
상수는 final키워드를 사용하여 선언

final double PI = 3.141592;
final -> 상수선언
double -> 데이터 타입
PI -> 상수 이름
3.141592 -> 이 값으로 초기화

## final키워드를 사용할땐 앞에 static을 붙여줘야 좋다

# 타입변환

## 자동 타입 변환
다음과 같이 치환문(=)이나 타입이 일치하지 않을 때 컴파일러는 작은 타입을 큰 타입으로 자동변환
long m = 24; <- 25는 int타입으로서 long타입으로 자동변환
double d = 3.14 * 10; <- 실수를 연산하기위해 10.0으로 자동변환

## 강제 타입 변환
int n = 300;
작은 타입에서 큰타입으로 변환 가능
큰 타입에서 작은타입으로 변환하면 컴파일러는 오류를 발생시킨다

손실이 발생한다는걸 알고도 강제 변환하려면 
byte b = (byte)n;
이처럼 괄호안에 타입을 넣어서 강제 변환이 가능하다

## 강제 타입 변환을 캐스팅(casting)이라고도 부른다.

# System.in
System.in은 표준 입력 스트림 객체로 키보드 입력을 받기위해 사용
System.in을 사용하면 읽은 바이터 정보를 문자나 숫자로 변환해야하는 번거로움이 있다
그래서 저수준(low-level)인 System.in보다 고수준(high-level)인 Scanner를 사용하는것이 좋다

# Scanner 객체 생성
Scanner sc = new Scanner(System.in);
이런식으로 sc라는 이름의 객체를 생성할수 있다

## Scanner객체는 System.in으로 하여금 키보드로 <br>입력을 받고 문자,문자열,정수,실수등으로 변환하여 리턴해준다

# Scanner 사용할떄 import
Scanner를 사용하기위해 java.util.Scanner를 import해야한다
예: import java.util.Scanner;

## Scanner 주요 메소드
각 타입별로 사용방법 {
  String next()
  byte nextByte()
  shor nextShort()
  int nextInt()
  long nextLong()
  float nextFloat()
  double nextDouble()
  boolean nextBoolean()
  String nextLine ->두줄 입력하면 첫번째 라인만 scanner객체에 저장
  void close() 
  boolean hasNext() -> 입력할게 있으면 true를 반환하고 아니면 false를 반환
}



 * eclips 가 자바 기본 개발화경이지만 vscode가 더 편하여 사용 

## 4월 5일
 * 2차원배열 
    1. 배열 선언과 과 동시에 초기화 

 * 매소드의 배열 리턴
    1. 배열리턴
        * 배열의 레퍼런스만 리턴
    2. 매소드의 리턴 타입
        * 리턴하는 배열 타입과 리턴받는 배열타입 일치
        * 리턴타입에 배열의 크기를 지정하지 않음
        
 * 자바의 예외 처리
    1. 예외
        * 실행중 오작동하거나 결과에 악영향을 미치는 예상못한 상황 발생
            * 가비지 에서는 실행중 발생하는 에러를 예외로 처리
    2. 실행중 예외처리 사례
        * 예외가 발생하여 강제로 프로그램이 종료되는 상황 발생
 * 자바 상속
    1. 사위클래스의 멤버를 하위클래스가 몰려받음
 * 다형성
    1. 같은 이름의 매소드가 클래스 혹은 객체의 따라 다르게 구현되는 것
        * 다형성 사례
            * 매소드 오버로딩 - 하늘래스 내에서 가은 이름이지만 다르게 작동하는 여러 메소드
            * 메소드 오버라이딩 - 슈퍼 클래스의 메소드를 동일한 이름으로 서브 클래스 마다 다르게 구현

 * 갹채지향 언어의 목적
    1. 소프트웨어 생산성 향상
        * 컴퓨터 산업의 발전에 따라 소프트웨어의 생명주기 단축
            * 소프트웨어를 빠른속도로 생산할 필요성 증대
        
 * 절차 지향 로그래밍과 객체지향 프로그래밍
    1. 절차 지향 프로그램
        * 작업순서를 표현하는 컴퓨터 명령 집합
        * 함수들의 집합으로 프로그램 작성
    2. 객체자향 프로그램


 * 클래스와 객체
    * 클래스
        1. 객체의 속성 과 행의 선언
        2. 객체의 설계속도 혹은 틀
    * 객체
        1. 클래스의 틀로찍어낸 객체
    
 * 자바 클래스 구성
    1. 클래스
        * class 키워드로 선언
        * 멤버 : 클래스 구성요소
            1. 필드와 메소드
        * 클래스에 대한 public 접근 지정 : 다른모든 클래스에서 믈래스 사용 하락
        * 멤버에 대란 public 접근 지정 : 다른 모든 클랴스에게 멤버 접근 허용

 * 매소드 오버라이딩

 * 가비지
    1. 가르키는 매소드가 하나도 없는 래퍼런스
 * 가비지 컬렉션
    1. 자바 가상 기계가 가비지 자동 회수
     *가용메모리 공간이 일정 이하로 부족해질떄
 * 패키지 
    1. 상호 관련있는 클래스 파일을 저장하여 관리하는 디렉터리
    2. 자바 응용프로그램은 하나 이상의 패키지로 구성 


## 4월 12일

 * static 멤버
    1. static 멤버 ( 전역 멤버 )
 * non-static 멤버 
    1. nonstatic 멤버는 객체가 생성될때, 개체마다 생긴다
    
    * 스태틱 멤버는 클래스당 하나만 생성
    * 객체들에 의해 공유됨
    * 클래스 이름으로 접근가능
    * 객체의 멤버로 접근가능
    * non-static 멤버는 클래스 이름으로 접근안됨
 
 * 매소드의 제약 조건 2
    1. static 매소드는 this 사용 불가 
 * final 필드
    1. 상수를 선언 할때 사용
    2. 상수 필드는 값이 초기화되면 변경불가
    3. public class 와 함께 선언시 프로그램 전체 공유 가능 

 * 상속
    1. 상속은 클래스 사아에서 코드 중복을 제거하여 코드를 간결하게해줌
 * 상속 선언
    1. extend 키워드로 사용하여 상속
 * 슈퍼클래스
    1. private 서브 클래스에접속 불가능 자기 자신만가능
    2. 서브클래스가 동일한 패키지에 있을땐 접속가능
 * protected 멤버
    1. 같은 패키지의 모든클래스에게 어용
        * 상속되는 서브클래스
 * 슈퍼클래스와 서브클래스
    1. 각각 여러개의 생성자 작성 가능
    2. 서브 클래스의 색체가 생성될떄
        * 슈퍼 클래스 생성자 1개와 서브클래스 1개가 실행 
    3. 서브 클래스와 슈퍼 클래스의 생성자가 결정되는 방식 
        * 개발자의 명시적 선택
            1. 서브 클래스 개발자가 슈퍼클래스의 생성자 명시적 선택 super() 키워드를 이용해 선택
        * 컴파일러가 기본생성자 선탯
            1. 서브클래스 생산자가 슈퍼클래스 생성자를 선택하지 않았을 때
            2. 컴파일러가 자동으로 기본생성자의 슈퍼클래스 선택
 * 업캐스팅 = 슈퍼클래스 레퍼런스를 서브클래스 레퍼런스에 대입
 * 다운캐스팅 = 서브클래스 레퍼런스를 슈퍼 클래스 래퍼런스에 대입



 # 5월 3일 수업 
 * 컬렉션의 개념 
    1. 요소 라고 불리는 가변 개수의 객체들의 저장소 
 * 컬렉션은 제너릭 기법으로 구현
    1. 특정 타입만 다루지 않고, 여종류의 타입으로 변신할 수 있도록 클래스나 메소드를 변홤하는 개념 
 * 컬렉션 요소는 객체만 가능

 * 제네릭 개념
    1. 클래스나 메소들을 틀처럼 생성하는 기법 
 
 * 백터의 특성
    1. 사용할 요소에 따라 특정 타입으로 구체화 
    2. 백터의 삽입 가능한것 객체 널 기본적인건 왼만해서 다넣어짐 또한 임이의 위치에 있는 객체도 삭제가능
* 컬렉션과 자동박싱/언박싱

 * array list 
    1. 백터랑 거의 동일 

 * 컨테이너 
    1. 다른 컴포넌트를 포험할수있는 GUI 컴포넌트
    2. 다른 컨테이너 포함가능
 * 스윙 프레임 
    1. jmprame 클래스를 상속 받는 클래스 작성 
    2. 클래스 크기 반드시 지정
    3. 프레임을 화면에 출력하는 코드 반드시 필요

## 5월 24일 수업 


* 이벤트 기반 플그래밍
    1. 이ㄴ트의 발생에 의해 프로그램흐름이 결정되는방식
* 이벤트 기반 응용 프로그램 구조
    2. 각이벤트 마다 처리하는 리스터 코드보유
* GUI 프로그램은 이벤트 기반 프로그래밍으로 작성됨

* 이벤트 기반 프로그래밍 
    1. 이벤트의 발생에 의해 프로그램 흐름이 결정되는 방식
* 반대 되는 개념 , 배치 실행

* 이벤트 처리 과정 
    1. 이벤트 발생 - 이벤트 객체 생성 - 응용 프로그램 작성된 이벤트 리너스 찾기 -이벤트 리스너 실행
* 이벤트 객체 
    1. 아밴트 객체 
    2. 이벤트 객체가 포하되는정보
    3. 이벤트 소스를 알아내는 메소드

* 이벤트 리스너 

 1. 자바는 다양한 리스너 인터페이스 제공
 2. 사용자의 이벤트 리스너 작성
 

* 이벤트 리스너 작성과정 사례
    1. 이벤트와 이벤트 리스너 선택
    2. 이벤트 리스너 클래스 작성
    3. 이벤트 리스너 등록
* 이벤트 리스너 작성 방법
    1. 독립 클래스로 작성
    2. 내부클래스(inner class)로 작성
    3. 익명 클래스(anomymous class)로 작성
* key 이벤트 포커스
    1. 키입렧 다음 세경우 각각의 키 이벤트 발생 
        1. 키를 누른순간
        2. 누른키를 떼는 순간
        3. 누른키를 때눈순간 (유니코드 경우에만)
    2. 키이벤트를 받을수 있는 조건
        1. 모든 컴포넌트
        2. 현재 포커스를 가진 컴포넌트가 키 이벤트 독점
    3. 포커스
        1. 컴포넌트나 응용프로그램이 키 이벤트를 독점하는 권한
        2. 컴포넌트에 포커스 설정 방법 (다름 2 라인 코드 필요)
        * 책 내용 확인
        
    