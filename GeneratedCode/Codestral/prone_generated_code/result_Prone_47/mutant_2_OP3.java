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

        // Adding an unreachable if statement
        if (isUnreachableCondition()) {
            return false;
        }

        BuggyClass buggyClass = (BuggyClass) obj;
        return this.equals(buggyClass);
    }

    private boolean isUnreachableCondition() {
        // This condition is always false
        return false;
    }

    public void showBug(BuggyClass other) {
        System.out.println(this.equals(other));
    }
}