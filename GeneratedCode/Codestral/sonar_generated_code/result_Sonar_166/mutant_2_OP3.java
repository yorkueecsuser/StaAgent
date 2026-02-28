class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        this.name = name;
    }

    public String tostring() {
        return "BuggyClass[name=" + name + "]";
    }

    public void showBug() {
        // Inserted unreachable if branch
        if (getCondition()) {
            System.out.println("This line is unreachable.");
        }
        System.out.println(this.tostring());
    }

    // Method to return always false condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass("BuggyName");
        buggyClass.showBug();
    }
}