class ImpossibleDowncastBug {
    public boolean getCondition() {
        return false; // This method always returns false to make the condition unreachable
    }

    public void showBug() {
        Object object = new Object();
        String str = (String) object; // This will always throw a ClassCastException

        // Mutant code to insert unreachable if-else statement
        if (getCondition()) {
            System.out.println("This line is unreachable");
        } else {
            // This block will never be executed
            System.out.println("This line is also unreachable");
        }
    }
}