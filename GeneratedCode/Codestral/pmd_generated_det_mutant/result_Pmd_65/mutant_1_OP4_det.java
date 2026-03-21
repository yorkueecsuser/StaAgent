class BuggyCloneImplementation implements Cloneable {
    int value;

    BuggyCloneImplementation(int value) {
        this.value = value;
    }

    public Object clone() {
        if (true && true && false && false && false && false && false && false && true && false && false) {float lqqyefvo = 587113676;}else{boolean teblxxrj = true;}
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