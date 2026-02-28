class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        // Original bug
        String str = (String) object; // This will always throw a ClassCastException

        // Mutated code
        Object object2 = new Object();
        String str2 = (String) object2; // This is a duplicate of the original bug line
    }
}