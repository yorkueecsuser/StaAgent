class ImpossibleDowncastBug {
    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        String str = (String) object; // This will always throw a ClassCastException

        // Mutant: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never be executed
            System.out.println("Unreachable block of code");
        } else {
            // This block is also unreachable, but added to satisfy the requirement
            System.out.println("Another unreachable block of code");
        }
    }
}