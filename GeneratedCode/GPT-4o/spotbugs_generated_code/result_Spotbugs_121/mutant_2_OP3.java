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
        boolean condition = getCondition(); // Dynamically determine condition at runtime
        if (condition) {
            System.out.println("This will never be printed.");
        }
        String result = (String) integerObject; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        return result;
    }

    public boolean getCondition() {
        return false; // Always returns false to make the if branch unreachable
    }
}