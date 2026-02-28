class BugExample {
    private String bug;

    public BugExample() {
        this.bug = "UnreachableSwitchStatement";
    }

    public boolean showBug() {
        int value = getValue();
        switch (value) {
            case 1:
                return false;
            default:
                break;
        }

        if (this == null) { // BUG: ComparingThisWithNull
            return true;
        } else {
            return false;
        }
    }

    private int getValue() {
        return 1;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}