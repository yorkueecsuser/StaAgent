class BoxedPrimitiveEqualityExample {

    public boolean showBug(Integer a, Integer b) {
        return a == b; // BUG: BoxedPrimitiveEquality

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                System.out.println("This is an unreachable switch case.");
                break;
            default:
                // Default case to satisfy switch statement requirements
                break;
        }
    }

    private boolean getCondition() {
        // This method returns false, making the switch condition always false
        return false;
    }

    public static void main(String[] args) {
        BoxedPrimitiveEqualityExample example = new BoxedPrimitiveEqualityExample();
        
        // Demonstrating the bug with cached values
        System.out.println("Comparing 127 and 127: " + example.showBug(127, 127)); // Expected: true
        
        // Demonstrating the bug with uncached values
        System.out.println("Comparing 128 and 128: " + example.showBug(128, 128)); // Expected: false
    }
}