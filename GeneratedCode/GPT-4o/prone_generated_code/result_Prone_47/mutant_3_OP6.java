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
        // BUG: EqualsReference
        return this.equals(obj); // BUG: EqualsReference
    }

    public boolean showBug(EqualsReferenceBugDemo other) {
        // Adding an unreachable for loop mutation
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never be printed due to the false condition.");
        }
        return this.equals(other); // This will cause an infinite loop if 'other' is the same instance
    }

    private boolean getFalseCondition() {
        // Return a non-final variable or a method call to avoid compile-time constant
        return false;
    }

    public static void main(String[] args) {
        EqualsReferenceBugDemo demo1 = new EqualsReferenceBugDemo("Example");
        System.out.println("Demo equals itself: " + demo1.showBug(demo1)); // Demonstrates the bug
    }
}