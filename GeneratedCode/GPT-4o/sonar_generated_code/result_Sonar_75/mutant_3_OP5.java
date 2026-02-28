class DivisionByZeroExample {

    public int showBug(int divisor) {
        // This method demonstrates a division by zero bug
        int result = 0;
        if (divisor != 0) {
            result = 10 / divisor;
        } else {
            result = 10 / divisor; // BUG: Zero should not be a possible denominator
            
            // Unreachable switch statement added as mutation
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) {
                case 1:
                    System.out.println("This will never be printed.");
                    break;
                case 2:
                    System.out.println("This won't be printed either.");
                    break;
                default:
                    System.out.println("Default case in unreachable switch.");
            }
        }
        return result;
    }

    // A method to ensure the switch condition is not a compile-time constant
    private int getUnreachableValue() {
        return -1; // This value does not match any case in the switch
    }

    public static void main(String[] args) {
        DivisionByZeroExample example = new DivisionByZeroExample();
        // This will demonstrate a division by zero
        int result = example.showBug(0);
        System.out.println("Result: " + result);
    }
}