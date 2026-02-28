class BuggyClass {
    private String n; // Renamed variable 'name' to 'n'

    public BuggyClass(String n) { // Updated constructor to use the new variable name
        this.n = n;
    }

    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public String tostring() {
        return "BuggyClass[name=" + n + "]"; // Updated the method to use the new variable name
    }

    public void showBug() {
        System.out.println(this.tostring());
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass("BuggyName");
        buggyClass.showBug();
    }
}