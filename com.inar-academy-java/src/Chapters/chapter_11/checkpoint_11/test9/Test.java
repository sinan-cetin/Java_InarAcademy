package Chapters.chapter_11.checkpoint_11.test9;

public class Test {
    public static void main(String[] args) {
        Object circle1 = new Circle();
        Object circle2 = new Circle();
        System.out.println(circle1.equals(circle2));
    }
}

class Circle {
    double radius;

    public boolean equals(Object o) {
        return this.radius == ((Circle) o).radius;
    }
}