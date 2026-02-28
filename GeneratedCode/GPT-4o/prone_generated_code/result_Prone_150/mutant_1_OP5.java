class SelfComparisonExample {

    public int showBug(int value) {
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);

        // Insert unreachable switch statement
        int switchCondition = getUnreachableValue();
        switch (switchCondition) {
            case 999: // Unreachable case
                System.out.println("This will never be printed");
                break;
            default:
                // Intentionally left blank
                break;
        }
    }

    private static int getUnreachableValue() {
        return -1; // Ensures the switch statement is unreachable
    }
}