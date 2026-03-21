class DuplicateBranchesExample {

    public int showBug(boolean condition) {
        if (condition) {
            return computeValue(); // BUG: DuplicateBranches
        } else {
            return computeValue(); // BUG: DuplicateBranches
        }
    }

    private int computeValue() {
        return 42;
    }
public static void main(String [] args){
    DuplicateBranchesExample example = new DuplicateBranchesExample();
    example = new DuplicateBranchesExample();
    System.out.println(example.showBug(true));
    System.out.println(example.showBug(false));
}
}