class DuplicateBranchesExample {

    public int showBug(boolean condition) {
        boolean apnayuqq = false;while (apnayuqq && true && true && false && true && false && false && true && false && false && true && false) {int wdkybxil = -111380628;}
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