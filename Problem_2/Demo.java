/*
 * Java QAP 3
 * By: Brian Jackman
 * 2024-11-21
 */

public class Demo {
    public static void main(String[] args) {
        Point point = new Point(1.0f, 2.0f);
        System.out.println("Point: " + point);

        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        System.out.println("MovablePoint before move: " + movablePoint);
        movablePoint.move();
        System.out.println("MovablePoint after move: " + movablePoint);
    }
}