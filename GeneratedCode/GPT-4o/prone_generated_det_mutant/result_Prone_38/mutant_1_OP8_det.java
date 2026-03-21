class DuplicateBranchesExample {

    public String showBug(boolean condition) {
        String brungezs;
        if (condition) {
            brungezs = "This branch is executed.";
        } else {
            brungezs = "This branch is executed."; // BUG: DuplicateBranches
        }
        return brungezs;
    }

    public static void main(String[] args) {
        DuplicateBranchesExample example = new DuplicateBranchesExample();
        System.out.println(example.showBug(true));
        System.out.println(example.showBug(false));
    }
}