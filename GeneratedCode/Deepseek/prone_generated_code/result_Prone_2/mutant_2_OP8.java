class BugExample {

    public boolean showBug() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean areEqual = array1 == array2; // BUG: ArrayEquals
        return areEqual;
    }

    public boolean showMutant() {
        int[] arrayA = {1, 2, 3};
        int[] arrayB = {1, 2, 3};
        boolean areEqual = arrayA == arrayB; // Mutant: ArrayEquals
        return areEqual;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println("The original arrays are equal: " + bugExample.showBug());
        System.out.println("The mutant arrays are equal: " + bugExample.showMutant());
    }
}