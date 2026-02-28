class CovariantArrayExample {

    public void showBug(Object[] array, Integer value) {
        // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
        array[0] = value; // This line stores an Integer into an Object array, which is technically correct but demonstrates the potential issue
        array[1] = value; // Duplicate assignment to demonstrate the mutation operator
    }

    public static void main(String[] args) {
        CovariantArrayExample example = new CovariantArrayExample();
        String[] stringArray = {"Hello", "World"}; // Adjusted to have two elements to accommodate the duplicate assignment
        try {
            example.showBug(stringArray, 123); // This will cause ArrayStoreException at runtime
        } catch (ArrayStoreException e) {
            System.out.println("Caught ArrayStoreException: " + e.getMessage());
        }
    }
}