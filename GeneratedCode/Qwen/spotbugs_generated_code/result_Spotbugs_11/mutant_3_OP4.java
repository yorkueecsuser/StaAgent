class CovariantArrayExample {

    public void showBug(Object[] array, Integer value) {
        // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
        array[0] = value; // This line stores an Integer into an Object array, which is technically correct but demonstrates the potential issue

        // Introduced unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is reachable only if condition is true
            System.out.println("This is a reachable block.");
        } else {
            // This block is unreachable because condition is never set to true
            array[0] = "Unreachable String"; // This line is part of the unreachable block
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the else block unreachable
    }

    public static void main(String[] args) {
        CovariantArrayExample example = new CovariantArrayExample();
        String[] stringArray = {"Hello"};
        try {
            example.showBug(stringArray, 123); // This will cause ArrayStoreException at runtime
        } catch (ArrayStoreException e) {
            System.out.println("Caught ArrayStoreException: " + e.getMessage());
        }
    }
}