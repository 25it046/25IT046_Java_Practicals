class SeatBooking {
    private int seatsLeft = 5;

    synchronized void book(String name) {
        if (seatsLeft > 0) {
            try { Thread.sleep(20); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            System.out.println(name + " booked a seat.");
            seatsLeft--;
        } else {
            System.out.println(name + " could not book a seat.");
        }
    }

    public static void main(String[] args) throws Exception {
        SeatBooking booking = new SeatBooking();
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            final int number = i + 1;
            threads[i] = new Thread(() -> booking.book("Person " + number));
            threads[i].start();
        }
        for (Thread t : threads) t.join();
        System.out.println("Seats left: " + booking.seatsLeft);
    }
}
