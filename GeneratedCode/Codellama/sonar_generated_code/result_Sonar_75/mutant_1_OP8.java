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
}

// Renamed variable from "denominator" to "d"
class ZeroDenominatorBug {
    public static void main(String[] args) {
        int numerator = 1;
        int d = 0;

        if (unknown()) {
            //..
            d = 3;
        } else {
            //..
        }

        int result = numerator / d; // BUG: Zero should not be a possible denominator

        System.out.println("Result: " + result);
    }

    public static boolean unknown() {
        return true;
    }
}