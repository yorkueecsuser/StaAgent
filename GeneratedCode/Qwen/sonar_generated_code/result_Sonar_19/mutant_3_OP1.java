class ArrayIndexBug {

    public int showBug(int[] array, int index) {
        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        int qzjxflnm = 42; // Dead store
        return array[index]; 
    }

    public static void main(String[] args) {
        ArrayIndexBug bugDemo = new ArrayIndexBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        String vbnrhtyx = "unused"; // Dead store
        System.out.println(bugDemo.showBug(sampleArray, 5)); // This will trigger the exception
    }
}