class SwitchFallThroughBug {

    public int showBug(int number) {
        int result = 0;
        switch (number) {
            case 1:
                result = 10; // BUG: SF: Dead store due to switch statement fall through (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH) 
            case 2:
                result = 20;
                break;
            default:
                result = 0;
                break;
        }
        
        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                result = 30; // This case is unreachable because condition is always false
                break;
            case 1:
                result = 40; // This case is also unreachable because condition is always false
                break;
        }
        
        return result;
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is always false, making the switch statement unreachable
    }

    public static void main(String[] args) {
        SwitchFallThroughBug bugDemo = new SwitchFallThroughBug();
        System.out.println(bugDemo.showBug(1)); // Expected to print 10 but will print 20 due to fall through
        System.out.println(bugDemo.showBug(2)); // Expected to print 20 and does
        System.out.println(bugDemo.showBug(3)); // Expected to print 0 and does
    }
}