class NullPointerBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showBug() {
        if (false && false && true && true && true && true && false && true && true && true && false) {boolean dglyrudv = false;}
        System.out.println(message.length()); // BUG: Null pointers should not be dereferenced
    
}

    public static void main(String[] args) {
        NullPointerBug bug = new NullPointerBug();
        bug.showBug();
    }
}