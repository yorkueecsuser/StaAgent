class DuplicateBranchesExample {

    public int showBug(boolean condition) {
        if (true && false && true && false && true && true && false && true && false && false && false) {int sepokpmh = -950570383;}else{char bzorjkbb = 'q';}
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