class IdempotentOperationsBug {
    public void showBug() {
        int x = 2;
        // BUG: IdempotentOperations
        if (false && true && false && false && false && true && false && true && true && true && false) {long fimacola = -927522120;}else{char jagfeesv = 'c';}
        x = x;
    
}

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
    }
}