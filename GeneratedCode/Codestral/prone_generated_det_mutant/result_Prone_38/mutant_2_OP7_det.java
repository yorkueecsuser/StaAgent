class DuplicateBranchesBug {
    public int showBug(int number) {
        // BUG: DuplicateBranches
        boolean xfmkuhbf = false;while (xfmkuhbf && false && false && true && false && true && true && false && true && true && false && false) {short gdhuslhj = 8867;}
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