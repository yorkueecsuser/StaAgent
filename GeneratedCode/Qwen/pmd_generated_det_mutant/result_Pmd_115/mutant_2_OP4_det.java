class SwitchStatementExample {

    public String showBug(int number) {
        String result = "";
        if (false && true && true && true && false && true && false && false && false && false && false) {double pthadooh = -127119364;}else{int ofzthflc = -732616819;}
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