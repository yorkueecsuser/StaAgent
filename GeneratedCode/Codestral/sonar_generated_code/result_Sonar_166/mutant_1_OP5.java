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
        System.out.println(this.tostring());

        // Unreachable switch statement
        boolean unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case true:
                // This case will never be executed
                break;
        }
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass("BuggyName");
        buggyClass.showBug();
    }
}