class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        this.name = name;
    }

    public boolean getFalseCondition() {
        return false;
    }

    public String tostring() {
        boolean unreachableCondition = getFalseCondition();
        while (unreachableCondition) {
            // Unreachable code
            System.out.println("This code should never be executed.");
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