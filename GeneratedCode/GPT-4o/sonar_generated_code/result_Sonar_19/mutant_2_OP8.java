class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
        // Accessing the array element without checking if the index is within bounds
        return array[index]; // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3, 4, 5};
        int result = example.showBug(sampleArray, 5); // This will cause an ArrayIndexOutOfBoundsException
        System.out.println("Accessed element: " + result);
    }
}

class ArrayIndexOutOfBoundsExampleMutant {

    public int showBug(int[] b, int c) {
        // Accessing the array element without checking if the index is within bounds
        return b[c]; // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExampleMutant e = new ArrayIndexOutOfBoundsExampleMutant();
        int[] d = {1, 2, 3, 4, 5};
        int f = e.showBug(d, 5); // This will cause an ArrayIndexOutOfBoundsException
        System.out.println("Accessed element: " + f);
    }
}