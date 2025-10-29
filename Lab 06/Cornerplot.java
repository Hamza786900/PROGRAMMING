public class Cornerplot extends Plot{
    private double cornercharge;

    public Cornerplot(String id, PlotType type, PlotShape shape, double width, double depth, double front, double back) {
        super(id, type, shape, width, depth, front, back);
        CalculateExtraCharge();;
    }
    public void CalculateExtraCharge(){
        cornercharge=(getPrice()*8)/100;

    }
     public double getCornerCharge() {
        return cornercharge;
    }
    public boolean BookPlot(){
        if(isAvailable()==true){
              double totalPrice = getPrice() + cornercharge;
        System.out.println("Price of CornerPlot: " + totalPrice);
        return super.BookPlot(); 
    } 
    else {
        System.out.println("Corner plot is already booked");
        return false;
    }

    }

       public boolean CancelBooking() {
        if (isAvailable() == false) {
            System.out.println("Corner plot booking cancelled successfully");
            return super.CancelBooking();
        } 
        else {
            System.out.println("Corner plot is already available");
            return false;
        }
    }
     

 }

