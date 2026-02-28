class NullPointerDereferenceBug {
    private String message;
    private String renamedMessage; // Added a new variable

    public void setMessage(String message) {
        this.message = message;
        this.renamedMessage = message; // Renamed this variable to demonstrate the mutation operator
    }

    public void showBug() {
        System.out.println(renamedMessage.toUpperCase()); // Using the renamed variable
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bug = new NullPointerDereferenceBug();
        bug.showBug();
    }
}