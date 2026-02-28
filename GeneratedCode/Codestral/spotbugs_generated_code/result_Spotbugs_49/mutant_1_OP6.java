class ArrayOutOfBoundsBug {

    public int showBug(int[] arr, int offset) {
        // Added unreachable for loop
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            System.out.println("This loop should never execute");
        }

        // Original code with bug
        return arr[offset];
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ArrayOutOfBoundsBug bug = new ArrayOutOfBoundsBug();
        int[] arr = {1, 2, 3, 4, 5};
        int invalidOffset = 10; // offset is out of array bounds
        bug.showBug(arr, invalidOffset);
    }
}