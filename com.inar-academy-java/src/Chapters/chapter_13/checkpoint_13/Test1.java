package Chapters.chapter_13.checkpoint_13;

public class Test1 {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        java.util.Date date1 = date;
        java.util.Date date2 = (java.util.Date)(date.clone());
        System.out.println(date == date1);
        System.out.println(date == date2);
        System.out.println(date.equals(date2));
    }
}
