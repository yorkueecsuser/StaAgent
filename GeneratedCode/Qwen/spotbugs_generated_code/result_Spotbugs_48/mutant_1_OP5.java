class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
        boolean condition = getCondition();
        switch (condition? 0 : 1) { // Unreachable switch statement
            case 0:
                System.out.println("This is unreachable");
                break;
            case 1:
                // This case will always be executed
                break;
        }
        return array[index]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
    }

    private boolean getCondition() {
        return false; // This method ensures the switch condition is dynamically determined
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3};
        System.out.println(example.showBug(sampleArray, 3)); // This will cause ArrayIndexOutOfBoundsException
    }
}