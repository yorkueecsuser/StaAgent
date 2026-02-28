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

        boolean condition = false;
        if (condition) {
            // code that will never be executed
            int result = numerator / denominator; // BUG: Zero should not be a possible denominator
            System.out.println("Result: " + result);
        }

        System.out.println("Result: " + numerator / denominator); // this will always print "Result: 0"
    }

    public static boolean unknown() {
        return true;
    }

    public static boolean getCondition() {
        return false;
    }
}