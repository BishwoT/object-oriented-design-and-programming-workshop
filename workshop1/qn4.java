package workshop1;

public class qn4 {
	    public static void main(String[] args) {
	        double a = 3;
	        double b = 4;
	        double c = 5;

	        double s = (a + b + c) / 2;

	        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

	        System.out.println("Area of the triangle: " + area);
	    }
	}
