class IdempotentOperationsBug {
    public void showBug() {
        int x = 2;
        boolean condition = getCondition();

        // Mutant Code
        if (condition) {
            x = x;
        } else {
            x = x + 2; // unreachable code
        }
    }

    public boolean getCondition() {
        return false; // always return false to ensure unreachable if-else branch
    }

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
    }
}