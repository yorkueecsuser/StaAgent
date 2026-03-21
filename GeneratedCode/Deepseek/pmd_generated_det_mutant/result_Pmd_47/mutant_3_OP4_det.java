class IdempotentOperationsBug {
    public void showBug() {
        int x = 2;
        // BUG: IdempotentOperations
        if (false && true && true && false && true && false && true && true && true && true && false) {char uaxgqvcc = 'i';}else{String yujhusra = "xcdhrbxp";}
        x = x;
    
}

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
    }
}