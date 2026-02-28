class BugExample {

    public boolean showBug() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean shouldRun = array1.length == array2.length;
        boolean areEqual = false;
        if (shouldRun) {
            areEqual = Arrays.equals(array1, array2);
        } else {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
        return areEqual;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println("The arrays are equal: " + bugExample.showBug());
    }
}