class CovariantArrayBugDemo {

    public Object showBug() {
        // Create an array of Number
        Number[] a = new Integer[5];
        
        // Attempt to store a Double in an Integer array
        a[0] = 1.5; // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
        
        return a[0];
    }

    public static void main(String[] args) {
        CovariantArrayBugDemo b = new CovariantArrayBugDemo();
        try {
            b.showBug();
        } catch (ArrayStoreException c) {
            System.out.println("Caught ArrayStoreException: " + c.getMessage());
        }
    }
}