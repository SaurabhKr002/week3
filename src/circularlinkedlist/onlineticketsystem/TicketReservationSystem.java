package circularlinkedlist.onlineticketsystem;

class TicketReservationSystem {
    private Ticket head;

    // Add a new ticket reservation at the end of the circular list
    public void addTicket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketID, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = newTicket;
            newTicket.next = head; // Circular reference
        } else {
            Ticket temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTicket;
            newTicket.next = head;
        }
        System.out.println("Ticket with ID " + ticketID + " added.");
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketID) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Ticket temp = head;
        Ticket prev = null;

        do {
            if (temp.ticketID == ticketID) {
                if (prev == null) { // Removing the head ticket
                    if (temp.next == head) { // Only one ticket in the list
                        head = null;
                    } else {
                        prev = head;
                        while (prev.next != head) {
                            prev = prev.next;
                        }
                        head = head.next;
                        prev.next = head;
                    }
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Ticket with ID " + ticketID + " removed.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Ticket with ID " + ticketID + " not found.");
    }

    // Display all tickets
    public void displayAllTickets() {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        Ticket temp = head;
        System.out.println("Current Tickets:");
        do {
            System.out.println("Ticket ID: " + temp.ticketID + " | Customer: " + temp.customerName + " | Movie: " + temp.movieName + " | Seat: " + temp.seatNumber + " | Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String searchKey) {
        if (head == null) {
            System.out.println("No tickets to search.");
            return;
        }

        Ticket temp = head;
        boolean found = false;
        do {
            if (temp.customerName.equalsIgnoreCase(searchKey) || temp.movieName.equalsIgnoreCase(searchKey)) {
                System.out.println("Found Ticket - Ticket ID: " + temp.ticketID + " | Customer: " + temp.customerName + " | Movie: " + temp.movieName + " | Seat: " + temp.seatNumber + " | Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tickets found for the given search key: " + searchKey);
        }
    }

    // Calculate the total number of booked tickets
    public int calculateTotalTickets() {
        if (head == null) {
            return 0;
        }

        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }
}
