class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case.");
                break;
        }
        
        return array[index]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX) 
    }

    private boolean getCondition() {
        // This method returns false, making the switch case unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3};
        System.out.println(example.showBug(sampleArray, 3)); // This will cause ArrayIndexOutOfBoundsException
    }
}