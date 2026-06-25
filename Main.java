import java.util.ArrayList;
import java.util.Scanner;

public class AppointmentBookingSystem {

    static ArrayList<String> availableSlots = new ArrayList<>();
    static ArrayList<String> bookedSlots = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Predefined time slots
        availableSlots.add("09:00 AM");
        availableSlots.add("10:00 AM");
        availableSlots.add("11:00 AM");
        availableSlots.add("02:00 PM");
        availableSlots.add("03:00 PM");

        int choice;

        do {
            System.out.println("\n=== Appointment Booking System ===");
            System.out.println("1. View Available Slots");
            System.out.println("2. Book Appointment");
            System.out.println("3. View Booked Appointments");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Slots:");
                    for (int i = 0; i < availableSlots.size(); i++) {
                        System.out.println((i + 1) + ". " + availableSlots.get(i));
                    }
                    break;

                case 2:
                    if (availableSlots.isEmpty()) {
                        System.out.println("No slots available.");
                        break;
                    }

                    System.out.println("\nSelect a Slot:");
                    for (int i = 0; i < availableSlots.size(); i++) {
                        System.out.println((i + 1) + ". " + availableSlots.get(i));
                    }

                    System.out.print("Enter slot number: ");
                    int slotChoice = sc.nextInt();

                    if (slotChoice >= 1 && slotChoice <= availableSlots.size()) {
                        String booked = availableSlots.remove(slotChoice - 1);
                        bookedSlots.add(booked);
                        System.out.println("Appointment booked for " + booked);
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                case 3:
                    System.out.println("\nBooked Appointments:");
                    if (bookedSlots.isEmpty()) {
                        System.out.println("No appointments booked.");
                    } else {
                        for (String slot : bookedSlots) {
                            System.out.println(slot);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
