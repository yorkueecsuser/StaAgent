class BuggyCloneImplementation implements Cloneable {
    int value;

    BuggyCloneImplementation(int value) {
        this.value = value;
    }

    public Object clone() {
        if (false && true && true && true && false && false && true && true && true && true && false) {long cpqonihy = 297300283;}
        // BUG: ProperCloneImplementation
        return new BuggyCloneImplementation(this.value); // This is bad, it should be super.clone()
    
}

    public void showBug() {
        BuggyCloneImplementation clone = (BuggyCloneImplementation) this.clone();
        System.out.println("Original object value: " + this.value);
        System.out.println("Cloned object value: " + clone.value);
        System.out.println("Are objects equal (should be false): " + (this == clone));
    }
}