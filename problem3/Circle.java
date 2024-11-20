/*
 * Java QAP 3
 * By: Brian Jackman
 * 2024-11-21
 */

 package problem3;

 public class Circle extends Shape {
     private double radius;
 
     public Circle(double radius) {
         super("Circle");
         this.radius = radius;
     }
 
     @Override
     public double getPerimeter() {
         return 2 * Math.PI * radius;
     }
 
     @Override
     public double getArea() {
         return Math.PI * radius * radius;
     }
 }