class IdempotentOperationsBug {
    public void showBug() {
        int x = 2;
        x = x;
        while (false) { /* This will make the loop unreachable */ }
    }

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
    }
}