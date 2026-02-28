class IdempotentOperationsBug {
    public void showBug() {
        int x = 2;
        // Original bug
        x = x;
        // Mutated code
        x = x;
    }

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
    }
}