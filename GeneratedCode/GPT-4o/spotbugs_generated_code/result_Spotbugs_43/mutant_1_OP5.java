class SwitchFallthroughExample {

    public int showBug(int value) {
        int result = 0;
        
        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999:
                System.out.println("This should never be printed.");
                break;
        }

        switch (value) {
            case 1:
                result = 100;
                // Missing break statement causes fall through
            case 2:
                result = 200;
                throw new IllegalArgumentException("Value cannot be 2");
            case 3:
                result = 300;
                break;
            default:
                result = -1;
        }

        return result;
    }

    private int getUnreachableValue() {
        // This can be adjusted to ensure that the switch statement is unreachable
        return -1; // This value is not matched by any case in the unreachable switch
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