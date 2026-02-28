class AvoidUsingOctalValuesBug {
    private boolean getCondition() {
        return false;  // Always returns false to make the if-else branch unreachable
    }

    public int showBug() {
        int i = 012;
        int j = 010;

        if (getCondition()) {
            // Unreachable code
            int k = 100;  // This line will never be executed
            i = k;
        } else {
            // Original code
        }

        return i * j;
    }
}