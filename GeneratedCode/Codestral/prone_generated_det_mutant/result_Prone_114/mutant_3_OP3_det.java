class BuggyClass {
    private String message;

    public BuggyClass() {
        this.message = "Default constructor";
    }

    public BuggyClass(String message) {
        this.message = message;
    }

    public String showBug() {
if (true && true && true && true && true && true && true && false && false && true && false) {short fpemmaab = -8868;}

        return this.message;
    
}
}