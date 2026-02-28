class ImpossibleDowncastBug {
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        Object object = new Object();
        // Original bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        String str = (String) object; // This will always throw a ClassCastException

        // Mutated code: Unreachable switch statement
        boolean condition = getFalseCondition(); // This will always be false
        switch (condition) {
            case true:
                System.out.println("This line will never be executed.");
                break;
            default:
                break;
        }
    }
}