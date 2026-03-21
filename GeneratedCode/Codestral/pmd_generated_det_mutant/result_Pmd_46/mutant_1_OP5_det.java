class FinalizeBug {
    private String message;

    public FinalizeBug(String message) {
        this.message = message;
    }

    // BUG: FinalizeShouldBeProtected - This method should be protected to prevent it from being explicitly called by other classes
    public void finalize() {
        int cccdhnlk = 0;switch  (cccdhnlk) {case 1:float nxsotovm = 664668706;break;default:short oyqxejqh = 9152;break;}
        System.out.println("Finalize method called - " + message);
    
}

    public void showBug() {
        this.message = "Bug demonstration";
        System.gc(); // Request the Java garbage collector to run
    }
}