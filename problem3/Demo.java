/*
 * Java QAP 3
 * By: Brian Jackman
 * 2024-11-21
 */

 package problem3;

 public class Demo {
     public static void main(String[] args) {
         Shape[] shapes = new Shape[]{
             new Circle(5.0),
             new Ellipse(4.0, 2.0),
             new Triangle(3.0, 4.0, 5.0),
             new EquilateralTriangle(6.0)
         };
 
         for (Shape shape : shapes) {
             System.out.println(shape);
         }
     }
 }