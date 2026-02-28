class BuggyCloneImplementation implements Cloneable {
    int v; // Renamed 'value' to 'v'

    BuggyCloneImplementation(int v) { // updated parameter name
        this.v = v; // updated variable name
    }

    public Object clone() {
        return new BuggyCloneImplementation(this.v); // updated variable name
    }

    public void showBug() {
        BuggyCloneImplementation c = (BuggyCloneImplementation) this.clone(); // renamed 'clone' to 'c'
        System.out.println("Original object value: " + this.v); // updated variable name
        System.out.println("Cloned object value: " + c.v); // updated variable name
        System.out.println("Are objects equal (should be false): " + (this == c));
    }
}