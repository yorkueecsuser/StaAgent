class BuggyCloneImplementation implements Cloneable {
    int value;
    int r; // Mutant: Renaming the variable 'value' to 'r'

    BuggyCloneImplementation(int value) {
        this.value = value;
        this.r = value; // Mutant: Initializing the new variable 'r'
    }

    public Object clone() {
        // BUG: ProperCloneImplementation
        return new BuggyCloneImplementation(this.r); // Mutant: Using the new variable 'r' instead of 'value'
    }

    public void showBug() {
        BuggyCloneImplementation clone = (BuggyCloneImplementation) this.clone();
        System.out.println("Original object value: " + this.value);
        System.out.println("Cloned object value: " + clone.r); // Mutant: Using the new variable 'r' instead of 'value'
        System.out.println("Are objects equal (should be false): " + (this == clone));
    }
}