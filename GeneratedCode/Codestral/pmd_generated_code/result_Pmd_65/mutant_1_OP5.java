class BuggyCloneImplementation implements Cloneable {
    int value;

    BuggyCloneImplementation(int value) {
        this.value = value;
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public Object clone() {
        // BUG: ProperCloneImplementation
        if (getUnreachableCondition()) {
            // Unreachable switch statement
            switch (this.value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }
        return new BuggyCloneImplementation(this.value);
    }

    public void showBug() {
        BuggyCloneImplementation clone = (BuggyCloneImplementation) this.clone();
        System.out.println("Original object value: " + this.value);
        System.out.println("Cloned object value: " + clone.value);
        System.out.println("Are objects equal (should be false): " + (this == clone));
    }
}