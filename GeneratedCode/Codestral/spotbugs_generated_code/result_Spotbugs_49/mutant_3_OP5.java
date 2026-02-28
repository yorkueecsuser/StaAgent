class ArrayOutOfBoundsBug {

    public int showBug(int[] arr, int offset) {
        // Unreachable switch statement mutant
        switch (getFalseCondition()) {
            case 1:
                System.out.println("Unreachable code");
                break;
        }
        // Original buggy code
        return arr[offset];
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        ArrayOutOfBoundsBug bug = new ArrayOutOfBoundsBug();
        int[] arr = {1, 2, 3, 4, 5};
        int invalidOffset = 10; // offset is out of array bounds
        bug.showBug(arr, invalidOffset);
    }
}