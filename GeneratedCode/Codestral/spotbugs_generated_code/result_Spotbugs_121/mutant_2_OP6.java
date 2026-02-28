class ImpossibleDowncastBug {
    public boolean getCondition() {
        return false;
    }

    public void showBug() {
        Object object = new Object();
        // Insert unreachable for loop
        for (int i = 0; getCondition(); i++) {
            // This loop will never execute because the condition is always false
        }
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        String str = (String) object; // This will always throw a ClassCastException
    }
}