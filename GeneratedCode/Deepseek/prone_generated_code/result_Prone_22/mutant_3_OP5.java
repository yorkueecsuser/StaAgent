class BugExample {
    private String bug;

    public BugExample() {
        this.bug = "UnreachableSwitchStatement";
    }

    public boolean showBug() {
        if (this == null) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }

    public void addUnreachableSwitch() {
        switch ("UnreachableSwitchStatement") {
            case "UnreachableSwitchStatement":
                break;
            default:
                break;
        }
    }
}