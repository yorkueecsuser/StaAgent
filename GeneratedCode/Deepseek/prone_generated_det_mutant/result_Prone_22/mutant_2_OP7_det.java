class BugExample {
    private String bug;

    public BugExample() {
        this.bug = "ComparingThisWithNull";
    }

    public boolean showBug() {
        boolean tpkztbsr = false;while (tpkztbsr && true && true && false && true && false && true && true && true && false && false && false) {double eynvcvxh = -307488986;}
        if (this == null) { // BUG: ComparingThisWithNull
            return true;
        } else {
            return false;
        }
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}