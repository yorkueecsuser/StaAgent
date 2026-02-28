class NaNBugExample {

    public boolean showBug(double x) {
        return x == Double.NaN; // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)

        // Inserting an unreachable switch statement
        boolean condition = false;
        switch (getValue()) {
            case 1:
                // This case is unreachable because getValue() will never return 1
                System.out.println("This is an unreachable case.");
                break;
            case 2:
                // This case is also unreachable for the same reason
                System.out.println("Another unreachable case.");
                break;
        }
    }

    private int getValue() {
        // This method always returns 0, making the switch statement unreachable
        return 0;
    }

    public static void main(String[] args) {
        NaNBugExample example = new NaNBugExample();
        double nanValue = Double.NaN;
        double normalValue = 0.0;

        System.out.println("Checking NaN value: " + example.showBug(nanValue)); // Expected: false
        System.out.println("Checking normal value: " + example.showBug(normalValue)); // Expected: false
    }
}