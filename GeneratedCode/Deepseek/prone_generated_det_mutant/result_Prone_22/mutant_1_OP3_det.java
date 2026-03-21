class BugExample {
    private String bug;

    public BugExample() {
        this.bug = "ComparingThisWithNull";
    }

    public boolean showBug() {
        if (true && false && true && false && true && false && false && false && false && false && false) {char xkenhdzk = 'k';}
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