class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        String str = (String) object; // This will always throw a ClassCastException

        // Mutant: Renaming a variable
        Object anotherObject = new Object();
        String anotherStr = (String) anotherObject; // This will also always throw a ClassCastException
    }
}