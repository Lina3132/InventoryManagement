public class Circle {

    // Method to calculate the area of the circle
    public double Area(double r) {
        return 3.14* r * r;
    }

    // Method to calculate the circumference of the circle
    public double Circumference(double r) {
        return 2 * 3.14* r;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        
        // Define the radius
        double r = 5.0;

        // Calculate the area and circumference
        double area = circle.Area(r);
        double circumference = circle.Circumference(r);

        // Display the results
        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);
    }
}

