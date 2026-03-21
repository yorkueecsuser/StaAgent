class ArrayOutOfBoundsBug {

    private boolean getCondition() {
        return false; // This method always returns false
    }

    public int showBug(int[] arr, int offset) {
        // Inserting unreachable switch statement
        if (getCondition()) {
            switch(offset) {
                case 100:
                    System.out.println("Unreachable code");
                    break;
            }
        }

        // Original bug
        return arr[offset];
    }

    public static void main(String[] args) {
        ArrayOutOfBoundsBug bug = new ArrayOutOfBoundsBug();
        int[] arr = {1, 2, 3, 4, 5};
        int invalidOffset = 10; // offset is out of array bounds
        bug.showBug(arr, invalidOffset);
    }
}