class ImpossibleDowncastBug {
    public void showBug() {
        Object object = new Object();
        String str = (String) object; // This will always throw a ClassCastException

        // Mutated Code
        Object objectDuplicate = object; // Duplication of the assignment statement
        String strDuplicate = (String) objectDuplicate; // This will also always throw a ClassCastException
    }
}