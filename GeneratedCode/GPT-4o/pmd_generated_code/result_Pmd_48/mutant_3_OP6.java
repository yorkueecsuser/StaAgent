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
                boolean unreachableCondition1 = getUnreachableCondition();
                for (int i = 0; unreachableCondition1; i++) {
                    System.out.println("This for-loop is unreachable.");
                }
            case 2:
                result = "New";
                // BUG: ImplicitSwitchFallThrough
                boolean unreachableCondition2 = getUnreachableCondition();
                for (int i = 0; unreachableCondition2; i++) {
                    System.out.println("This for-loop is also unreachable.");
                }
            case 3:
                result = "Removed";
                // fallthrough - this comment just clarifies that you want a fallthrough
                boolean unreachableCondition3 = getUnreachableCondition();
                for (int i = 0; unreachableCondition3; i++) {
                    System.out.println("Yet another unreachable for-loop.");
                }
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
    
    private boolean getUnreachableCondition() {
        // Simulated method that returns a false condition
        return false;
    }
}