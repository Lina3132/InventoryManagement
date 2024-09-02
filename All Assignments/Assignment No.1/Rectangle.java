public class Rectangle {

    // Method to calculate the area of the rectangle
    // l=length ,w=width
    public static double Area(double l, double w) {
        return l * w;
    }

    // Method to calculate the perimeter of the rectangle
    public static double Perimeter(double l, double w) {
        return 2 * (l + w);
    }

    public static void main(String[] args) {
        // Define the length and width of the rectangle
        double l = 10.0;
        double w = 5.0;

        // Calculate the area and perimeter
        double area = Area(l, w);
        double perimeter = Perimeter(l, w);

        // Display the results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}

