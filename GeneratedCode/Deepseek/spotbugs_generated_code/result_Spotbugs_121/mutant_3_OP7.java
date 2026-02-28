class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        String str = (String) object; // This will always throw a ClassCastException

        // Mutated Code: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This line is unreachable");
        }
    }

    private boolean getCondition() {
        return false; // This ensures that the while loop is always false and unreachable
    }
}