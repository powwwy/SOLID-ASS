package With_Princple;

public class WithLSP {

   interface Shape {
      int getArea();
   }

   static class Rectangle implements Shape {
      protected int width;
      protected int height;

      public Rectangle(int width, int height) {
         this.width = width;
         this.height = height;
      }

      public int getArea() {
         return width * height;
      }
   }

   static class Square implements Shape {
      private int side;

      public Square(int side) {
         this.side = side;
      }

      public int getArea() {
         return side * side;
      }
   }

   public static void main(String[] args) {
      Shape rect = new Rectangle(5, 10);
      System.out.println("Rectangle area: " + rect.getArea()); // 50

      Shape sq = new Square(5);
      System.out.println("Square area: " + sq.getArea()); // 25

      // No surprises: Both behave as expected with the common Shape interface
   }
}

