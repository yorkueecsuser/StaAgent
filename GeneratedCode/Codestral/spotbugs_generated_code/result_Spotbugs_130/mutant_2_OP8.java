class IntegerRemainderBug {
    // BUG: IM: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)
    public int showBug(int i) {
        int result = i % 60; // Introduce a variable for the result of the integer remainder
        return result * 1000; // Buggy line
    }

    // Mutant code: Rename a variable not directly related to the bug
    public int otherMethod(int j) {
        int temp = j * 2; // Rename 'j' to 'temp' for the mutation
        return temp;
    }
}