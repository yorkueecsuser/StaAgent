class ImpossibleDowncastBug {
    public boolean getCondition() {
        // This method always returns false to make the condition unreachable
        return false;
    }

    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        String str = (String) object; // This will always throw a ClassCastException

        // Mutant code: Unreachable if statement
        if (getCondition()) {
            // This if block is unreachable
            // Add your unreachable code here
        }
    }
}