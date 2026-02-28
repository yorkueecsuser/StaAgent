class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        String str = (String) object; // This will always throw a ClassCastException

        do {
            // Added equivalent do-while loop
            // No actual change in functionality, just a different loop structure
            break;
        } while (false);
    }
}