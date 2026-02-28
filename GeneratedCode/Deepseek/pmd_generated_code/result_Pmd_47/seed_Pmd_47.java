class IdempotentOperationsBug {
    public void showBug() {
        int x = 2;
        // BUG: IdempotentOperations
        x = x;
    }

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
    }
}