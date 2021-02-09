package me.choi.classpuzzle.chapter06;

/**
 * Project : JavaPuzzler
 *
 * @author : jwdeveloper
 * @comment : 상속보단 합성을 사용하라
 * 정적 변수는 상속받은 모든 클래스가 공유한다.
 * Time : 1:28 오전
 */
// TODO: 정적 변수는 상속받은 모든 클래스가 공유한다.  
public class Ruckus {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog()};
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].woof();
        }

        Cat[] cats = {new Cat(), new Cat(), new Cat()};
        for (int i = 0; i < cats.length; i++) {
            cats[i].meow();
        }

        System.out.println(Dog.getCount());
        System.out.println(Cat.getCount());
    }
}

class Counter {
    private static int count;
    public static void increment() {
        count++;
    }
    public static int getCount() {
        return count;
    }
}

class Dog extends Counter {
    public Dog() {
    }

    public void woof() {
        increment();
    }
}

class Cat extends Counter {
    public Cat() {
    }

    public void meow() {
        increment();
    }
}


