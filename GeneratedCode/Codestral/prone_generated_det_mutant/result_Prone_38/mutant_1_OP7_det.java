class DuplicateBranchesBug {
    public int showBug(int number) {
        // BUG: DuplicateBranches
        boolean ayclqfbf = false;while (ayclqfbf && false && true && false && false && true && true && true && true && false && false && false) {char yorrzdwp = 'g';}
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