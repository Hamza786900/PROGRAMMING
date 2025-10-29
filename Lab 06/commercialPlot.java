public class commercialPlot extends Plot {
    private double commercialCharge;   // 10% extra

    public commercialPlot(String id, PlotType type, PlotShape shape, double width, double depth, double front, double back) {
        super(id, type, shape, width, depth, front, back);
        calculateCommercialCharge();
    }

   
    public void calculateCommercialCharge() {
        commercialCharge = (super.getPrice() * 0.10);
    }

    
    @Override
    public boolean BookPlot() {
        if (isAvailable() == true) {
            double totalPrice = super.getPrice() + commercialCharge;
            System.out.println("Commercial plot booked successfully with 10% extra charge.");
            System.out.println("Total Price: " + totalPrice);
            return super.BookPlot();
        } 
        else {
            System.out.println("Commercial plot is already booked");
            return false;
        }
    }

   
}
