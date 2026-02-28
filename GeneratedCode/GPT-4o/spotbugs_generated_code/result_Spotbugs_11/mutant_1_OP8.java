class CovariantArrayBugDemo {

    public Object showBug() {
        // Create an array of Number
        Number[] x = new Integer[5];
        
        // Attempt to store a Double in an Integer array
        x[0] = 1.5; // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
        
        return x[0];
    }

    public static void main(String[] args) {
        CovariantArrayBugDemo y = new CovariantArrayBugDemo();
        try {
            y.showBug();
        } catch (ArrayStoreException e) {
            System.out.println("Caught ArrayStoreException: " + e.getMessage());
        }
    }
}