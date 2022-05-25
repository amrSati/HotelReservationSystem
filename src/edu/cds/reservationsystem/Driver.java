package edu.cds.reservationsystem;

import java.util.Scanner;

public class Driver {

    /**
     *  global scanner for user input
     *  global hotel which will be constructed later
     **/
    public static Scanner input = new Scanner(System.in);
    public static Hotel hotel;

    // Main function
    public static void main(String[] args) {
        // flag
        boolean exit = false;

        while (!exit) {
            // welcome user and take input
            System.out.printf("\t\t|Welcome|\n");
            System.out.println("Want to create a Hotel? (Y | N)");
            System.out.println("Enter (0) to exit the program!");
            char choice = Character.toUpperCase(input.next().charAt(0));
            if (choice == '0') System.exit(1);

            // Ensure valid input
            while (choice != 'Y' || choice != 'N') {
                System.out.println("INVALID INPUT!!");
                System.out.print("Try again: ");
                choice = Character.toUpperCase(input.next().charAt(0));
                System.out.println();

                if (choice == '0') System.exit(2);
            }

            switch (Character.toUpperCase(choice)) {
                case 'N':
                    exit = true;    break;

                case 'Y':

            }
        }
    }

    // Creates a new Hotel instance
    public static void createHotel() {
        // Take hotel details input
        System.out.print("Enter the name of the Hotel: ");
        String name = input.nextLine();
        System.out.println();
        System.out.print("Enter number of rooms: ");
        int numberOfRooms = input.nextInt();

        // Construct hotel
        hotel = new Hotel(name, numberOfRooms);

        // Add rooms in hotel
    }

    public static void addRoom() {

    }
}
