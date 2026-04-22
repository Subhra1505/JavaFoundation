
class AreaCalculation {
	    // Area of square
	    int area(int side) {
	        return side * side;
	    }

	    // Area of rectangle
	    int area(int length, int breadth) {
	        return length * breadth;
	    }

	    // Area of circle
	    double area(double radius) {
	        return 3.14 * radius * radius;
	    }

	    public static void main(String[] args) {
	        AreaCalculation obj = new AreaCalculation();

	        System.out.println("Area of Square: " + obj.area(5));
	        System.out.println("Area of Rectangle: " + obj.area(4, 6));
	        System.out.println("Area of Circle: " + obj.area(3.0));
	    }
	}
