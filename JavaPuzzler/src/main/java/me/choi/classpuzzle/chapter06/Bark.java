package me.choi.classpuzzle.chapter06;

/**
 * Project : JavaPuzzler
 *
 * @author : jwdeveloper
 * @comment : static 키워드 때문에 하이딩이 일어난다.
 * Time : 10:40 오전
 */
public class Bark {
    public static void main(String[] args) {
        Dog2 woofer = new Dog2();
        // TODO: 정적 메서드는 동적 디스패치가 일어나지 않는다.
        Dog2 nipper = new Basenji();
        woofer.bark();
        nipper.bark();
    }
}

class Dog2 {
//    public static void bark() {
//        System.out.println("woof");
//    }
    public void bark() {
        System.out.println("woof");
    }
}

class Basenji extends Dog2{
//    public static void bark() {
//
//    }
    public void bark() {

    }
}
