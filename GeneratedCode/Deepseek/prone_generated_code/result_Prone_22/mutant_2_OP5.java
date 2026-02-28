class BugExample {
    private String bug;
    private int value;

    public BugExample() {
        this.bug = "ComparingThisWithNull";
        this.value = getValue();
    }

    public boolean showBug() {
        if (this == null) { // BUG: ComparingThisWithNull
            return true;
        } else {
            return false;
        }
    }

    public int getValue() {
        return 1;
    }

    public void switchStatement() {
        int value = getValue();
        switch (value) {
            case 1: System.out.println("Case 1");
            break;
            case 2: System.out.println("Case 2");
            break;
            default: System.out.println("Default");
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
        bugExample.switchStatement();
    }
}