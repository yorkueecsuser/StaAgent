class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        this.name = name;
    }

    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public String tostring() {
        return "BuggyClass[name=" + name + "]";
    }

    public void showBug() {
        String deadvar = "Unused variable";  // Mutant - Dead Store
        System.out.println(this.tostring()); // This will not be printed as expected.
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass("BuggyName");
        buggyClass.showBug();
    }
}