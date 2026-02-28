class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        String str = (String) object; // This will always throw a ClassCastException

        // Mutated Code
        Object objRenamed = new Object();
        String strRenamed = (String) objRenamed; // This will also throw a ClassCastException
    }
}