/*
 * Java QAP 3
 * By: Brian Jackman
 * 2024-11-21
 */

 package problem3;

 public class Triangle extends Shape {
     private double side1;
     private double side2;
     private double side3;
 
     public Triangle(double side1, double side2, double side3) {
         super("Triangle");
         if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
             this.side1 = side1;
             this.side2 = side2;
             this.side3 = side3;
         } else {
             throw new IllegalArgumentException("Invalid sides for a triangle");
         }
     }
 
     @Override
     public double getPerimeter() {
         return side1 + side2 + side3;
     }
 
     @Override
     public double getArea() {
         double s = getPerimeter() / 2;
         return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
     }
 }