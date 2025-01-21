package Assignment03;

public class Main {
    public static void main(String[] args) {
        // Example usage

        // Passing four marks
        MarksCalculator calculator1 = new MarksCalculator(45, 50, 55, 60);
        calculator1.displayResults();

        System.out.println();

        // Passing three marks
        MarksCalculator calculator2 = new MarksCalculator(45, 50, 55);
        calculator2.displayResults();

        System.out.println();

        // Passing two marks
        MarksCalculator calculator3 = new MarksCalculator(45, 50);
        calculator3.displayResults();
    }
}
