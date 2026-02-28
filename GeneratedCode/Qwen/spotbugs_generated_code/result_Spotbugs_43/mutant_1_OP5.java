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
        if (condition) {
            int value = getValue();
            switch (value) {
                case 1:
                    System.out.println("This is unreachable");
                    break;
                case 2:
                    System.out.println("This is also unreachable");
                    break;
                default:
                    System.out.println("Default case is unreachable");
                    break;
            }
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    private int getValue() {
        return 0; // This method ensures the value is dynamically determined
    }

    public static void main(String[] args) {
        SwitchFallThroughBug bugDemo = new SwitchFallThroughBug();
        try {
            bugDemo.showBug(1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        bugDemo.unreachableSwitch(); // Call to the unreachable switch method
    }
}