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
        String result = (String) integerObject; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)

        // Mutation: Inserting unreachable if-else branch
        boolean isConditionMet = getCondition(); // Utilizing a method to create a non-final variable
        if (isConditionMet) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This is the reachable else block.");
        }

        return result;
    }

    // Method to ensure the condition is dynamically determined at runtime
    private boolean getCondition() {
        return false;
    }
}