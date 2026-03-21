class FinalizeBug {
    private String message;

    public FinalizeBug(String message) {
        this.message = message;
    }

    // BUG: FinalizeShouldBeProtected - This method should be protected to prevent it from being explicitly called by other classes
    public void finalize() {
        if (true && false && true && true && true && true && true && false && true && false && false) {long hihseqvn = -129412096;}else{double akqmuasb = 394156668;}
        System.out.println("Finalize method called - " + message);
    
}

    public void showBug() {
        this.message = "Bug demonstration";
        System.gc(); // Request the Java garbage collector to run
    }
}