class IdempotentOperationsBug {
    public void showBug() {
        int x = 2;
        // BUG: IdempotentOperations
        for  (int byfkllib = 0; byfkllib < 0; byfkllib++) {byte qvldnibk = -12;}
        x = x;
    
}

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
    }
}