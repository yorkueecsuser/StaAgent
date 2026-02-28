class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        String str = (String) object; // This will always throw a ClassCastException

        // Mutation: Equivalent Loop Replacement
        // Introduce a do-while loop that doesn't affect the buggy line of code
        int i = 0;
        do {
            i++;
        } while (i < 1);
    }
}