package Assignment04;

import java.util.Scanner;

public class RestaurantOrderSystem {
    static final double GST_RATE = 0.06; // 6% GST
    static final double PARCEL_CHARGE = 30.0; // Flat charge for dine-in or take-away
    static final double DISCOUNT_RATE = 0.10; // 10% discount on total cost

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0.0;

        System.out.println("[1] Dine-in");
        System.out.println("[2] Take-away");
        System.out.print("Please enter the option: ");
        int dineOption = scanner.nextInt();

        char orderMoreCategory;
        do {
            System.out.println("\nPlease select the category from the below list:");
            System.out.println("[1] Vegetarian");
            System.out.println("[2] Non-vegetarian");
            System.out.print("Please enter the option: ");
            int categoryOption = scanner.nextInt();

            totalCost += handleCategoryOrder(categoryOption, scanner);

            System.out.print("\nWould you like to order from another category? [Y] or [N]: ");
            orderMoreCategory = scanner.next().charAt(0);

        } while (Character.toUpperCase(orderMoreCategory) == 'Y');

        // Calculate final charges
        double gst = totalCost * GST_RATE;
        double discount = totalCost * DISCOUNT_RATE;
        double finalBill = totalCost + gst + PARCEL_CHARGE - discount;

        // Display the final bill
        System.out.println("\nTotal cost: " + String.format("%.2f", totalCost));
        System.out.println("GST tax: " + String.format("%.2f", gst));
        System.out.println("Parcel/Dine-in charge: " + String.format("%.2f", PARCEL_CHARGE));
        System.out.println("Discount: " + String.format("%.2f", discount));
        System.out.println("Net bill amount: " + String.format("%.2f", finalBill));
        System.out.println("\nThank you! Visit again!");
    }

    // Handles the order process for a selected category
    private static double handleCategoryOrder(int categoryOption, Scanner scanner) {
        double categoryCost = 0.0;
        char orderMore;

        do {
            if (categoryOption == 1) {
                displayVegMenu();
            } else if (categoryOption == 2) {
                displayNonVegMenu();
            }

            System.out.print("\nPlease enter the option: ");
            int dishOption = scanner.nextInt();
            System.out.print("Please enter the quantity: ");
            int quantity = scanner.nextInt();

            double cost = calculateDishCost(categoryOption, dishOption, quantity);
            categoryCost += cost;

            System.out.print("\nWould you like to order one more dish? [Y] or [N]: ");
            orderMore = scanner.next().charAt(0);

        } while (Character.toUpperCase(orderMore) == 'Y');

        return categoryCost;
    }

    // Displays the vegetarian menu
    private static void displayVegMenu() {
        System.out.println("\nBelow are the dishes available currently to order:");
        System.out.println("[1] Paneer tikka - Rs. 120.00 (per item)");
        System.out.println("[2] Cashew pulao - Rs. 150.00 (per item)");
        System.out.println("[3] Veg fried rice - Rs. 130.00 (per item)");
        System.out.println("[4] Gobi 65 - Rs. 100.00 (per item)");
        System.out.println("[5] Veg thali - Rs. 140.00 (per item)");
    }

    // Displays the non-vegetarian menu
    private static void displayNonVegMenu() {
        System.out.println("\nBelow are the dishes available currently to order:");
        System.out.println("[1] Chicken biryani - Rs. 200.00 (per item)");
        System.out.println("[2] Fish curry - Rs. 150.00 (per item)");
        System.out.println("[3] Chicken 65 - Rs. 120.00 (per item)");
        System.out.println("[4] Mutton gravy - Rs. 220.00 (per item)");
        System.out.println("[5] Chicken fried rice - Rs. 180.00 (per item)");
    }

    // Calculates the cost for a dish based on category, dish option, and quantity
    private static double calculateDishCost(int categoryOption, int dishOption, int quantity) {
        double price = 0.0;

        if (categoryOption == 1) { // Vegetarian
            switch (dishOption) {
                case 1 -> price = 120.00;
                case 2 -> price = 150.00;
                case 3 -> price = 130.00;
                case 4 -> price = 100.00;
                case 5 -> price = 140.00;
            }
        } else if (categoryOption == 2) { // Non-vegetarian
            switch (dishOption) {
                case 1 -> price = 200.00;
                case 2 -> price = 150.00;
                case 3 -> price = 120.00;
                case 4 -> price = 220.00;
                case 5 -> price = 180.00;
            }
        }

        return price * quantity;
    }
}

