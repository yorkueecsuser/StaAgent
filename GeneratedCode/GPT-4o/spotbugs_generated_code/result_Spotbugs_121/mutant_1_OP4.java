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
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code due to condition always being false
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This is the reachable else block.");
        }
        String result = (String) integerObject; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        return result;
    }

    private boolean getCondition() {
        return false; // Ensures the if-else branch is unreachable
    }
}