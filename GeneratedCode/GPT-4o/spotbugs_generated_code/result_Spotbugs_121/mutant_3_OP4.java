class ImpossibleDowncastExample {

    public static void main(String[] args) {
        try {
            new ImpossibleDowncastExample().showBug();
        } catch (ClassCastException e) {
            System.out.println("Caught exception: " + e);
        }
    }

    public String showBug() {
        Object integerObject = Integer.valueOf(42);
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("Proceeding with the original code.");
        }
        String result = (String) integerObject; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        return result;
    }

    // Helper method to ensure the branch condition is dynamically determined
    private boolean getFalseCondition() {
        return false;
    }
}