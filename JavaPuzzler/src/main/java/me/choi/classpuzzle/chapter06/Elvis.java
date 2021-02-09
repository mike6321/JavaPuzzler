package me.choi.classpuzzle.chapter06;

import java.util.Calendar;

/**
 * Project : JavaPuzzler
 *
 * @author : jwdeveloper
 * @comment :
 * 1. main 메서드 호출
 * 2. 정적 필드 자료형의 기본 값으로 초기화 (INSTANCE = null, CURRENT_YEAR = 0)
 * 3. 정적 필드 값 할당 => INSTANCE 초기화 시 CURRENT_YEAR 는 0이기에 0 - 1930
 * Time : 1:57 오후
 */
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();
    private static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);
    private final int beltSize;
//    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {
        beltSize = CURRENT_YEAR - 1930;
    }

    public int getBeltSize() {
        return beltSize;
    }

    public static void main(String[] args) {
        // TODO: 클래스의 초화 순서
        System.out.println("엘비스의 허리사이즈는 " + INSTANCE.getBeltSize() + "입니다...! 돼지");
    }

}
