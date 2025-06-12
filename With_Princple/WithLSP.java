package With_Princple;

public class WithLSP {

   //Parent class
   interface Shape {
      int getArea();
   }

   // Sub Class
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

   //Sub Class
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
      System.out.println("Rectangle area: " + rect.getArea()); //5*10= 50

      Shape sq = new Square(5);
      System.out.println("Square area: " + sq.getArea()); //5*5= 25

   }
}

