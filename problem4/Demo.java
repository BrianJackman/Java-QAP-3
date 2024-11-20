/* 
 * Java QAP 3
 * By: Brian Jackman
 * 2024-11-21
 */

 package problem4;

 public class Demo {
     public static void scaleShapes(Scalable[] shapes, double factor) {
         System.out.println("Before scaling:");
         for (Scalable shape : shapes) {
             System.out.println(shape);
         }
 
         for (Scalable shape : shapes) {
             shape.scale(factor);
         }
 
         System.out.println("After scaling:");
         for (Scalable shape : shapes) {
             System.out.println(shape);
         }
     }
 
     public static void main(String[] args) {
         Scalable[] shapes = {
             new Circle(5),
             new Ellipse(10, 5),
             new Triangle(6, 8),
             new EquilateralTriangle(4)
         };
 
         scaleShapes(shapes, 2.0);
     }
 }