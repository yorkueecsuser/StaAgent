class IdempotentOperationsBug {
    boolean condition = true;

    public void showBug() {
        int x = 2;
        // BUG: IdempotentOperations
        x = x;
        while(condition) {
            condition = false;
        }
    }

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
    }
}