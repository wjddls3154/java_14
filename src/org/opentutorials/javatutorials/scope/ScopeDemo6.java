package org.opentutorials.javatutorials.scope;

public class ScopeDemo6 {

    static int i = 5; // 전역변수

    static void a(){
        int i = 10; // 지역변수
        b(); // b 메소드 호출
    }

    static void b() {
        // 만약, int i = 30; 을 한다면 실행값은 30이 나옴.
        System.out.println(i); // 실행값이 5가 나오는 이유는, 여기에 전역변수 i 5의 값이 들어갔기 때문.
        // 즉, b라는 메소드에 지역변수 i값 선언이 없다면, i의 값에 전역변수가 온다는 뜻.
    }

    public static void main(String[] args ){
     a(); // a 라는 메소드 호출
}

    }
/**
 * 실행 결과 : 5가 나옴.
 * 정적인 유효범위 : static scope = lexical scope, 동적인 유효범위 : dynamic scope
 */
