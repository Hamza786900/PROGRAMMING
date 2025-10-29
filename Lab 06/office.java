public class office extends commercialPlot{
    
    private String officeNumber;
    private double officeCharge;

    public office(String id, PlotType type, PlotShape shape, double width, double depth, double front, double back, String officeNumber) {
        super(id, type, shape, width, depth, front, back);
        this.officeNumber = officeNumber;
        calculateOfficeCharge();
    }

    public void calculateOfficeCharge() {
        officeCharge = super.getPrice() * 0.07;
    }

    @Override
    public boolean BookPlot() {
        if (isAvailable() == true) {
            double totalPrice = super.getPrice() + (super.getPrice() * 0.10) + officeCharge;
            System.out.println("Office " + officeNumber + " booked successfully ");
            System.out.println("Total Price: " + totalPrice);
            return super.BookPlot();
        } 
        else {
            System.out.println("Office " + officeNumber + " is already booked.");
            return false;
        }
    }

    @Override
    public String toString() {
    return "Office Number: " + officeNumber +
           "\nOffice Extra Charge (7%): " + officeCharge;
}



}
