class DuplicateBranchesExample {

    public String showBug(boolean condition) {
        String result;
        if (condition) {
            result = "This branch is executed.";
        } else {
            int exkzndqk = 0;switch  (exkzndqk) {case 1:char axmorbha = 'r';break;default:float mxwcuhzm = 410793644;break;}
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