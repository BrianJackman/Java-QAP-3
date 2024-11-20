/* 
 * Java QAP 3
 * By: Brian Jackman
 * 2024-11-21
 */

 package problem4;

 public class Triangle extends Shape {
     private double base;
     private double height;
 
     public Triangle(double base, double height) {
         this.base = base;
         this.height = height;
     }
 
     public double getBase() {
         return base;
     }
 
     @Override
     public void scale(double factor) {
         this.base *= factor;
         this.height *= factor;
     }
 
     @Override
     public String toString() {
         return "Triangle with base: " + base + " and height: " + height;
     }
 }