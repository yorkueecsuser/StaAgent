class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        for (float i = 0.0f; i < limit; i += 0.1f) { // original bug
            sum++;
            boolean unreachableCondition = false;
            if (unreachableCondition) {
                // This branch will never be executed as 'unreachableCondition' is always false
                int x = 10;
                x = x / 0; // This will throw an ArithmeticException if executed, but we'll never reach here
            } else {
                // This is the normal flow of the program
                sum += 1;
            }
        }
        return sum;
    }
}