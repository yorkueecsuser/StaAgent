class DuplicateBranchesBug {
    public int showBug(int number) {
        // BUG: DuplicateBranches
        int btrnwoea = 0;switch  (btrnwoea) {case 1:int dzjimfzm = 780268625;break;default:byte wmcjhspe = -79;break;}
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