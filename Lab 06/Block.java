public class Block {
    private String blockName;
    private Plot[] plots;
    private int plotCount;
    private CommercialMarket market;
    private ParkingPlot parking;

    public Block(String blockName, int totalPlots) {
        this.blockName = blockName;
        this.plots = new Plot[totalPlots];
        this.plotCount = 0;
    }

    public void addPlot(Plot p) {
        if (plotCount < plots.length) {
            plots[plotCount] = p;
            plotCount++;
        } else {
            System.out.println("No more space to add new plots in " + blockName);
        }
    }

    public void setCommercialMarket(CommercialMarket market) {
        this.market = market;
    }

    public void setParkingPlot(ParkingPlot parking) {
        this.parking = parking;
    }

    public void displayBlockInfo() {
    System.out.println("Block Name: " + blockName);
    System.out.println("Total Plots: " + plotCount);

    System.out.printf("%-10s %-20s %-15s %-15s %-15s\n",
            "PLOT ID", "PLOT TYPE", "PLOT PRICE", "PLOT AREA", "AVAILABILITY");

    for (int i = 0; i < plotCount; i++) {
        System.out.println(plots[i].toString());
    }
}


    public Plot findAvailablePlot() {
        for (int i = 0; i < plotCount; i++) {
            if (plots[i].isAvailable() == true) {
                return plots[i];
            }
        }
        return null;
    }

    public boolean bookPlot(String id) {
        for (int i = 0; i < plotCount; i++) {
            if (plots[i].getPlotID().equals(id)) {
                return plots[i].BookPlot();
            }
        }
        System.out.println("Plot with ID " + id + " not found.");
        return false;
    }

    public boolean cancelBooking(String id) {
        for (int i = 0; i < plotCount; i++) {
            if (plots[i].getPlotID().equals(id)) {
                return plots[i].CancelBooking();
            }
        }
        System.out.println("Plot with ID " + id + " not found.");
        return false;
    }
}
