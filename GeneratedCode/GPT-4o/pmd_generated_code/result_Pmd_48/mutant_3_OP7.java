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
                // Mutant: Unreachable while loop inserted
                boolean condition1 = getCondition();
                while (condition1) {
                    System.out.println("Unreachable code in case 1");
                }
                result = "Cancelled";
                // BUG: ImplicitSwitchFallThrough
            case 2:
                // Mutant: Unreachable while loop inserted
                boolean condition2 = getCondition();
                while (condition2) {
                    System.out.println("Unreachable code in case 2");
                }
                result = "New";
                // BUG: ImplicitSwitchFallThrough
            case 3:
                // Mutant: Unreachable while loop inserted
                boolean condition3 = getCondition();
                while (condition3) {
                    System.out.println("Unreachable code in case 3");
                }
                result = "Removed";
                // fallthrough - this comment just clarifies that you want a fallthrough
            case 4: // empty case - this is interpreted as an intentional fall-through
                // Mutant: Unreachable while loop inserted
                boolean condition4 = getCondition();
                while (condition4) {
                    System.out.println("Unreachable code in case 4");
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

    // Dummy method to simulate dynamic condition
    private boolean getCondition() {
        return false;
    }
}