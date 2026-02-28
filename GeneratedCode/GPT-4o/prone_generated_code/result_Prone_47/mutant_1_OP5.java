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
        return this.equals(other); // This will cause an infinite loop if 'other' is the same instance
    }

    // Unreachable switch statement inserted
    public void unreachableSwitchDemo() {
        int value = getFalseValue(); // Dynamically determined at runtime
        switch (value) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                // Default case, do nothing
                break;
        }
    }

    private int getFalseValue() {
        return 0; // Adjust this method to always return a value that does not match any case
    }

    public static void main(String[] args) {
        EqualsReferenceBugDemo demo1 = new EqualsReferenceBugDemo("Example");
        System.out.println("Demo equals itself: " + demo1.showBug(demo1)); // Demonstrates the bug

        // Demonstrate unreachable switch
        demo1.unreachableSwitchDemo();
    }
}