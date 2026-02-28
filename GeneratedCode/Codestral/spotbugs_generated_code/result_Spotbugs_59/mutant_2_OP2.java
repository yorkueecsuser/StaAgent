class NullPointerDereferenceBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showBug() {
        // The original bug is here
        System.out.println(message.toUpperCase());

        // Mutant code: Duplication of the assignment statement
        String mutantMessage = message;

        // This will not trigger the original bug, but it can cause a new NullPointerException if mutantMessage is null
        System.out.println(mutantMessage.toUpperCase());
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bug = new NullPointerDereferenceBug();
        bug.showBug();
    }
}