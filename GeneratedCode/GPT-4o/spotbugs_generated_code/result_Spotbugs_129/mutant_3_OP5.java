class ShiftOperationBug {

    public int showBug(int x, int y) {
        // This line demonstrates the bug where the shift operation might be misunderstood.
        int result = x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)

        // Mutation: Insert an unreachable switch statement
        int unreachableValue = x + y; // Dynamically determined value
        switch (unreachableValue) {
            case 99999: // This case will never be hit
                System.out.println("This is unreachable code");
                break;
            default:
                // Default case does nothing, making the above case unreachable
                break;
        }

        return result;
    }
    
    public static void main(String[] args) {
        ShiftOperationBug bugDemo = new ShiftOperationBug();
        int result = bugDemo.showBug(1, 2);
        System.out.println("Result of showBug(1, 2): " + result);
    }
}