package circularlinkedlist.onlineticketsystem;

public class TicketReservation {
    public static void main(String[] args) {
        TicketReservationSystem reservationSystem = new TicketReservationSystem();

        // Adding tickets
        reservationSystem.addTicket(101, "Alice", "Avengers: Endgame", "A1", "2025-01-30 18:00");
        reservationSystem.addTicket(102, "Bob", "Inception", "B3", "2025-01-30 20:00");
        reservationSystem.addTicket(103, "Charlie", "The Matrix", "C5", "2025-01-31 19:00");

        // Display all tickets
        reservationSystem.displayAllTickets();

        // Search for tickets
        System.out.println("\nSearching for tickets by customer name 'Alice':");
        reservationSystem.searchTicket("Alice");

        System.out.println("\nSearching for tickets by movie name 'Inception':");
        reservationSystem.searchTicket("Inception");

        // Remove a ticket
        System.out.println("\nRemoving ticket with ID 102:");
        reservationSystem.removeTicket(102);

        // Display all tickets after removal
        System.out.println("\nTickets after removal:");
        reservationSystem.displayAllTickets();

        // Calculate total tickets
        System.out.println("\nTotal number of tickets booked: " + reservationSystem.calculateTotalTickets());
    }
}
