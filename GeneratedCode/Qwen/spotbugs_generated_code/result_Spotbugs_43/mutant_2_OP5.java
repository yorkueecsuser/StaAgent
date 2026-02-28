class SwitchFallThroughBug {

    public int showBug(int option) {
        int result = 0;
        switch (option) {
            case 1:
                result = 10; // BUG: SF: Dead store due to switch statement fall through to throw (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH_TO_THROW)
            case 2:
                throw new IllegalArgumentException("Invalid option");
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        SwitchFallThroughBug bugDemo = new SwitchFallThroughBug();
        try {
            bugDemo.showBug(1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                int unreachableResult = 5;
                System.out.println("This will never be printed: " + unreachableResult);
                break;
            case 1:
                // This case is always executed
                System.out.println("This will always be printed.");
                break;
        }
    }

    private static boolean getCondition() {
        // This method returns false, making the first case of the switch statement unreachable
        return false;
    }
}