class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        this.name = name;
    }

    public String tostring() {
        return "BuggyClass[name=" + name + "]";
    }

    public void showBug() {
        boolean unreachableCondition = false; // Introduced false condition for unreachable if-else statement
        if (unreachableCondition) {
            System.out.println("This line will never be printed.");
        } else {
            System.out.println(this.tostring());
        }
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass("BuggyName");
        buggyClass.showBug();
    }
}