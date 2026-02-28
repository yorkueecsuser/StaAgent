class SelfComparisonExample {

    public int showBug(int value) {
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);

        // Insert an unreachable switch statement based on a non-final variable
        int unreachableSwitch = getUnreachableValue();
        switch (unreachableSwitch) {
            case 1:
                System.out.println("This should never be printed");
                break;
            default:
                // Do nothing
        }
    }

    // This method returns a value that makes the switch statement unreachable
    public static int getUnreachableValue() {
        return 0; // Always return 0, which matches no case in the switch
    }
}