class BugExample {

    public boolean showBug() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        String variable1 = "abcd1234"; // Mutation operator: Dead Store
        boolean areEqual = array1 == array2; // BUG: ArrayEquals
        return areEqual;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println("The arrays are equal: " + bugExample.showBug());
    }
}