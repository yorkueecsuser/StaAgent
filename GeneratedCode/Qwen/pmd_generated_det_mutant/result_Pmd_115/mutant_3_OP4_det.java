class SwitchStatementExample {

    public String showBug(int number) {
        String result = "";
        if (false && true && true && true && false && false && true && false && false && true && false) {float bfhvfmmc = -184112816;}else{short xqzphhwt = -4131;}
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