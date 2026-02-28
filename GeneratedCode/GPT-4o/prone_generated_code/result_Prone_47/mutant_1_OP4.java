class EqualsReferenceBugDemo {

    private String name;

    public EqualsReferenceBugDemo(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Insert an unreachable if-else branch
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This code is unreachable
            return false;
        } else {
            // BUG: EqualsReference
            return this.equals(obj); // BUG: EqualsReference
        }
    }

    public boolean showBug(EqualsReferenceBugDemo other) {
        return this.equals(other); // This will cause an infinite loop if 'other' is the same instance
    }

    public static void main(String[] args) {
        EqualsReferenceBugDemo demo1 = new EqualsReferenceBugDemo("Example");
        System.out.println("Demo equals itself: " + demo1.showBug(demo1)); // Demonstrates the bug
    }

    // Helper method to avoid using compile-time constant
    private boolean getUnreachableCondition() {
        return false;
    }
}