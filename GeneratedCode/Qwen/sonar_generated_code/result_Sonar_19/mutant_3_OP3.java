class ArrayIndexBug {

    public int showBug(int[] array, int index) {
        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        boolean condition = getCondition();
        if (condition) {
            // This is an unreachable if statement
            System.out.println("This is an unreachable statement.");
        }
        return array[index]; 
    }

    private boolean getCondition() {
        // This method returns false, making the if statement unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayIndexBug bugDemo = new ArrayIndexBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray, 5)); // This will trigger the exception
    }
}