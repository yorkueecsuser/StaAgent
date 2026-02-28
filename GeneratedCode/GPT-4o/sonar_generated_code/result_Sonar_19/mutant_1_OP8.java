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

// Mutant code with variable renaming
class ArrayIndexOutOfBoundsExampleMutant {

    public int showBug(int[] a, int i) { // Renamed 'array' to 'a' and 'index' to 'i'
        // Accessing the array element without checking if the index is within bounds
        return a[i]; // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExampleMutant example = new ArrayIndexOutOfBoundsExampleMutant();
        int[] sa = {1, 2, 3, 4, 5}; // Renamed 'sampleArray' to 'sa'
        int res = example.showBug(sa, 5); // Renamed 'result' to 'res'
        System.out.println("Accessed element: " + res);
    }
}