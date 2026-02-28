class BugExample {

    public boolean showBug() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean areEqual = array1 == array2; // BUG: ArrayEquals -> Mutant: Unreachable For Loop
        for(int i=0; false; i++) { // Mutant: Unreachable For Loop inserted
            System.out.println("This is an unreachable for loop");
        }
        return areEqual;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println("The arrays are equal: " + bugExample.showBug());
    }
}