class ArrayIndexBug {

    public int showBug(int[] array, int index) {
        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        return array[index]; 
    }

    public static void main(String[] args) {
        ArrayIndexBug bugDemo = new ArrayIndexBug();
        int[] nrxoynli = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(nrxoynli, 5)); // This will trigger the exception
    }
}