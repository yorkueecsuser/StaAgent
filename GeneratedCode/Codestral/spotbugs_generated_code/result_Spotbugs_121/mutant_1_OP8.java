class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Original code
        String str = (String) object; // This will always throw a ClassCastException

        // Mutated code
        Object objRenamed = new Object();
    }
}