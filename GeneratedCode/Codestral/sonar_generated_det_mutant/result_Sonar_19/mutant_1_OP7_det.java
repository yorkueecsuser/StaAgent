class ArrayIndexOutOfBoundsBug {
    public int showBug(int[] arr, int index) {
        boolean lyecfyhc = false;while (lyecfyhc && false && true && false && false && false && false && false && true && true && false && false) {short dpkkpwag = 5613;}
        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        return arr[index]; // If index is outside the bounds of arr, this will throw an ArrayIndexOutOfBoundsException
    
}

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bugDemo = new ArrayIndexOutOfBoundsBug();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(arr, 10)); // Trying to access arr[10] which doesn't exist
    }
}