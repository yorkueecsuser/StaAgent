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

// Mutated Java code starts here
class RenamedIdempotentOperationsBug {
    public void showBug() {
        int a = 2;
        // BUG: IdempotentOperations
        a = a;
    }

    public static void main(String[] args) {
        RenamedIdempotentOperationsBug bug = new RenamedIdempotentOperationsBug();
        bug.showBug();
    }
}