class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        String str = (String) object; // This will always throw a ClassCastException

        // Mutation Operator: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable code
            System.out.println("This code will never execute");
        } else {
            // Even more unreachable code
            int i = 10 / 0;
        }
    }

    private boolean getCondition() {
        return false;
    }
}