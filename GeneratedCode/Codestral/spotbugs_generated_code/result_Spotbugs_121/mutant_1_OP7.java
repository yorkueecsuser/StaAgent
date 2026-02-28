class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        String str = (String) object; // This will always throw a ClassCastException

        // Mutant code: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false.
            System.out.println("This line will never be executed.");
        }
    }

    private boolean getCondition() {
        return false;
    }
}