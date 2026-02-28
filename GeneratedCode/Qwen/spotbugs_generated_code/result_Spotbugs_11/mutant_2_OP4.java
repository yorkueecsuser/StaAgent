class CovariantArrayExample {

    public void showBug(Object[] array, Integer value) {
        // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
        array[0] = value; // This line stores an Integer into an Object array, which is technically correct but demonstrates the potential issue

        // Introduced unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code block
            System.out.println("This is unreachable code.");
        } else {
            // Alternative unreachable code block
            System.out.println("This is also unreachable code.");
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else block effectively unreachable
        return false;
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