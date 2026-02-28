class NullParameterBug {
    public static void printLength(String str) { // str should never be null
        boolean conditionWhile = getCondition(); // added method to dynamically get condition
        while (conditionWhile) { // unreachable while loop
            /* This loop is unreachable because the condition is always false */
        }
        System.out.println("Length: " + str.length()); // original bug still present
    }

    public static boolean getCondition() { // added method to get dynamic condition
        return false; // always returns false to make the loop unreachable
    }

    public static void showBug() {
        printLength(null); // passing null as a non-null parameter
    }

    public static void main(String[] args) {
        showBug();
    }
}