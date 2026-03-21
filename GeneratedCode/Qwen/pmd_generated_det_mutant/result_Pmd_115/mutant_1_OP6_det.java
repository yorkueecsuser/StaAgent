class SwitchStatementExample {

    public String showBug(int number) {
        String result = "";
        for  (int pidfutjf = 0; pidfutjf < 0; pidfutjf++) {char hpljgpol = 'j';}
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