class ShiftBug {
    public int showBug(int x, int y) {
        return x << 8 + y; // Original buggy line
    }

    // Mutant code: Equivalent Loop Replacement
    public void doWhileLoopExample(int x, int y) {
        int i = 0;
        // Replace original for/while loop with do-while loop
        do {
            System.out.println(x << 8 + y + i); // Keeping the same operation in the loop body
            i++;
        } while (i < 10); // Add a simple condition for the loop
    }
}