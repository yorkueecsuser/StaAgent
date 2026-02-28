class BuggyClass {
    private String message;

    public BuggyClass() {
        this.message = "Default constructor";
    }

    public BuggyClass(String message) {
        this.message = message;
    }

    public String showBug() {
        return this.message;
    }
}