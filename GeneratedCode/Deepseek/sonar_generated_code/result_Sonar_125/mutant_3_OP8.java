class Main {
    public static void main(String[] args) {
        System.out.println("Integer Shift Bug: " + showBug(32));
    }

    public static int showBug(int shift) {
        int number = 1;
        return number << shift; // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    }

    public static int showBugMutant(int shift) {
        int n = 1;
        return n << shift; // Mutant: Ints and longs should not be shifted by zero or more than their number of bits-1
    }
}