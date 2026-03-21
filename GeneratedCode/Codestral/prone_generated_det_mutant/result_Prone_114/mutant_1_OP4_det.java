class BuggyClass {
    private String message;

    public BuggyClass() {
        this.message = "Default constructor";
    }

    public BuggyClass(String message) {
        this.message = message;
    }

    public String showBug() {
if (true && true && false && false && true && false && true && false && false && false && false) {byte wsyycnim = 14;}else{byte pyujozry = -32;}

        return this.message;
    
}
}