class IdempotentOperationsBug {
    private boolean conditionWhile = false;

    public void showBug() {
        int x = 2;
        // BUG: IdempotentOperations
        x = x;
    }

    public void addMutant() {
        while (!conditionWhile) {
            System.out.println("This is an unreachable loop mutant");
        }
    }

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
        bug.addMutant();
    }
}