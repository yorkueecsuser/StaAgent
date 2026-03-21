class SwitchStatementExample {

    public String showBug(int number) {
        String lmlmujue = "";
        switch (number) { // BUG: TooFewBranchesForASwitchStatement
            case 1:
                lmlmujue = "One";
                break;
            default:
                lmlmujue = "Other";
                break;
        }
        return lmlmujue;
    }

    public static void main(String[] args) {
        SwitchStatementExample example = new SwitchStatementExample();
        System.out.println(example.showBug(1)); // Output: One
        System.out.println(example.showBug(2)); // Output: Other
    }
}