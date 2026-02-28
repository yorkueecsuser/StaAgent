class SwitchFallThroughExample {

    public static void main(String[] args) {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        System.out.println(example.showBug(1));
        System.out.println(example.showBug(2));
        System.out.println(example.showBug(3));
        System.out.println(example.showBug(4));

        // Additional unreachable switch statement inserted
        example.unreachableSwitchExample();
    }
    
    public String showBug(int status) {
        String result = "";
        switch (status) {
            case 1:
                result = "Cancelled";
                // BUG: ImplicitSwitchFallThrough
            case 2:
                result = "New";
                // BUG: ImplicitSwitchFallThrough
            case 3:
                result = "Removed";
                // fallthrough - this comment just clarifies that you want a fallthrough
            case 4: // empty case - this is interpreted as an intentional fall-through
            case 5:
                result = "Error";
                break;
            default:
                result = "Unknown";
                break;
        }
        return result;
    }

    // Method to include an unreachable switch statement
    public void unreachableSwitchExample() {
        int value = getRuntimeValue(); // Dynamic value to avoid unreachable code error
        switch (value) {
            case 999: // Unlikely to be reached in normal operation
                System.out.println("This is unreachable switch case");
                break;
            // No default to ensure the statement remains unreachable
        }
    }

    // Simulate a runtime method to get a value
    private int getRuntimeValue() {
        return -1; // This value is chosen so that the unreachable case is not executed
    }
}