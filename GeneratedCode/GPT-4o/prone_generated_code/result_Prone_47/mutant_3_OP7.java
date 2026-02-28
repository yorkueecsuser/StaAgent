class EqualsReferenceBugDemo {

    private String name;

    public EqualsReferenceBugDemo(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        // Inserted unreachable while loop
        boolean unreachable = getUnreachableCondition();
        while (unreachable) {
            // This block is unreachable because the condition is always false
            System.out.println("This is unreachable");
        }

        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // BUG: EqualsReference
        return this.equals(obj); // BUG: EqualsReference
    }

    public boolean showBug(EqualsReferenceBugDemo other) {
        // Another unreachable while loop
        boolean unreachableShowBug = getUnreachableCondition();
        while (unreachableShowBug) {
            // This block is unreachable
            System.out.println("Unreachable in showBug");
        }

        return this.equals(other); // This will cause an infinite loop if 'other' is the same instance
    }

    // Method to simulate a condition that is always false
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        EqualsReferenceBugDemo demo1 = new EqualsReferenceBugDemo("Example");
        System.out.println("Demo equals itself: " + demo1.showBug(demo1)); // Demonstrates the bug
    }
}