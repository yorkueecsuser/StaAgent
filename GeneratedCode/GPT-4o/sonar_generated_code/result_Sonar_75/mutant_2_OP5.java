class DivisionByZeroExample {

    public int showBug(int divisor) {
        // This method demonstrates a division by zero bug
        int result = 0;
        if (divisor != 0) {
            result = 10 / divisor;
        } else {
            result = 10 / divisor; // BUG: Zero should not be a possible denominator
            
            // Inserting an unreachable switch statement
            int unreachableSwitchValue = getSwitchValue(); // dynamically determined at runtime
            switch (unreachableSwitchValue) {
                case 1:
                    System.out.println("This will never be reached.");
                    break;
                case 2:
                    System.out.println("This will also never be reached.");
                    break;
                default:
                    System.out.println("Default case, unreachable.");
            }
        }
        return result;
    }

    private int getSwitchValue() {
        // This method returns a value that will make the switch unreachable
        return -1; // Choosing a value that doesn't match any case
    }

    public static void main(String[] args) {
        DivisionByZeroExample example = new DivisionByZeroExample();
        // This will demonstrate a division by zero
        int result = example.showBug(0);
        System.out.println("Result: " + result);
    }
}