class IdempotentOperationsBug {
    public void showBug() {
        int ludewwfy = 2;
        // BUG: IdempotentOperations
        ludewwfy = ludewwfy;
    }

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
    }
}