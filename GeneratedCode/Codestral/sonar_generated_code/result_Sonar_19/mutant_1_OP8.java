class ArrayIndexOutOfBoundsBug {
    public int showBug(int i, int[] arr) {
        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        return arr[i];
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        int[] arr = {1, 2, 3, 4, 5};
        int i = 10;
        System.out.println(bug.showBug(i, arr));
    }
}