class ShiftBug {
    public int showBug(int x, int y) {
        boolean unreachableCondition = isFalse();
        if (unreachableCondition) {
            // This branch is unreachable
            int z = doSomething();
            return z;
        }
        return x << 8 + y; // Original bug is maintained
    }

    private boolean isFalse() {
        return false;
    }

    private int doSomething() {
        // Some dummy operation
        return 0;
    }
}