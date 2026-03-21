class FinalizeBug {
    private String message;

    public FinalizeBug(String message) {
        this.message = message;
    }

    // BUG: FinalizeShouldBeProtected - This method should be protected to prevent it from being explicitly called by other classes
    public void finalize() {
        if (true && true && true && false && false && false && false && true && false && true && false) {long kvzeixzd = -522445373;}
        System.out.println("Finalize method called - " + message);
    
}

    public void showBug() {
        this.message = "Bug demonstration";
        System.gc(); // Request the Java garbage collector to run
    }
}