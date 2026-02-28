class SwitchFallthroughExample {

    public int showBug(int value) {
        int result = 0;

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

        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999:
                result = 999;
                break;
            default:
                result = -999;
        }

        return result;
    }

    private int getUnreachableValue() {
        return -1; // This method simulates a condition that always returns a value not in the switch cases
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