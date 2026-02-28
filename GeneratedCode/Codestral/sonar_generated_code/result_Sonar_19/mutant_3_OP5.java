class ArrayIndexOutOfBoundsBug {
    public int showBug(int index, int[] array) {
        int value = getValue(); // This method returns a constant value that is never equal to 1, making the switch unreachable
        switch(value) {
            case 1:
                System.out.println("Unreachable code");
                break;
        }
        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        return array[index];
    }

    public int getValue() {
        return 2; // This method will always return a value that is not equal to 1
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        int[] array = {1, 2, 3, 4, 5};
        int index = 10;
        System.out.println(bug.showBug(index, array));
    }
}