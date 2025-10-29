public class Plot {
        private String plotID;
        private PlotType type;
        private PlotShape shape;

    
        private double width;
        private double depth;
        private double front;
        private double back;

        private double area;
        private double price;
        private boolean isAvailable;


        public Plot(String id, PlotType type, PlotShape shape, double width, double depth, double front, double back) 
        {

            this.plotID = id;
            this.type = type;
            this.shape = shape;
            this.width = width;
            this.depth = depth;
            this.front = front;
            this.back = back;
            this.price=type.getPrice();
            this.isAvailable=true;
            calculateArea();
                
        }
        public double getPrice() {
        return price;
        }
        public void calculateArea(){
            area=depth*width;

        }
        public String getPlotID(){
            return plotID;
        }
        public double getArea(){
            return area;
        }
        public boolean isAvailable(){
            return isAvailable;

        }
        public boolean BookPlot(){
            if(isAvailable==true){
                isAvailable=false;
                System.out.println("Plot booked successfully");
                return true;
            }
            else{
                System.out.println("Plot is already booked");
                return false;
            }

        }
        public boolean CancelBooking(){
            if(isAvailable==false){
                isAvailable=true;
                System.out.println("Plot cnacelled successfully");
                return true;
            }
            else{
                System.out.println("Plot is already available");
                return false;
            }
        }
        @Override
public String toString() {
    String availability;

    if (isAvailable == true) {
        availability = "Available";
    } else {
        availability = "Booked";
    }

    return String.format("%-10s %-20s %-15.2f %-15.2f sq yd   %-12s",
            plotID,
            type,
            price,
            area,
            availability);
}



}
