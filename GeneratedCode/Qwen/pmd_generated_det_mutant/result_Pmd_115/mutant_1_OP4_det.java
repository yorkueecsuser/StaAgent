class SwitchStatementExample {

    public String showBug(int number) {
        String result = "";
        if (true && false && true && true && true && true && true && true && false && false && false) {String ssehsemn = "nwfixpaq";}else{String mmslkzjo = "hovrhgki";}
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