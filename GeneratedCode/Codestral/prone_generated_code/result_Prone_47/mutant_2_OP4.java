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

        // Mutant Code Insertion
        boolean shouldNotRun = getCondition();
        if (shouldNotRun) {
            // unreachable code
            System.out.println("This code will never run.");
        }

        return this.equals(buggyClass);
    }

    public void showBug(BuggyClass other) {
        System.out.println(this.equals(other));
    }

    // Method to return a dynamically determined condition
    private boolean getCondition() {
        // Here, you can put any logic to determine the condition dynamically
        // For the sake of this example, let's assume it always returns false
        return false;
    }
}