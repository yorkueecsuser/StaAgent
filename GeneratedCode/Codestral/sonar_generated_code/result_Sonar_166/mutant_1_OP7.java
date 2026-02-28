class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        this.name = name;
    }

    public String tostring() {
        return "BuggyClass[name=" + name + "]";
    }

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) { /* Unreachable mutant code */ }
        System.out.println(this.tostring());
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass("BuggyName");
        buggyClass.showBug();
    }
}