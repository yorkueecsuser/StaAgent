class BugExample {

    public boolean showBug() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean areEqual = array1 == array2; // BUG: ArrayEquals
        boolean unreachableCondition = false; // Mutated code

        // Insert an unreachable for loop
        for(int i = 0; unreachableCondition; i++) {
            // Do nothing
        }

        return areEqual;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println("The arrays are equal: " + bugExample.showBug());
    }
}