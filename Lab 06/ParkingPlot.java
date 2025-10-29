public class ParkingPlot extends Plot {
    private String parkingNumber;
    private double parkingCharge;

    public ParkingPlot(String id, PlotType type, PlotShape shape, double width, double depth, double front, double back, String parkingNumber) {
        super(id, type, shape, width, depth, front, back);
        this.parkingNumber = parkingNumber;
        calculateParkingCharge();
    }

    public void calculateParkingCharge() {
        parkingCharge = 2000;  
    }

    @Override
    public boolean BookPlot() {
        if (isAvailable() == true) {
            double totalPrice = super.getPrice() + parkingCharge;
            System.out.println("Parking Plot " + parkingNumber + " booked successfully");
            System.out.println("Total Price: " + totalPrice);
            return super.BookPlot();
        } 
        else {
            System.out.println("Parking Plot " + parkingNumber + " is already booked.");
            return false;
        }
    }

   @Override
public String toString() {
    String result = "Plot ID: " + getPlotID() + "\n";
    result += "Price (with parking charge): " + (getPrice() + parkingCharge) + "\n";
    result += "Area: " + getArea() + "\n";

    if (isAvailable() == true) {
        result += "Status: Available\n";
    } else {
        result += "Status: Booked\n";
    }

    return result;
}

}



