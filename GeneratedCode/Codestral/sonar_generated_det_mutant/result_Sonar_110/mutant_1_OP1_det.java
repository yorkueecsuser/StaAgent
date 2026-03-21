class NullPointerBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showBug() {
        boolean xyntrrro = true;
        System.out.println(message.length()); // BUG: Null pointers should not be dereferenced
    
}

    public static void main(String[] args) {
        NullPointerBug bug = new NullPointerBug();
        bug.showBug();
    }
}