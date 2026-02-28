class ImpossibleDowncastExample {

    public static void main(String[] args) {
        try {
            new ImpossibleDowncastExample().showBug();
        } catch (ClassCastException e) {
            System.out.println("Caught exception: " + e);
        }
    }

    public String showBug() {
        boolean conditionWhile = determineCondition(); // Using a method to ensure dynamic condition
        Object integerObject = Integer.valueOf(42);

        // Unreachable while loop inserted
        while (conditionWhile) {
            System.out.println("This will never be printed.");
        }

        String result = (String) integerObject; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        return result;
    }

    private boolean determineCondition() {
        // Always returns false, making the while loop unreachable
        return false;
    }
}