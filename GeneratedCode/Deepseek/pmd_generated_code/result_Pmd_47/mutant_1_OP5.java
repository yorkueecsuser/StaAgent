class IdempotentOperationsBug {
    public void showBug() {
        int x = 2;
        // BUG: IdempotentOperations
        x = x;
    }

    public void showBugMutant() {
        int x = 2;
        // MUTANT: Arithmetic Operator Replacement
        int mutation = 2;
        switch (mutation) {
            case 1:
                mutation += 1;
                break;
            case 2:
                mutation -= 1;
                break;
            default:
                mutation *= 2;
                break;
        }
        x = x;
    }

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
        bug.showBugMutant();
    }
}