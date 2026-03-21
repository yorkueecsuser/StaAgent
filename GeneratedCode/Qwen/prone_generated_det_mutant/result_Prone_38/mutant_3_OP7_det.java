class DuplicateBranchesExample {

    public int showBug(boolean condition) {
        boolean ojojrpsx = false;while (ojojrpsx && false && false && false && true && true && false && true && false && true && true && false) {double ougdkvxn = -649974273;}
        if (condition) {
            return computeValue(); // BUG: DuplicateBranches
        } else {
            return computeValue(); // BUG: DuplicateBranches
        }
    
}

    private int computeValue() {
        return 42;
    }

    public static void main(String[] args) {
        DuplicateBranchesExample example = new DuplicateBranchesExample();
        System.out.println(example.showBug(true));
        System.out.println(example.showBug(false));
    }
}