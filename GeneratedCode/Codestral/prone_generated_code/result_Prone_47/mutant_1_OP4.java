class BuggyClass {
    private int value;

    public BuggyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable if-else statement mutant: This code will never be executed
            throw new RuntimeException("Unreachable code executed");
        }

        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;

        BuggyClass buggyClass = (BuggyClass) obj;
        return this.equals(buggyClass);
    }

    public void showBug(BuggyClass other) {
        System.out.println(this.equals(other));
    }
}