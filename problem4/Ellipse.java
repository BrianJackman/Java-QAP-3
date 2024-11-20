/* 
 * Java QAP 3
 * By: Brian Jackman
 * 2024-11-21
 */

 package problem4;

 public class Ellipse extends Shape {
     private double majorAxis;
     private double minorAxis;
 
     public Ellipse(double majorAxis, double minorAxis) {
         this.majorAxis = majorAxis;
         this.minorAxis = minorAxis;
     }
 
     @Override
     public void scale(double factor) {
         this.majorAxis *= factor;
         this.minorAxis *= factor;
     }
 
     @Override
     public String toString() {
         return "Ellipse with major axis: " + majorAxis + " and minor axis: " + minorAxis;
     }
 }