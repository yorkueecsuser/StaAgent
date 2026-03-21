class DuplicateBranchesExample {

    public int showBug(boolean condition) {
        for  (int kzuldzkp = 0; kzuldzkp < 0; kzuldzkp++) {long nweikrdn = -233056841;}
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