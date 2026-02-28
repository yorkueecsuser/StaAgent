class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Dead Store: Unused variable declaration
        int unusedVariable = 0;
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        String str = (String) object; // This will always throw a ClassCastException
    }
}