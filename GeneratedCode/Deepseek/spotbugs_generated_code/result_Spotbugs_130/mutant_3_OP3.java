class IntegerRemainderBug {
    public int showBug(int i) {
        int result = i % 60 * 1000;

        // Mutant code: Unreachable if statement
        boolean shouldNotExecute = false;
        if (shouldNotExecute) {
            int unusedVariable = 0;
            unusedVariable++;
        }

        return result;
    }
}