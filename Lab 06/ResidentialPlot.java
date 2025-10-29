public class ResidentialPlot extends Plot {
    private String blockName;
    private double developmentCharge;

    public ResidentialPlot(String id, PlotType type, PlotShape shape, double width, double depth, double front, double back, String blockName) {
        super(id, type, shape, width, depth, front, back);
        this.blockName = blockName;
        calculateDevelopmentCharge();
    }

    public void calculateDevelopmentCharge() {
        developmentCharge = super.getPrice() * 0.06;
    }

    @Override
    public boolean BookPlot() {
        if (isAvailable() == true) {
            double totalPrice = super.getPrice() + developmentCharge;
            System.out.println("Residential plot in block " + blockName + " booked successfully with 6% development charge.");
            System.out.println("Total Price: " + totalPrice);
            return super.BookPlot();
        } else {
            System.out.println("Residential plot in block " + blockName + " is already booked.");
            return false;
        }
    }

     @Override
    public String toString() {
        return super.toString() +
               "\nBlock Name: " + blockName +
               "\nDevelopment Charge (6%): " + developmentCharge;
    }
}
