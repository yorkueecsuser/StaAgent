class SwitchFallThroughExample {

    public static void main(String[] args) {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        System.out.println(example.showBug(1));
        System.out.println(example.showBug(2));
        System.out.println(example.showBug(3));
        System.out.println(example.showBug(4));
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

        // Mutation: Introducing unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition(); // Call a method to determine the condition
        if (unreachableCondition) {
            // This block is unreachable
            result = "This will never execute";
        } else {
            // This block will always execute
            result += " ";
        }

        return result;
    }

    // Helper method to simulate a condition that's always false
    private boolean getUnreachableCondition() {
        return false; // This method can be more complex in a real-world scenario
    }
}