class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        String str = (String) object; // This will always throw a ClassCastException

        // Mutant: Adding an unnecessary do-while loop that doesn't affect the bug
        do {
            Object anotherObject = new Object();
            // This line is not related to the bug and will not cause a ClassCastException
            String anotherStr = (String) anotherObject;
        } while (false);
    }
}