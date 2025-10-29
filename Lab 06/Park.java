public class Park {
    private String parkName;
    private PlotShape shape;
    private double width;
    private double depth;
    private double area;

   
    public Park(String parkName, PlotShape shape, double width, double depth) {
        this.parkName = parkName;
        this.shape = shape;
        this.width = width;
        this.depth = depth;
        calculateArea();
    }

   
    public void calculateArea() {
        if (shape == PlotShape.RECTANGLE) {
            area = width * depth;
        }
        else if (shape == PlotShape.TRAPEZOID) {
            
            area = ((width + depth) / 2) * 10;
        }
        else {
            
            area = (width * 5) + (depth * 5);
        }
    }

 
    public String getParkName() {
        return parkName;
    }

    public double getArea() {
        return area;
    }

    public void displayInfo() {
        System.out.println("Park Name: " + parkName);
        System.out.println("Shape: " + shape);
        System.out.println("Width: " + width + ", Depth: " + depth);
        System.out.println("Area: " + area + " sq units");
     
    }
}
