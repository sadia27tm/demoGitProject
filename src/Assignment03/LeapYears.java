package Assignment03;

public class LeapYears {
    public static void main(String[] args) {
        System.out.println("Leap years between 2000 and 2100:");

        // Loop through years from 2000 to 2100
        for (int year = 2000; year <= 2100; year++) {
            // Check if the year is a leap year
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year); // Leap year divisible by 400
                    }
                } else {
                    System.out.println(year); // Leap year divisible by 4 but not 100
                }
            }
        }
    }
}
