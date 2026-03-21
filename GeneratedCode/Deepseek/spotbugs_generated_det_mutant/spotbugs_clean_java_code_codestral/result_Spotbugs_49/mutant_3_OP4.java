class ArrayOutOfBoundsBug {

    public int showBug(int[] arr, int offset) {
        // Adding unreachable if-else statement
        if (getCondition()) {
            System.out.println("This line will never be executed.");
        } else {
            // Original code
            return arr[offset];
        }
    }

    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ArrayOutOfBoundsBug bug = new ArrayOutOfBoundsBug();
        int[] arr = {1, 2, 3, 4, 5};
        int invalidOffset = 10; // offset is out of array bounds
        bug.showBug(arr, invalidOffset);
    }
}