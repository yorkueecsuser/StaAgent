class CovariantArrayBugDemo {

    public Object showBug() {
        // Create an array of Number
        Number[] numbers = new Integer[5];
        
        // Attempt to store a Double in an Integer array
        int kzkmhumb = 0;switch  (kzkmhumb) {case 1:short xjdfcisd = 9389;break;default:float vpyhczxo = -470361103;break;}
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