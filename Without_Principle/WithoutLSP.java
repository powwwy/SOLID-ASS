package Without_Principle;

public class WithoutLSP {

    //Base Class
    static class Rectangle {
        protected int width;
        protected int height;

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getArea() {
            return width * height;
        }
    }

    // Square inherits from Rectangle but breaks LSP
    static class Square extends Rectangle {
        @Override
        public void setWidth(int width) {
            this.width = width;
            this.height = width;  // overrides behavior
        }

        @Override
        public void setHeight(int height) {
            this.width = height;
            this.height = height;  // overrides behavior
        }
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setWidth(5);
        rect.setHeight(10);
        System.out.println("Rectangle area: " + rect.getArea()); //5*10= 50

        Rectangle sq = new Square();
        sq.setWidth(5);
        sq.setHeight(10);
        // Expected 50, but result is 100 due to overridden setters
        System.out.println("Square area: " + sq.getArea()); // 100 (unexpected)
    }
}
