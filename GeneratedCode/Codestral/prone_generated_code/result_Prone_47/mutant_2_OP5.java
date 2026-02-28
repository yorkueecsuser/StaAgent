class BuggyClass {
    private int value;

    public BuggyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;

        // Mutant: Unreachable switch statement
        boolean unreachableCondition = getUnreachableCondition(); // Dynamic condition that always evaluates to false
        if (unreachableCondition) {
            int switchValue = getSwitchValue(); // Dynamic value that never matches any case
            switch (switchValue) {
                case 1:
                    System.out.println("This is an unreachable case.");
                    break;
            }
        }

        BuggyClass buggyClass = (BuggyClass) obj;
        return this.equals(buggyClass);
    }

    // Helper methods for dynamic conditions
    private boolean getUnreachableCondition() {
        return false;
    }

    private int getSwitchValue() {
        return -1;
    }

    public void showBug(BuggyClass other) {
        System.out.println(this.equals(other));
    }
}