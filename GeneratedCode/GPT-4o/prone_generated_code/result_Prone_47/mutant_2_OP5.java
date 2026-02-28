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

    private int getUnreachableValue() {
        return -1; // Dynamic value that does not match any case
    }

    public void unreachableSwitchDemo() {
        int unreachableSwitch = getUnreachableValue();
        switch (unreachableSwitch) {
            case 1:
                System.out.println("This case is never reached.");
                break;
            case 2:
                System.out.println("This case is also never reached.");
                break;
            default:
                System.out.println("Default case, still never reached.");
                break;
        }
    }

    public static void main(String[] args) {
        EqualsReferenceBugDemo demo1 = new EqualsReferenceBugDemo("Example");
        System.out.println("Demo equals itself: " + demo1.showBug(demo1)); // Demonstrates the bug

        // Call the method to demonstrate an unreachable switch statement
        demo1.unreachableSwitchDemo();
    }
}