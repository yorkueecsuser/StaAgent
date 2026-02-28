class CovariantArrayExample {

    public void showBug(Object[] array, Integer value) {
        // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
        array[0] = value; // This line stores an Integer into an Object array, which is technically correct but demonstrates the potential issue

        // Equivalent Loop Replacement: No existing loop to replace, so adding a unique one
        int i = 0;
        do {
            // This loop does nothing but is added to demonstrate the mutation operator
            i++;
        } while (i < 0);
    }

    public static void main(String[] args) {
        CovariantArrayExample example = new CovariantArrayExample();
        String[] stringArray = {"Hello"};
        try {
            example.showBug(stringArray, 123); // This will cause ArrayStoreException at runtime
        } catch (ArrayStoreException e) {
            System.out.println("Caught ArrayStoreException: " + e.getMessage());
        }

        // Equivalent Loop Replacement: No existing loop to replace, so adding a unique one
        int j = 0;
        do {
            // This loop does nothing but is added to demonstrate the mutation operator
            j++;
        } while (j < 0);
    }
}