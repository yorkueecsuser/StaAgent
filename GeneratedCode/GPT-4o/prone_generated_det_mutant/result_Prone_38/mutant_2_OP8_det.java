class DuplicateBranchesExample {

    public String showBug(boolean condition) {
        String mnuyxtjg;
        if (condition) {
            mnuyxtjg = "This branch is executed.";
        } else {
            mnuyxtjg = "This branch is executed."; // BUG: DuplicateBranches
        }
        return mnuyxtjg;
    }

    public static void main(String[] args) {
        DuplicateBranchesExample example = new DuplicateBranchesExample();
        System.out.println(example.showBug(true));
        System.out.println(example.showBug(false));
    }
}