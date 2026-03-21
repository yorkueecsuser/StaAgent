class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        for (float i = 0.0f; i < limit; i += 0.1f) {
            sum++;
        }

        // Mutant: Unreachable for loop
        boolean unreachableCondition = false;
        for (int j = 0; unreachableCondition; j++) {
            System.out.println("This line should never execute.");
        }

        return sum;
    }
}