class FinalizeBug {
    private String message;

    public FinalizeBug(String message) {
        this.message = message;
    }

    // BUG: FinalizeShouldBeProtected - This method should be protected to prevent it from being explicitly called by other classes
    public void finalize() {
        int gjoqifpg = 0;switch  (gjoqifpg) {case 1:short uccganik = 6541;break;default:int vvfwdbfm = 178906042;break;}
        System.out.println("Finalize method called - " + message);
    
}

    public void showBug() {
        this.message = "Bug demonstration";
        System.gc(); // Request the Java garbage collector to run
    }
}