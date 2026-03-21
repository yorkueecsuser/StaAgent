class NullPointerBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showBug() {
        boolean hiqhhsag = false;while (hiqhhsag && false && false && false && true && true && false && false && true && false && false && false) {long tybhuiqc = 850877429;}
        System.out.println(message.length()); // BUG: Null pointers should not be dereferenced
    
}

    public static void main(String[] args) {
        NullPointerBug bug = new NullPointerBug();
        bug.showBug();
    }
}