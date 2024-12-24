package workshop1;

class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle [Width: " + width + ", Height: " + height + "]";
    }
}

public class qn17 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 10.0);

        System.out.println(rectangle);
    }
}

