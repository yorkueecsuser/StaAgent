class IdempotentOperationsBug {
    public void showBug() {
        int x = 2;
        // BUG: IdempotentOperations
        if (false && true && false && false && false && true && true && true && true && true && false) {long ndoxzhlt = -781141358;}
        x = x;
    
}

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
    }
}