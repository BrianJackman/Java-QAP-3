/*
 * Java QAP 3
 * By: Brian Jackman
 * 2024-11-21
 */

 package problem3;

 public class Ellipse extends Shape {
     private double a;
     private double b;
 
     public Ellipse(double a, double b) {
         super("Ellipse");
         if (a >= b) {
             this.a = a;
             this.b = b;
         } else {
             this.a = b;
             this.b = a;
         }
     }
 
     @Override
     public double getPerimeter() {
         return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
     }
 
     @Override
     public double getArea() {
         return Math.PI * a * b;
     }
 }