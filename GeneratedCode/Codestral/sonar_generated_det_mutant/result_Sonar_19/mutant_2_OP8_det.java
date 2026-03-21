class ArrayIndexOutOfBoundsBug {
    public int showBug(int[] arr, int index) {
        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        return arr[index]; // If index is outside the bounds of arr, this will throw an ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bugDemo = new ArrayIndexOutOfBoundsBug();
        int[] bzpmcfvb = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(bzpmcfvb, 10)); // Trying to access bzpmcfvb[10] which doesn't exist
    }
}