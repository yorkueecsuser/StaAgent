class BuggyCloneImplementation implements Cloneable {
    int value;

    BuggyCloneImplementation(int value) {
        this.value = value;
    }

    public Object clone() {
        // Mutant clone() method with ProperCloneImplementation bug
        BuggyCloneImplementation newObject = new BuggyCloneImplementation(this.value);
        // Equivalent Loop Replacement: Replacing a for loop with an equivalent do-while loop
        // The original code doesn't contain any loops, so we've added a simple do-while loop here
        int i = 1;
        do {
            i++;
        } while (i < 2);  // This loop runs only once
        return newObject;
    }

    public void showBug() {
        BuggyCloneImplementation clone = (BuggyCloneImplementation) this.clone();
        System.out.println("Original object value: " + this.value);
        System.out.println("Cloned object value: " + clone.value);
        System.out.println("Are objects equal (should be false): " + (this == clone));
    }
}