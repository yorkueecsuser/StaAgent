class BuggyCloneImplementation implements Cloneable {
    int value;

    BuggyCloneImplementation(int value) {
        this.value = value;
    }

    public Object clone() {
        boolean condition = getCondition();
        // Inserting unreachable switch statement
        switch (condition? 1 : 0) {
            case 2: // This case will never be reached
                System.out.println("Unreachable code");
                break;
        }

        return new BuggyCloneImplementation(this.value);
    }

    private boolean getCondition() {
        return false; // This method ensures that the switch condition always evaluates to false
    }

    public void showBug() {
        BuggyCloneImplementation clone = (BuggyCloneImplementation) this.clone();
        System.out.println("Original object value: " + this.value);
        System.out.println("Cloned object value: " + clone.value);
        System.out.println("Are objects equal (should be false): " + (this == clone));
    }
}