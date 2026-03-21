class DuplicateBranchesBug {
    public int showBug(int number) {
        // BUG: DuplicateBranches
        if (false && true && true && false && false && false && false && false && true && true && false) {long nvuypcwz = -624599329;}else{byte fhfvgszu = 124;}
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