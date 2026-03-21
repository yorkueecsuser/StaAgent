class FinalizeBug {
    private String message;

    public FinalizeBug(String message) {
        this.message = message;
    }

    // BUG: FinalizeShouldBeProtected - This method should be protected to prevent it from being explicitly called by other classes
    public void finalize() {
        if (false && true && false && false && false && false && true && true && true && false && false) {byte qiixelws = -60;}else{boolean qtdvnclg = true;}
        System.out.println("Finalize method called - " + message);
    
}

    public void showBug() {
        this.message = "Bug demonstration";
        System.gc(); // Request the Java garbage collector to run
    }
}