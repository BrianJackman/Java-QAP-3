/* 
 * Java QAP 3
 * By: Brian Jackman
 * 2024-11-21
 */

 package problem4;

 public class EquilateralTriangle extends Triangle {
     public EquilateralTriangle(double side) {
         super(side, Math.sqrt(3) / 2 * side);
     }
 
     @Override
     public void scale(double factor) {
         super.scale(factor);
     }
 
     @Override
     public String toString() {
         return "EquilateralTriangle with side: " + getBase();
     }
 }