class BugExample {
    private String bug;

    public BugExample() {
        this.bug = "ComparingThisWithNull";
    }

    public boolean showBug() {
        if (this == null) { // BUG: ComparingThisWithNull
            return true;
        } else {
            return false;
        }
    }

    public boolean showMutantBug() {
       if (this == null) { // Mutant: UnreachableIfElse
           return true;
       } else {
           return false;
       }
       if (false) { // Unreachable branch
           return true;
       } else {
           return false;
       }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showMutantBug());
    }
}