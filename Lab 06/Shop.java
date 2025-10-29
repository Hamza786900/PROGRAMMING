public class Shop extends commercialPlot{
    
    private String shopNumber;
    private double shopCharge;

    public Shop(String id, PlotType type, PlotShape shape, double width, double depth, double front, double back, String shopNumber) {
        super(id, type, shape, width, depth, front, back);
        this.shopNumber = shopNumber;
        calculateShopCharge();
    }

    public void calculateShopCharge() {
        shopCharge = super.getPrice() * 0.05;
    }

    @Override
    public boolean BookPlot() {
        if (isAvailable() == true) {
            double totalPrice = super.getPrice() + (super.getPrice() * 0.10) + shopCharge;
            System.out.println("Shop " + shopNumber + " booked successfully ");
            System.out.println("Total Price: " + totalPrice);
            return super.BookPlot();
        } 
        else {
            System.out.println("Shop " + shopNumber + " is already booked.");
            return false;
        }
    }

  @Override
    public String toString() {
        
        String info = "";
        info += super.toString() + "\n"; 
        info += "Shop Number: " + shopNumber + "\n";
        info += "Shop Extra Charge (5%): " + shopCharge;
        return info;
    }

}

    
