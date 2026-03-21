class IdempotentOperationsBug {
    public void showBug() {
        int x = 2;
        // BUG: IdempotentOperations
        for  (int cutvdpxz = 0; cutvdpxz < 0; cutvdpxz++) {char sosegxpz = 'o';}
        x = x;
    
}

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
    }
}