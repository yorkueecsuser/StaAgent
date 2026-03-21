class DuplicateBranchesExample {

    public String showBug(boolean condition) {
        String result;
        if (condition) {
            result = "This branch is executed.";
        } else {
            if (false && true && true && true && false && false && false && false && false && false && false) {short wdxyymhn = -65;}
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