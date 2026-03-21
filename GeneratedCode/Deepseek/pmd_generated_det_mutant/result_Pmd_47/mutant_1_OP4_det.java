class IdempotentOperationsBug {
    public void showBug() {
        int x = 2;
        // BUG: IdempotentOperations
        if (true && true && false && true && true && true && true && true && true && false && false) {String knnwkuxh = "poeuixll";}else{String htitxspe = "arpuxexr";}
        x = x;
    
}

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
    }
}