class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        this.name = name;
    }

    public String tostring() {
        return "BuggyClass[name=" + name + "]";
    }

    public void showBug() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This code will never be executed.");
        } else {
            System.out.println(this.tostring());
        }
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass("BuggyName");
        buggyClass.showBug();
    }
}