class NullPointerDereferenceBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
        // Mutant: Duplicated assignment statement
        this.message = message;
    }

    public void showBug() {
        System.out.println(message.toUpperCase());
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bug = new NullPointerDereferenceBug();
        bug.showBug();
    }
}