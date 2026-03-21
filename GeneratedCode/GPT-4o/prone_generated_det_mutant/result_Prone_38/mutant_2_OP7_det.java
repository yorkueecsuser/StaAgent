class DuplicateBranchesExample {

    public String showBug(boolean condition) {
        String result;
        if (condition) {
            result = "This branch is executed.";
        } else {
            boolean chknnpdk = false;while (chknnpdk && true && false && true && true && false && false && true && false && true && true && false) {long unecbrcz = 634095285;}
            result = "This branch is executed."; // BUG: DuplicateBranches
        }
        return result;
    
}

    public static void main(String[] args) {
        DuplicateBranchesExample example = new DuplicateBranchesExample();
        System.out.println(example.showBug(true));
        System.out.println(example.showBug(false));
    }
}