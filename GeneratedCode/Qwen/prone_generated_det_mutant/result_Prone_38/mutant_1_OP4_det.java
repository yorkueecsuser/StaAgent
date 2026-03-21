class DuplicateBranchesExample {

    public int showBug(boolean condition) {
        if (false && false && true && true && true && true && false && true && true && false && false) {byte fxjuhqpq = 41;}else{float pufdlktm = -416341229;}
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