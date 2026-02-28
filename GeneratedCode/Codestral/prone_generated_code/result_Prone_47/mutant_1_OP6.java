class BuggyClass {
    private int value;

    public BuggyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        // Mutant code added
        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) {
            // This loop will never execute, as the condition is always false
            System.out.println("This line is unreachable.");
        }

        if (obj == null || getClass()!= obj.getClass())
            return false;

        BuggyClass buggyClass = (BuggyClass) obj;
        return this.equals(buggyClass);
    }

    private boolean getUnreachableCondition() {
        // Replace this with a method that returns a false value
        return false;
    }

    public void showBug(BuggyClass other) {
        System.out.println(this.equals(other));
    }
}