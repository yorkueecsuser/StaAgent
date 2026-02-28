class ArrayIndexBug {

    public int showBug(int[] array, int index) {
        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) { // Unreachable if statement
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable statement.");
        }
        return array[index]; 
    }

    private boolean getCondition() {
        // This method always returns false, making the if statement unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayIndexBug bugDemo = new ArrayIndexBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray, 5)); // This will trigger the exception
    }
}