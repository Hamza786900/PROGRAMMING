public class CityHousing {
    private String cityName;
    private Society[] societies;
    private int societyCount;

    public CityHousing(String cityName, int size) {
        this.cityName = cityName;
        societies = new Society[size];
        societyCount = 0;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void addSociety(Society society) {
        if (societyCount < societies.length) {
            societies[societyCount] = society;
            societyCount++;
            System.out.println("Society added successfully in " + cityName);
        } else {
            System.out.println("Cannot add more societies. City is full.");
        }
    }

    public void bookPlot(String societyName, String plotId) {
        boolean found = false;
        for (int i = 0; i < societyCount; i++) {
            if (societies[i].getSocietyName().equals(societyName)) {
                found = true;
                societies[i].bookPlotByID(plotId);
                break;
            }
        }
        if (found == false) {
            System.out.println("Society not found in " + cityName);
        }
    }

    public void cancelPlot(String societyName, String plotId) {
        boolean found = false;
        for (int i = 0; i < societyCount; i++) {
            if (societies[i].getSocietyName().equals(societyName)) {
                found = true;
                societies[i].cancelPlotByID(plotId);
                break;
            }
        }
        if (found == false) {
            System.out.println("Society not found in " + cityName);
        }
    }

    public void showAllSocieties() {
        if (societyCount == 0) {
            System.out.println("No societies available in " + cityName);
        } else {
            System.out.println("\nCity: " + cityName);
            for (int i = 0; i < societyCount; i++) {
            
                societies[i].showAllPlots();
            }
        }
    }
}
