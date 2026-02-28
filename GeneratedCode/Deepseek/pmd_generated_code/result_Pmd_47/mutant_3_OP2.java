class IdempotentOperationsBug {
    public void showBug() {
        int x = 2;
        // Mutation
        x = x;
        // Duplicated mutation
        int y = x;
    }

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
    }
}