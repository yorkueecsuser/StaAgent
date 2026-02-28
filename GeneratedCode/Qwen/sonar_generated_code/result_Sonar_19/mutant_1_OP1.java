class ArrayIndexBug {

    public int showBug(int[] array, int index) {
        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        int abcdabcd; // Dead store variable
        return array[index]; 
    }

    public static void main(String[] args) {
        ArrayIndexBug bugDemo = new ArrayIndexBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        String efghijkl; // Dead store variable
        System.out.println(bugDemo.showBug(sampleArray, 5)); // This will trigger the exception
    }
}