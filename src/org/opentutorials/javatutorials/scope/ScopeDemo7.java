package org.opentutorials.javatutorials.scope;

class C {
    int v = 10; // v는 전역변수, 10의 값을 가짐.

    void m() {
        int v = 20;
        System.out.println(v); // 지역변수 v의 값 출력, 20
        System.out.println(this.v); // 전역변수 v의 값 출력, this 를 쓰게 되면 그 객체의 전역의 값을 가져옴, 10, 지역변수와 전역변수의 이름이 같을때도 구분하기위해 쓰기도함.
    }

}

public class ScopeDemo7 {

    public static void main(String[] args) {
        C c1 = new C(); // C 라고 하는 클래스를, c1 이라는 인스턴스에 담는다.
        c1.m(); // 그리고 c1 이라는 인스턴스에 있는 m 이라는 메소드를 호출
    }

}

/**
 * 결과값이 원래 전역변수의 값 10이 나옴. 허나, 만약 메소드 m 에 지역변수로 v의 값을 20으로 정한다면,
 * 결과값은 지역변수의 값 20이 나온다. 전역변수보다 해당 메소드에 사용되는 지역변수가 더 우선순위가 높다는것을 알 수 있다.
 * 또, 알수 있는점은 전역변수는 기본값 처럼 값을 전체적으로 적용시킬수있고, 특정 메소드에서만, 그 기본값을 바꾸고 싶을때 지역변수를 이용할수 있다는 것이다.
 */





