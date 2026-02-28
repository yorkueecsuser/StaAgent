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

    // Inserting an unreachable switch statement
    public void unreachableSwitch() {
        boolean condition = getCondition();
        switch (condition? 0 : 1) { // This switch will never take the case 0 path because condition is always false
            case 0:
                System.out.println("This is unreachable");
                break;
            case 1:
                System.out.println("This is reachable");
                break;
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is always false, making the case 0 unreachable
    }

    public static void main(String[] args) {
        SwitchFallThroughBug bugDemo = new SwitchFallThroughBug();
        try {
            bugDemo.showBug(1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        bugDemo.unreachableSwitch(); // Call the method containing the unreachable switch
    }
}