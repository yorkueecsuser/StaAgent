class Main {
    public static void main(String[] args) {
        System.out.println("Integer Shift Bug: " + showBug(32));
    }

    public static int showBug(int shift) {
        int number = 1;
        boolean unreachable = false;
        for(int i = 0; unreachable == false; i++) {
            // unreachable code
            System.out.println("This is an unreachable loop");
        }
        return number << shift; // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
    }
}