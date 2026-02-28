class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        this.name = name;
    }

    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public String tostring() {
        // Inserting an unreachable for loop into the basic block
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            // This code will never be executed
            System.out.println("This is an unreachable loop.");
        }
        return "BuggyClass[name=" + name + "]";
    }

    public void showBug() {
        System.out.println(this.tostring()); // This will not be printed as expected.
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass("BuggyName");
        buggyClass.showBug();
    }
}