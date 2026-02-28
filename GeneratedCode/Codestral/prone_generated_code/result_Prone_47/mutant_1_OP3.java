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

        // Mutant Code: Unreachable if statement
        boolean unreachableCondition = isUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This statement is unreachable.");
        }

        return this.equals(buggyClass);
    }

    // Method to simulate unreachable condition
    private boolean isUnreachableCondition() {
        return false;
    }

    public void showBug(BuggyClass other) {
        System.out.println(this.equals(other));
    }
}