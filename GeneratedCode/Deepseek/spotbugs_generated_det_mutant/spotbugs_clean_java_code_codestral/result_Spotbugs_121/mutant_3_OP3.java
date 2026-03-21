class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();

        // Inserted an unreachable if statement
        if (getUnreachableCondition()) {
            // This branch will never be executed
            System.out.println("This is an unreachable branch");
        }

        // Original bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        String str = (String) object; // This will always throw a ClassCastException
    }

    // A method to return a false condition
    private boolean getUnreachableCondition() {
        return false;
    }
}