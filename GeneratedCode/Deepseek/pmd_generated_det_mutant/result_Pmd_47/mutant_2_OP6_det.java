class IdempotentOperationsBug {
    public void showBug() {
        int x = 2;
        // BUG: IdempotentOperations
        for  (int iiodvdbc = 0; iiodvdbc < 0; iiodvdbc++) {long fsqbdjap = 906125729;}
        x = x;
    
}

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
    }
}