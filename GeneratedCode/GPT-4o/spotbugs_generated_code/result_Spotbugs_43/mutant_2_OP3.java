class SwitchFallthroughExample {

    public int showBug(int value) {
        int result = 0;

        switch (value) {
            case 1:
                result = 100;
                // Inserting an unreachable if statement
                boolean condition1 = getCondition();
                if (condition1) {
                    result = 999;
                }
                // Missing break statement causes fall through
            case 2:
                result = 200;
                throw new IllegalArgumentException("Value cannot be 2");
            case 3:
                result = 300;
                // Inserting an unreachable if statement
                boolean condition3 = getCondition();
                if (condition3) {
                    result = 888;
                }
                break;
            default:
                result = -1;
                // Inserting an unreachable if statement
                boolean conditionDefault = getCondition();
                if (conditionDefault) {
                    result = 777;
                }
        }

        return result;
    }

    // Method to simulate a runtime condition, always returns false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        SwitchFallthroughExample example = new SwitchFallthroughExample();
        try {
            int result = example.showBug(1);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}