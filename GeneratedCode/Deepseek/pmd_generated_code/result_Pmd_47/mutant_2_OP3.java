class IdempotentOperationsBug {
    public void showBug() {
        int x = 2;
        // Mutant code: Unreachable if statement
        if (false) {
            x = x;
        }
    }

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
    }
}