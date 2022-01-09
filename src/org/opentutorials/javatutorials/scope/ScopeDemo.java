package org.opentutorials.javatutorials.scope;

public class ScopeDemo {

    static void a() {
        int i = 0;
        /**
         * 여기서 선언한 i 의 값은 바깥쪽의 i에 영향을 주지 않는다. a 라는 메소드 안에서만 영향을 줌. 유효범위 (scope)
         * a 메소드 안에서 선언된 변수 : 지역 변수 (local variables)
         */
    }

    public static void main(String[] args){
        for(int i = 0; i<5; i++) { // 메소드 안에서 i 선언 및 할당
            a();
            System.out.println(i);

        }
    }


}
