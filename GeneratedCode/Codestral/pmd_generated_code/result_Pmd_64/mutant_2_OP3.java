class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        this.name = name;
    }

    // BUG: OverrideBothEqualsAndHashcode
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;

        // Mutant code: Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code should not be executed.");
        }

        BuggyClass buggyClass = (BuggyClass) obj;
        return name.equals(buggyClass.name);
    }

    private boolean getUnreachableCondition() {
        // This method returns a false value to make the if statement unreachable.
        // In a real-world scenario, this condition could be based on some dynamic computation or external input.
        return false;
    }

    public void showBug(BuggyClass other) {
        System.out.println("Equals method result: " + this.equals(other));
        System.out.println("Hashcode of this object: " + this.hashCode());
        System.out.println("Hashcode of other object: " + other.hashCode());
    }
}