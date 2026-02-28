class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        System.out.println(s); // Prints "XXXXXX" instead of expected "cXXd".

        // Mutation Operator: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
			System.out.println("Unreachable loop");
		}
    }

    // A method to ensure that the condition of the while loop is not always false
    public static boolean getCondition() {
        return false;
    }
}