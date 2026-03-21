class DuplicateBranchesBug {
    public int showBug(int number) {
        // BUG: DuplicateBranches
        if (true && false && false && true && false && true && true && true && true && false && false) {float czrnsykl = -976375835;}else{float piogiuzm = 365651764;}
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