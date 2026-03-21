class DuplicateBranchesExample {

    public int showBug(boolean condition) {
        if (true && false && false && true && true && false && false && true && true && true && false) {float faweblsk = -640700837;}else{float qelinheq = -50356576;}
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