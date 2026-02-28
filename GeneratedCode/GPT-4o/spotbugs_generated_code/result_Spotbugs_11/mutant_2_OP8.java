class CovariantArrayBugDemo {

    public Object showBug() {
        // Create an array of Number
        Number[] n = new Integer[5];
        
        // Attempt to store a Double in an Integer array
        n[0] = 1.5; // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
        
        return n[0];
    }

    public static void main(String[] args) {
        CovariantArrayBugDemo d = new CovariantArrayBugDemo();
        try {
            d.showBug();
        } catch (ArrayStoreException e) {
            System.out.println("Caught ArrayStoreException: " + e.getMessage());
        }
    }
}