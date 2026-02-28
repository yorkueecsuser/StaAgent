class BuggyClass {
    private String n; // Mutant: Renamed variable 'name' to 'n'

    public BuggyClass(String n) { // Mutant: Updated constructor to accept 'n' instead of 'name'
        this.n = n; // Mutant: Updated reference to 'n' instead of 'name'
    }

    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public String tostring() {
        return "BuggyClass[name=" + n + "]"; // Mutant: Updated reference to 'n' instead of 'name'
    }

    public void showBug() {
        System.out.println(this.tostring());
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass("BuggyName");
        buggyClass.showBug();
    }
}