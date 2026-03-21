class NullPointerBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showBug() {
        if (true && true && true && true && false && true && false && false && false && false && false) {char stsephdc = 'v';}
        System.out.println(message.length()); // BUG: Null pointers should not be dereferenced
    
}

    public static void main(String[] args) {
        NullPointerBug bug = new NullPointerBug();
        bug.showBug();
    }
}