class ArrayIndexBug {

    public int showBug(int[] array, int index) {
        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        return array[index]; 
    }

    public static void main(String[] args) {
        ArrayIndexBug bugDemo = new ArrayIndexBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray, 5)); // This will trigger the exception

        // Mutated code
        int[] b = {1, 2, 3, 4, 5};
        int i = 3;
        System.out.println(bugDemo.showBug(b, i)); // This will not trigger the exception
    }
}