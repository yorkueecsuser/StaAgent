class ZeroDenominatorBug {
    public static void main(String[] args) {
        int numerator = 1;
        int denominator = 0;

        if (unknown()) {
            //..
            denominator = 3;
        } else {
            //..
        }

        int result = numerator / denominator; // BUG: Zero should not be a possible denominator

        System.out.println("Result: " + result);
    }

    public static boolean unknown() {
        return true;
    }

    // Unreachable if-else statement mutant
    public static void main(String[] args) {
        int numerator = 1;
        int denominator = 0;

        if (unknown()) {
            //..
            denominator = 3;
        } else {
            //..
        }

        int result = numerator / denominator; // BUG: Zero should not be a possible denominator

        System.out.println("Result: " + result);

        // Added unreachable if-else block
        if (false) {
            // This block is unreachable and will never be executed
            System.out.println("This line is unreachable");
        } else {
            // This block is unreachable and will never be executed
            System.out.println("This line is also unreachable");
        }
    }

    public static boolean unknown() {
        return true;
    }
}