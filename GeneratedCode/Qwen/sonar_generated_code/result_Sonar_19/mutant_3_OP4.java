class ArrayIndexBug {

    public int showBug(int[] array, int index) {
        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) {
            // Unreachable code block
            System.out.println("This is an unreachable if block.");
        } else {
            // Unreachable else block
            System.out.println("This is an unreachable else block.");
        }
        return array[index]; 
    }

    private boolean getCondition() {
        // This method returns a condition that is always false, making the if-else block unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayIndexBug bugDemo = new ArrayIndexBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray, 5)); // This will trigger the exception
    }
}