class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        this.name = name;
    }

    // BUG: OverrideBothEqualsAndHashcode
    @Override
    public boolean equals(Object obj) {
        boolean unreachableCondition = getUnreachableCondition(); // Added method to simulate dynamically determined condition
        if (unreachableCondition) { // Unreachable block
            System.out.println("This line should never be executed.");
        } else {
            // Original code
            if (this == obj)
                return true;
            if (obj == null || getClass()!= obj.getClass())
                return false;
            BuggyClass buggyClass = (BuggyClass) obj;
            return name.equals(buggyClass.name);
        }
    }

    // Method to simulate dynamically determined condition
    private boolean getUnreachableCondition() {
        return false; // Always false to make the block unreachable
    }

    public void showBug(BuggyClass other) {
        System.out.println("Equals method result: " + this.equals(other));
        System.out.println("Hashcode of this object: " + this.hashCode());
        System.out.println("Hashcode of other object: " + other.hashCode());
    }
}