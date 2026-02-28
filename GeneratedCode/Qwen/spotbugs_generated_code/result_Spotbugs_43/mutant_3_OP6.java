class SwitchFallThroughBug {

    public int showBug(int option) {
        int result = 0;
        switch (option) {
            case 1:
                result = 10; // BUG: SF: Dead store due to switch statement fall through to throw (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH_TO_THROW)
                boolean conditionFor = getCondition();
                for (int i = 0; conditionFor; i++) {
                    // This loop is unreachable because conditionFor is dynamically determined and will be false
                }
            case 2:
                throw new IllegalArgumentException("Invalid option");
            default:
                return 0;
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but will always return false
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