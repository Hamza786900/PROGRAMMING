public class Demo {
    public static void main(String[] args) {
         /*Seat seat1 = new Seat(0, 1, 999.9, Seat.SeatType.REGULAR);

         System.out.println(seat1);

        seat1.setprice(1999.00);
        seat1.setseatType(Seat.SeatType.PREMIUM);

        seat1.Bookseat();
        seat1.CancelBooking();

        
        System.out.println(seat1);*/
        Cinema cinema = new Cinema("Cinema-1", 1, 5); 
        
        
        System.out.println("=== CITY: Karachi | All Cinema Layouts ===");
        System.out.println("=== CINEMA: " + cinema.Cinemaname + " | Layouts ===");
        
        cinema.displayAllLayouts();

        System.out.println("Total: " + cinema.getTotalSeats() + ", Available: " + cinema.getAvailableSeats());
    }
}
        
       
    

    
