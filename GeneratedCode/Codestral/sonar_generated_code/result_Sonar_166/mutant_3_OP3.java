class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        this.name = name;
    }

    public String tostring() {
        return "BuggyClass[name=" + name + "]";
    }

    public boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        if (getUnreachableCondition()) {
            System.out.println("This line should be unreachable.");
        }
        System.out.println(this.tostring());
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass("BuggyName");
        buggyClass.showBug();
    }
}