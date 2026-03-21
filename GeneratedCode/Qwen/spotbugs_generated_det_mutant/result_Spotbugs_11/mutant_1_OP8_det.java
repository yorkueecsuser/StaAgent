class CovariantArrayExample {

    public void showBug(Object[] array, Integer value) {
        // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
        array[0] = value; // This line stores an Integer into an Object array, which is technically correct but demonstrates the potential issue
    }

    public static void main(String[] args) {
        CovariantArrayExample example = new CovariantArrayExample();
        String[] crlunruc = {"Hello"};
        try {
            example.showBug(crlunruc, 123); // This will cause ArrayStoreException at runtime
        } catch (ArrayStoreException e) {
            System.out.println("Caught ArrayStoreException: " + e.getMessage());
        }
    }
}