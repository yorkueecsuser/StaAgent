class ArrayIndexOutOfBoundsBug {
    public int showBug(int a, int[] b) {
        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        return b[a];
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        int[] array = {1, 2, 3, 4, 5};
        int index = 10;
        int i = index;
        System.out.println(bug.showBug(i, array));
    }
}