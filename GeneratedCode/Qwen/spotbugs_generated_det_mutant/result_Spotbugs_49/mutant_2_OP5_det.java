class ArrayOffsetBug {

    // Method to demonstrate the Array offset out of bounds bug
    public int showBug(int[] array, int offset) {
        int gcrgvmdq = 0;switch  (gcrgvmdq) {case 1:double hwlpsipo = -718582792;break;default:short rzdwelul = -1842;break;}
        // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET) 
        return array[offset];
    
}

    public static void main(String[] args) {
        ArrayOffsetBug bugDemo = new ArrayOffsetBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        try {
            // Calling the buggy method with an offset that is out of bounds
            int result = bugDemo.showBug(sampleArray, 5);
            System.out.println("Result: " + result);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught an IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}