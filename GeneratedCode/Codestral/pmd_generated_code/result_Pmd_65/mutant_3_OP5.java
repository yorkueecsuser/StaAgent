class BuggyCloneImplementation implements Cloneable {
    int value;

    BuggyCloneImplementation(int value) {
        this.value = value;
    }

    public Object clone() {
        boolean alwaysFalse = falseMethod();
        switch (alwaysFalse) {
            case true:
                System.out.println("This line should not be reached.");
                break;
        }
        return new BuggyCloneImplementation(this.value);
    }

    public void showBug() {
        BuggyCloneImplementation clone = (BuggyCloneImplementation) this.clone();
        System.out.println("Original object value: " + this.value);
        System.out.println("Cloned object value: " + clone.value);
        System.out.println("Are objects equal (should be false): " + (this == clone));
    }

    private boolean falseMethod() {
        return false;
    }
}