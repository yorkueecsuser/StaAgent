class DuplicateBranchesBug {
    public int showBug(int number) {
        // BUG: DuplicateBranches
        int kfvxvfrh = 0;switch  (kfvxvfrh) {case 1:byte qnbnbixd = 32;break;default:String cbbyspsh = "gcdgndhh";break;}
        if (number > 0) {
            return calculate(number);  // identical code in both branches
        } else {
            return calculate(number);  // identical code in both branches
        }
    
}

    private int calculate(int number) {
        return number * 2;
    }

    public static void main(String[] args) {
        DuplicateBranchesBug bug = new DuplicateBranchesBug();
        System.out.println(bug.showBug(5));
    }
}