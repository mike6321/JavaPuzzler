package me.choi.classpuzzle.chapter06;

/**
 * Project : JavaPuzzler
 *
 * @author : jwdeveloper
 * @comment : 애매한 생성자
 * double array가 출력되는 이유는 오버로딩의 순서 때문이다.
 * 오버로딩 호출 순서
 * 1. 적합한 메서드를 고른다.
 * 2. 선택한 메서드에서 가장 구체적인 형태의 메서드를 고른다.
 * Time : 1:20 오전
 */
// TODO: 오버로딩 호출 순서  
public class neutralConstructor {

    public neutralConstructor(Object obj) {
        System.out.println("Object");
    }

    public neutralConstructor(double[] doubles) {
        System.out.println("double array");
    }

    public static void main(String[] args) {
        neutralConstructor neutralConstructor = new neutralConstructor(null);
    }
}
