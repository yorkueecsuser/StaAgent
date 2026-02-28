class IdempotentOperationsBug {
    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        int x = 2;
        // BUG: IdempotentOperations
        x = x;

        // Mutation: Unreachable for loop
        for (int i = 0; getCondition(); i++) {
            System.out.println("This loop is unreachable");
        }
    }

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
    }
}