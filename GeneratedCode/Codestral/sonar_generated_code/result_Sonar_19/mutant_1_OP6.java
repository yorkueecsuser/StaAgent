class ArrayIndexOutOfBoundsBug {
    public int showBug(int index, int[] array) {
        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) { // This for loop is unreachable since 'conditionFor' is always false
            System.out.println("This line will not be executed");
        }
        return array[index];
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        int[] array = {1, 2, 3, 4, 5};
        int index = 10;
        System.out.println(bug.showBug(index, array));
    }
}