package Chapters.chapter_10.exercise_10.exercise10_27;

public class MyStringBuilder1 {

    private String s;

    public MyStringBuilder1(String s) {
        this.s = s;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        this.s = this.s + s.toString();
        return this;
    }
    public MyStringBuilder1 append(int i) {
        this.s = this.s + i;
        return this;
    }
    public int length() {
        return this.s.length();
    }
    public String toString() {
        return this.s;
    }

    public char charAt(int index) {
        return this.s.charAt(index);
    }

    public MyStringBuilder1 toLowerCase() {
        this.s = this.s.toLowerCase();
        return this;
    }

    public MyStringBuilder1 substring(int begin, int end) {
        this.s = this.s.substring(begin, end);
        return this;
    }
}
