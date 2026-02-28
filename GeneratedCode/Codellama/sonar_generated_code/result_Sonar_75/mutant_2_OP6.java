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

    public static void unreachableForLoop() {
        for (int i = 0; false; i++) {
            // This loop is unreachable and will never be executed
        }
    }
}