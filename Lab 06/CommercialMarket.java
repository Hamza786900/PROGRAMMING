public class CommercialMarket {
    private String marketName;
    private Shop[] shops;
    private int shopCount;

    public CommercialMarket(String name, int totalShops) {
        this.marketName = name;
        this.shops = new Shop[totalShops];
        this.shopCount = 0;
    }

    public void addShop(Shop s) {
        if (shopCount < shops.length) {
            shops[shopCount] = s;
            shopCount++;
        } else {
            System.out.println("Market is full, cannot add more shops.");
        }
    }

    public void displayMarketInfo() {
        System.out.println("Market Name: " + marketName);
        System.out.println("Total Shops: " + shopCount);
        for (int i = 0; i < shopCount; i++) {
            System.out.println(shops[i].toString());

        }
    }

    public Shop findFirstAvailableShop() {
        for (int i = 0; i < shopCount; i++) {
            if (shops[i].isAvailable() == true) {
                return shops[i];
            }
        }
        return null;
    }

    public boolean bookShop(String id) {
        for (int i = 0; i < shopCount; i++) {
            if (shops[i].getPlotID().equals(id)) {
                return shops[i].BookPlot();
            }
        }
        System.out.println("Shop with ID " + id + " not found.");
        return false;
    }

    public boolean cancelBooking(String id) {
        for (int i = 0; i < shopCount; i++) {
            if (shops[i].getPlotID().equals(id)) {
                return shops[i].CancelBooking();
            }
        }
        System.out.println("Shop with ID " + id + " not found.");
        return false;
    }
}

