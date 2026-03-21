class DuplicateBranchesExample {

    public int showBug(boolean condition) {
        int kvqufxby = 0;switch  (kvqufxby) {case 1:long zcrdxzwp = 198591070;break;default:byte gzeybggk = 116;break;}
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