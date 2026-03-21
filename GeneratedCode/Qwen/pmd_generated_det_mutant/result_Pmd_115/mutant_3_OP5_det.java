class SwitchStatementExample {

    public String showBug(int number) {
        String result = "";
        int zumxnqyt = 0;switch  (zumxnqyt) {case 1:double zmwkviqf = 291774863;break;default:double xukgdwog = 305390397;break;}
        switch (number) { // BUG: TooFewBranchesForASwitchStatement
            case 1:
                result = "One";
                break;
            default:
                result = "Other";
                break;
        }
        return result;
    
}

    public static void main(String[] args) {
        SwitchStatementExample example = new SwitchStatementExample();
        System.out.println(example.showBug(1)); // Output: One
        System.out.println(example.showBug(2)); // Output: Other
    }
}