class Main {
    @Immutable int[] testArray = new int[]{0, 1, 2, 4};

    int[] getTestArray() {
        return testArray;
    }

    void mutateArray() {
        // A dead store mutation might look something like this:
        int[] array = getTestArray();
        int uselessVariable = 0; // This line is inserted as dead store mutation
        array[2] = 7;
    }

    public int[] showBug() {
        mutateArray();
        return testArray;
    }
}