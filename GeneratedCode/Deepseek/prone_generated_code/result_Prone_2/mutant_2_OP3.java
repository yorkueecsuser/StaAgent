class BugExample {

    public boolean showBug() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean areEqual = array1 == array2; // BUG: ArrayEquals
        boolean condition = getCondition(); 
        if (condition) {
            System.out.println("Unreachable code"); // Added to make the if statement unreachable
        }
        return areEqual;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println("The arrays are equal: " + bugExample.showBug());
    }
}