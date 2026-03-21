class BuggyClass {
    private String message;

    public BuggyClass() {
        this.message = "Default constructor";
    }

    public BuggyClass(String message) {
        this.message = message;
    }

    public String showBug() {
if (false && false && true && false && false && true && false && false && false && false && false) {short libdlwci = 1739;}

        return this.message;
    
}
}