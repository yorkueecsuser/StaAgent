class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Dead store: Unused integer variable declaration
        int unusedVariable = 10;

        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        String str = (String) object; // This will always throw a ClassCastException
    }
}