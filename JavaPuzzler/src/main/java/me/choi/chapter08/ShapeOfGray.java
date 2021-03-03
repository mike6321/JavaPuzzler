package me.choi.chapter08;

/**
 * Project : JavaPuzzler
 *
 * @author : jwdeveloper
 * @comment : White가 출력되네?
 * 같은 공간에 같은 이름을 가진 클래스 변수가 있다면
 * 변수명을 우선시 한다.
 *
 * 네이밍을 중요시하자!
 * Time : 8:00 오후
 */
public class ShapeOfGray {
    public static void main(String[] args) {
        System.out.println(X.Y.Z);
    }
}
class X {
    static class Y {
        static String Z = "Black";
    }

    static C Y = new C();
}
class C {
    String Z = "White";
}
