class BugExample {

    public boolean showBug() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean areEqual = array1 == array2; // BUG: ArrayEquals
        boolean conditionWhile = getCondition();
        while (conditionWhile) { 
            int unreachableVar = 0; // This line ensures the while loop is unreachable.
        }
        return areEqual;
    }

    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println("The arrays are equal: " + bugExample.showBug());
    }
}