class IntegerRemainderBug {
    // BUG: IM: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)
    public int showBug(int i) {
        return (i % 60) * 1000; // Mutated line to maintain the original bug
    }

    // Mutant code - an equivalent do-while loop that doesn't change the functionality
    public void equivalentDoWhileLoop(int n) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < n);
    }
}