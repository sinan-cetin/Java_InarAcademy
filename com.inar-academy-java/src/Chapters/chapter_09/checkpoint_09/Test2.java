package Chapters.chapter_09.checkpoint_09;

import java.util.Date;
public class Test2 {
    public static void main(String[] args) {
        Date date = new Date(1234567);
        m1(date);
        System.out.println(date.getTime());
    }
    public static void m1(Date date) {
        date = new Date(7654321);
    }
}
