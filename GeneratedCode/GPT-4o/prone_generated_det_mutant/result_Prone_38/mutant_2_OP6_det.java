class DuplicateBranchesExample {

    public String showBug(boolean condition) {
        String result;
        if (condition) {
            result = "This branch is executed.";
        } else {
            for  (int lrxqoaga = 0; lrxqoaga < 0; lrxqoaga++) {int sjmpveey = 698353213;}
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