package org.example;

import java.util.Scanner;

public class Price {
    public void getPrice() {
        System.out.println("Enter your vehicle type: ");
        System.out.println("car, truck, bus, motorcycle");

        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int premium = 0;

        switch (type) {
            case "car" -> premium = 200;
            case "truck" -> premium = 300;
            case "bus" -> premium = 400;
            case "motorcycle" -> {
                System.out.println("Enter your motorcycle type:");
                System.out.println("1 (low power), 2 (medium), 3 (high)");
                String motorCycleType = scanner.nextLine();
                int motorCycleInt = Integer.parseInt(motorCycleType);
                switch (motorCycleInt) {
                    case 1 -> premium = 300;
                    case 2 -> premium = 400;
                    case 3 -> premium = 500;
                    default -> System.out.println("Unknown motorcycle type!");
                }
            }
            default -> System.out.println("Unknown vehicle type!");
        }

        scanner.close();
        System.out.println("The premium is $" + premium);
    }
}
