class ShiftOperationBug {

    // Method to demonstrate the bug
    public int showBug(int x, int y) {
        // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY) 
        return x << 8 + y; // This line contains the bug

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                int unreachableVar = 10;
                System.out.println("This is unreachable: " + unreachableVar);
                break;
            default:
                // This default case will also never be reached
                System.out.println("This default is also unreachable");
                break;
        }
    }

    // Method to provide a dynamic condition that will always be false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ShiftOperationBug bugDemo = new ShiftOperationBug();
        int result = bugDemo.showBug(2, 3);
        System.out.println("Result of showBug(2, 3): " + result);
    }
}