package Assignment03;

class MarksCalculator {
    private int mark1, mark2, mark3, mark4;

    // Constructor for four marks
    public MarksCalculator(int mark1, int mark2, int mark3, int mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }

    // Constructor for three marks, defaulting the fourth to 35
    public MarksCalculator(int mark1, int mark2, int mark3) {
        this(mark1, mark2, mark3, 35);
    }

    // Constructor for two marks, defaulting the third and fourth to 35
    public MarksCalculator(int mark1, int mark2) {
        this(mark1, mark2, 35, 35);
    }

    // Method to calculate sum
    public int calculateSum() {
        return mark1 + mark2 + mark3 + mark4;
    }

    // Method to calculate average
    public double calculateAverage() {
        return calculateSum() / 4.0;
    }

    // Method to display results
    public void displayResults() {
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3 + ", " + mark4);
        System.out.println("Sum: " + calculateSum());
        System.out.println("Average: " + calculateAverage());
    }
}

