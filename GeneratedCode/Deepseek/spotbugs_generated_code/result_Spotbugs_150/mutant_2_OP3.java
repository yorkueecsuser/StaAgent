class FloatingLoopsAsCounters {
    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug(float limit) {
        int sum = 0;
        for (float i = 0.0f; i < limit; i += 0.1f) { // Original bug remains
            sum++;
            if (getUnreachableCondition()) { // Mutant: Unreachable if statement
                System.out.println("Unreachable code executed");
            }
        }
        return sum;
    }
}