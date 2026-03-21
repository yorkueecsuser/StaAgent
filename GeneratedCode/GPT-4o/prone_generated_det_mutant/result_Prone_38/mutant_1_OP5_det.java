class DuplicateBranchesExample {

    public String showBug(boolean condition) {
        String result;
        if (condition) {
            result = "This branch is executed.";
        } else {
            int miqzioru = 0;switch  (miqzioru) {case 1:char smtaapef = 'm';break;default:String yulnlagp = "ivnbwuch";break;}
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