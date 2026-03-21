class DuplicateBranchesBug {
    public int showBug(int number) {
        // BUG: DuplicateBranches
        int fuuxaccl = 0;switch  (fuuxaccl) {case 1:int btmxvehu = 68924232;break;default:double ygbwtkok = 782315280;break;}
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