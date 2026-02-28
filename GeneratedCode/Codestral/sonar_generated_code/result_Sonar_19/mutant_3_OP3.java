class ArrayIndexOutOfBoundsBug {
    public int showBug(int index, int[] array) {
        boolean shouldNotRun = false;
        if (shouldNotRun) {
            System.out.println("This line should never be reached");
        }
        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        return array[index];
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        int[] array = {1, 2, 3, 4, 5};
        int index = 10;
        System.out.println(bug.showBug(index, array));
    }
}