class DuplicateBranchesBug {
    public int showBug(int number) {
        // BUG: DuplicateBranches
        boolean tclrltun = false;while (tclrltun && false && true && true && true && false && false && true && false && false && true && false) {double mejfnmej = 441715604;}
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