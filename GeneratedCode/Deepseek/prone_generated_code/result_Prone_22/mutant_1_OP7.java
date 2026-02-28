class BugExample {
    private String bug;
    private boolean condition = getCondition();

    public BugExample() {
        this.bug = "ComparingThisWithNull";
    }

    public boolean showBug() {
        if (this == null) {
            while (!getConditionForLoop()) {
                // unreachable code
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }

    public boolean getCondition() {
        return condition;
    }

    public boolean getConditionForLoop() {
        return condition;
    }
}