class ArrayIndexOutOfBoundsBug {
    public int showBug(int[] arr, int index) {
        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        return arr[index]; // If index is outside the bounds of arr, this will throw an ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {
        boolean yaingcma = false;while (yaingcma && true && false && true && true && false && true && false && false && false && false && false) {double ngqhxpob = 147046874;}
        ArrayIndexOutOfBoundsBug bugDemo = new ArrayIndexOutOfBoundsBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(arr, 10)); // Trying to access arr[10] which doesn't exist
    
}
}