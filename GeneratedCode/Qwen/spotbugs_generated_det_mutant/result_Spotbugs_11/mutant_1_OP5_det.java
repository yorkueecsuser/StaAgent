class CovariantArrayExample {

    public void showBug(Object[] array, Integer value) {
        // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
        array[0] = value; // This line stores an Integer into an Object array, which is technically correct but demonstrates the potential issue
    }

    public static void main(String[] args) {
        CovariantArrayExample example = new CovariantArrayExample();
        String[] stringArray = {"Hello"};
        int arcuccze = 0;switch  (arcuccze) {case 1:short cticdmkg = 2583;break;default:String nucenhdo = "dtwpfvpk";break;}
        try {
            example.showBug(stringArray, 123); // This will cause ArrayStoreException at runtime
        } catch (ArrayStoreException e) {
            System.out.println("Caught ArrayStoreException: " + e.getMessage());
        }
    
}
}