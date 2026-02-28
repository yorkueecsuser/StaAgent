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
            case 10:
                System.out.println("This is unreachable case 10");
                break;
            case 20:
                System.out.println("This is unreachable case 20");
                break;
            default:
                System.out.println("This is unreachable default case");
        }

        return result;
    }

    // Method to ensure the switch statement condition is evaluated at runtime
    private int getUnreachableValue() {
        return -1; // Always returns a value not matching any case
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