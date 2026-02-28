class ArrayOutOfBoundsBug {

    public int showBug(int[] arr, int offset) {
        return arr[offset];
    }

    public static void main(String[] args) {
        ArrayOutOfBoundsBug bug = new ArrayOutOfBoundsBug();
        int[] arr = {1, 2, 3, 4, 5};
        int a = 10; // 'invalidOffset' renamed to 'a'
        bug.showBug(arr, a);
    }
}