package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {

    static int i;

    /**
     * 클래스 변수, 클래스에 속해있는 직속 변수 : 전역 변수 (global variables), 같은 클래스에서도 다른클래스에서도 호출이 가능
     * i 라는 변수를 메소드 밖 클래스 영역에서 선언.
     */

    static void a() { //
        i = 0; // 선언 없이 할당만, 지역 변수, 메소드안에서만 사용가능
    }

    public static void main(String[] args){
        for(i = 0; i<5; i++) { // i의 값 선언없이 할당만, 지역 변수, for 문 중괄호 안에서만 사용가능
            a();
            System.out.println(i);

        }
    }

}

/**
 * 만약, 이 코드대로 실행하게된다면, for 문에 의해 i의 값이 돌아가지만 메소드 a 안의 내용 때문에 i가 계속 0이되서 무한 반복이 된다.
 * 허나, 무한 루프를 멈출수 있는 방법이 2가지가 있다.
 * 1. a 메소드 안에 i의 값을 int i = 0; 으로 선언 해주면 a 안에서만 사용가능하기에 바깥에 영향을 안줌.(지역변수)
 * 2. for 문 안의 i=0; 을 int i = 0; 으로 선언 해주면 for 문 안에서만 사용가능하기에 바깥에 영향을 안줌.(지역변수)
 */