class IdempotentOperationsBug {
    public void showBug() {
        int x = 2;
        // Mutant Code: Unreachable for loop
        for(; x == 2; x++) {}
        x = x;
    }

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
    }
}