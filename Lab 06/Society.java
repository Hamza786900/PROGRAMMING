public class Society {
    private String societyName;
    private Plot[] plots;
    private int plotCount;

    public Society(String societyName,int size) {
        this.societyName = societyName;
        plots = new Plot[size];
        plotCount = 0;
    }

    // Getter and Setter for societyName
    public String getSocietyName() {
        return societyName;
    }

    public void setSocietyName(String societyName) {
        this.societyName = societyName;
    }

    // Getter for plots array
    public Plot[] getPlots() {
        return plots;
    }

    // Getter for plotCount
    public int getPlotCount() {
        return plotCount;
    }

    public void addPlot(Plot plot) {
        if (plotCount < plots.length) {
            plots[plotCount] = plot;
            plotCount++;
            System.out.println("Plot added successfully in " + societyName);
        } else {
            System.out.println("Cannot add more plots. Society is full.");
        }
    }

    public void showAllPlots() {
    if (plotCount == 0) {
        System.out.println("No plots available in " + societyName);
    } else {
        System.out.println("Plots in " + societyName + ":");
        System.out.printf("%-10s %-20s %-15s %-15s %-15s\n",
                "PLOT ID", "PLOT-TYPE", "PLOT-PRICE", "PLOT-AREA", "AVAILABILITY");

        for (int i = 0; i < plotCount; i++) {
            System.out.println(plots[i].toString());
        }
    }
}

    public void bookPlotByID(String id) {
        boolean found = false;
        for (int i = 0; i < plotCount; i++) {
            if (plots[i].getPlotID().equals(id)) {
                found = true;
                plots[i].BookPlot();
                break;
            }
        }
        if (found == false) {
            System.out.println("Plot ID not found in " + societyName);
        }
    }

    public void cancelPlotByID(String id) {
        boolean found = false;
        for (int i = 0; i < plotCount; i++) {
            if (plots[i].getPlotID().equals(id)) {
                found = true;
                plots[i].CancelBooking();
                break;
            }
        }
        if (found == false) {
            System.out.println("Plot ID not found in " + societyName);
        }
    }
    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Street: 4\n");

    sb.append(String.format("%-10s %-20s %-15s %-15s %-15s\n",
            "PLOT ID", "PLOT-TYPE", "PLOT-PRICE", "PLOT-AREA", "AVAILABILITY"));

    for (int i = 0; i < plotCount; i++) {
        sb.append(plots[i].toString()).append("\n");
    }

    return sb.toString();
}

}
