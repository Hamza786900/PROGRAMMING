public class Demo {
    public static void main(String[] args) {

        System.out.println("🏙️ Welcome to Hamza’s City Housing Management System\n");

        // Step 1: Create city
        CityHousing city = new CityHousing("Lahore", 3);

        // Step 2: Create societies
        Society modelTown = new Society("Model Town", 5);
        Society bahriaTown = new Society("Bahria Town", 5);

        // Step 3: Add societies to city
        city.addSociety(modelTown);
        city.addSociety(bahriaTown);

        // Step 4: Create plots
        Plot resPlot1 = new ResidentialPlot("R-101", PlotType.RES_5_MARLA, PlotShape.RECTANGLE, 30, 50, 0, 0, "A");
        Plot resPlot2 = new ResidentialPlot("R-102", PlotType.RES_10_MARLA, PlotShape.RECTANGLE, 35, 65, 0, 0, "B");
        Plot cornerPlot = new Cornerplot("C-201", PlotType.RES_1_KANAL, PlotShape.RECTANGLE, 50, 90, 0, 0);
        Plot shop = new Shop("S-301", PlotType.COMM_SHOP, PlotShape.RECTANGLE, 20, 30, 0, 0, "Shop-1");
        Plot office = new office("O-401", PlotType.COMM_OFFICE, PlotShape.RECTANGLE, 25, 40, 0, 0, "Office-12");

        // Step 5: Add plots to societies
        modelTown.addPlot(resPlot1);
        modelTown.addPlot(cornerPlot);
        bahriaTown.addPlot(resPlot2);
        bahriaTown.addPlot(shop);
        bahriaTown.addPlot(office);

        // Step 6: Display all before booking
        System.out.println("=== BEFORE BOOKING ===");
        city.showAllSocieties();

        // Step 7: Book some plots
        System.out.println("\n=== BOOKING SOME PLOTS ===");
        city.bookPlot("Model Town", "R-101");
        city.bookPlot("Bahria Town", "O-401");
        city.bookPlot("Bahria Town", "S-301");

        // Step 8: Try booking same plot again
        System.out.println("\n=== DUPLICATE BOOKING ATTEMPT ===");
        city.bookPlot("Bahria Town", "S-301");

        // Step 9: Cancel one booking
        System.out.println("\n=== CANCELLING A BOOKING ===");
        city.cancelPlot("Bahria Town", "O-401");

        // Step 10: Show all after bookings and cancellations
        System.out.println("\n=== AFTER BOOKINGS & CANCELLATIONS ===");
        city.showAllSocieties();

        // Step 11: Show example of toString()
        System.out.println("\n=== TO STRING OUTPUTS ===");
        System.out.println(resPlot1.toString());
        System.out.println();
        System.out.println(office.toString());

        System.out.println("\nThank you for using Hamza’s City Housing System!");
    }
}
