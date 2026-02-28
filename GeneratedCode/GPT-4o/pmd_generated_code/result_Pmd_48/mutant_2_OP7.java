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
                boolean conditionWhile1 = getCondition();
                while (conditionWhile1) {
                    // unreachable code block
                    System.out.println("This is unreachable code in case 1");
                }
            case 2:
                result = "New";
                // BUG: ImplicitSwitchFallThrough
                boolean conditionWhile2 = getCondition();
                while (conditionWhile2) {
                    // unreachable code block
                    System.out.println("This is unreachable code in case 2");
                }
            case 3:
                result = "Removed";
                // fallthrough - this comment just clarifies that you want a fallthrough
                boolean conditionWhile3 = getCondition();
                while (conditionWhile3) {
                    // unreachable code block
                    System.out.println("This is unreachable code in case 3");
                }
            case 4: // empty case - this is interpreted as an intentional fall-through
                boolean conditionWhile4 = getCondition();
                while (conditionWhile4) {
                    // unreachable code block
                    System.out.println("This is unreachable code in case 4");
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

    // Helper method to simulate a condition that always returns false
    private boolean getCondition() {
        return false;
    }
}