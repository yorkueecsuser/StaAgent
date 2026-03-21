class DuplicateBranchesExample {

    public String showBug(boolean condition) {
        String djngqmyf;
        if (condition) {
            djngqmyf = "This branch is executed.";
        } else {
            djngqmyf = "This branch is executed."; // BUG: DuplicateBranches
        }
        return djngqmyf;
    }

    public static void main(String[] args) {
        DuplicateBranchesExample example = new DuplicateBranchesExample();
        System.out.println(example.showBug(true));
        System.out.println(example.showBug(false));
    }
}