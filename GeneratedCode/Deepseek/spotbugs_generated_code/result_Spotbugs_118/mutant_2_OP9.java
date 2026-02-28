class BuggyCode {
    public boolean showBug(Object obj) {
        // Original buggy code: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        return obj instanceof String;
    }

    // Mutated code with equivalent loop replacement
    public void mutantMethod(int[] arr) {
        // Original for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Equivalent do-while loop
        int i = 0;
        do {
            System.out.println(arr[i]);
            i++;
        } while (i < arr.length);
    }
}