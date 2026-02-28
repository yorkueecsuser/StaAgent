class Main {
    public static void main(String[] args) {
        System.out.println("Integer Shift Bug: " + showBug(32));
        while(false) {
            System.out.println("This is a mutant.");
        }
    }

    public static int showBug(int shift) {
        int number = 1;
        return number << shift; // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    }
}