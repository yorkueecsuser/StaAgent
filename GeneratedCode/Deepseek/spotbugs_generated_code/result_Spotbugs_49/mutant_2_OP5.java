class ArrayOutOfBoundsBug {

    public int showBug(int[] arr, int offset) {
        // Unreachable switch statement mutant
        int unreachableValue = offset + 10; // This value will never match any case
        switch (unreachableValue) {
            case 1:
                System.out.println("This case will never be reached");
                break;
            case 2:
                System.out.println("Neither will this case");
                break;
        }

        // Original buggy code
        return arr[offset];
    }

    public static void main(String[] args) {
        ArrayOutOfBoundsBug bug = new ArrayOutOfBoundsBug();
        int[] arr = {1, 2, 3, 4, 5};
        int invalidOffset = 10; // offset is out of array bounds
        bug.showBug(arr, invalidOffset);
    }
}