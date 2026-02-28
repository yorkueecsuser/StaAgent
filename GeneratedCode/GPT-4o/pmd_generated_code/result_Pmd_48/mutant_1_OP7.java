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
        boolean unreachableCondition = getUnreachableCondition();
        
        switch (status) {
            case 1:
                result = "Cancelled";
                // BUG: ImplicitSwitchFallThrough
                while (unreachableCondition) {
                    // Unreachable code due to false condition
                    System.out.println("This is unreachable code in case 1.");
                }
            case 2:
                result = "New";
                // BUG: ImplicitSwitchFallThrough
                while (unreachableCondition) {
                    // Unreachable code due to false condition
                    System.out.println("This is unreachable code in case 2.");
                }
            case 3:
                result = "Removed";
                // fallthrough - this comment just clarifies that you want a fallthrough
                while (unreachableCondition) {
                    // Unreachable code due to false condition
                    System.out.println("This is unreachable code in case 3.");
                }
            case 4: // empty case - this is interpreted as an intentional fall-through
                while (unreachableCondition) {
                    // Unreachable code due to false condition
                    System.out.println("This is unreachable code in case 4.");
                }
            case 5:
                result = "Error";
                break;
            default:
                result = "Unknown";
                break;
        }
        return result;
    }

    private boolean getUnreachableCondition() {
        return false; // This simulates a condition that is always false
    }
}