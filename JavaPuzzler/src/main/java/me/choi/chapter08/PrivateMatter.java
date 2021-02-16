package me.choi.chapter08;

/**
 * Project : JavaPuzzler
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 1:44 오후
 */
public class PrivateMatter {
    public static void main(String[] args) {
        System.out.println(((Base) new Derived()).className);
    }
}
class Base {
    public String className = "Base";
}
class Derived extends Base{
    private String className = "Derived";
}
