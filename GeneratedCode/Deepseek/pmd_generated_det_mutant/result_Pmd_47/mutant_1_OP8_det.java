class IdempotentOperationsBug {
    public void showBug() {
        int lyqjzoma = 2;
        // BUG: IdempotentOperations
        lyqjzoma = lyqjzoma;
    }

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
    }
}