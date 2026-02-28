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

        BuggyClass buggyClass = (BuggyClass) obj;

        // Mutant code - Unreachable if-else statement
        boolean unreachableCondition = isUnreachable();
        if (unreachableCondition) {
            System.out.println("This code should never execute.");
        } else {
            return this.equals(buggyClass);
        }
    }

    public void showBug(BuggyClass other) {
        System.out.println(this.equals(other));
    }

    // Helper method for the unreachable condition
    private boolean isUnreachable() {
        return false;
    }
}