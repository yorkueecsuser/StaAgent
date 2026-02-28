class BuggyClass {
    private String value;

    public BuggyClass(String value) {
        this.value = value;
    }

    // Original bug: Eq: equals() method defined that doesn't override equals(Object) (EQ_OTHER_NO_OBJECT)
    public boolean equals(BuggyClass other) {
        return this.value.equals(other.value);
    }

    // Mutant: Unreachable switch statement
    private boolean getCondition() {
        return false;
    }

    public void showBug(BuggyClass other) {
        System.out.println("Buggy equals(): " + this.equals(other));
        System.out.println("Correct equals(Object): " + this.equals((Object)other));

        // Added unreachable switch statement
        if (getCondition()) {
            int value = 1;
            switch(value) {
                case 2:
                    System.out.println("Unreachable code");
                    break;
            }
        }
    }
}