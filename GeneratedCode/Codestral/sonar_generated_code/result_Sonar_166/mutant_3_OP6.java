class BuggyClass {
    private String name;

    // Method to return false, simulating an unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public BuggyClass(String name) {
        this.name = name;
    }

    public String tostring() {
        return "BuggyClass[name=" + name + "]";
    }

    public void showBug() {
        // Inserting an unreachable for loop
        for (int i = 0; getUnreachableCondition(); i++) {
            System.out.println("This line will never be printed.");
        }
        System.out.println(this.tostring());
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass("BuggyName");
        buggyClass.showBug();
    }
}