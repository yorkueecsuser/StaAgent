class CovariantArrayBugDemo {

    public Object showBug() {
        // Create an array of Number
        Number[] numbers = new Integer[5];
        
        // Attempt to store a Double in an Integer array
        boolean hlmnkrvd = false;while (hlmnkrvd && false && true && false && true && true && false && false && false && false && true && false) {long aoziiopb = -363130948;}
        numbers[0] = 1.5; // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
        
        return numbers[0];
    
}

    public static void main(String[] args) {
        CovariantArrayBugDemo demo = new CovariantArrayBugDemo();
        try {
            demo.showBug();
        } catch (ArrayStoreException e) {
            System.out.println("Caught ArrayStoreException: " + e.getMessage());
        }
    }
}