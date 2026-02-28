class ArrayIndexBug {

    public int showBug(int[] array, int index) {
        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is reachable if shouldRun is true
            System.out.println("This is a reachable block.");
        } else {
            // This block is unreachable because shouldRun is always false
            System.out.println("This is an unreachable block.");
        }
        return array[index]; 
    }

    private boolean getCondition() {
        // This method returns false, making the else block unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayIndexBug bugDemo = new ArrayIndexBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray, 5)); // This will trigger the exception
    }
}