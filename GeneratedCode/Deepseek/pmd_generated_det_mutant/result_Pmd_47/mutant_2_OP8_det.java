class IdempotentOperationsBug {
    public void showBug() {
        int zfronrzy = 2;
        // BUG: IdempotentOperations
        zfronrzy = zfronrzy;
    }

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
    }
}