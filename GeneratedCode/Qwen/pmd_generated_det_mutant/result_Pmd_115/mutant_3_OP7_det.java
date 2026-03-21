class SwitchStatementExample {

    public String showBug(int number) {
        String result = "";
        boolean soxsfnsh = false;while (soxsfnsh && true && true && true && true && false && false && false && false && false && true && false) {short kkuarciw = 1901;}
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