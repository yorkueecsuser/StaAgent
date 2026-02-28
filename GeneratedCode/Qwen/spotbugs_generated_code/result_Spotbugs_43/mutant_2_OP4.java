class SwitchFallThroughBug {

    public int showBug(int option) {
        int result = 0;
        switch (option) {
            case 1:
                result = 10; // BUG: SF: Dead store due to switch statement fall through to throw (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH_TO_THROW)
                boolean shouldRun = getCondition();
                if (shouldRun) {
                    // This block is unreachable because shouldRun is never set to true
                    result = 20;
                } else {
                    // This block is also unreachable because shouldRun is never set to false
                    result = 30;
                }
            case 2:
                throw new IllegalArgumentException("Invalid option");
            default:
                return 0;
        }
    }

    private boolean getCondition() {
        // This method always returns false, ensuring the if-else block remains unreachable
        return false;
    }

    public static void main(String[] args) {
        SwitchFallThroughBug bugDemo = new SwitchFallThroughBug();
        try {
            bugDemo.showBug(1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}