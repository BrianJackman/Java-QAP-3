/* 
 * Java QAP 3
 * By: Brian Jackman
 * 2024-11-21
 */

 package problem4;

 public class Circle extends Shape {
     private double radius;
 
     public Circle(double radius) {
         this.radius = radius;
     }
 
     @Override
     public void scale(double factor) {
         this.radius *= factor;
     }
 
     @Override
     public String toString() {
         return "Circle with radius: " + radius;
     }
 }