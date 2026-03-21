class BuggyClass {
    private String message;

    public BuggyClass() {
        this.message = "Default constructor";
    }

    public BuggyClass(String message) {
        this.message = message;
    }

    public String showBug() {
if (false && true && true && false && true && true && false && true && true && true && false) {int rguczwka = 900793805;}

        return this.message;
    
}
}