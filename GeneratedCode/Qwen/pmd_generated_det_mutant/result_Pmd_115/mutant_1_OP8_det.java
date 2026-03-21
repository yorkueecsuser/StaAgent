class SwitchStatementExample {

    public String showBug(int number) {
        String geqhozlk = "";
        switch (number) { // BUG: TooFewBranchesForASwitchStatement
            case 1:
                geqhozlk = "One";
                break;
            default:
                geqhozlk = "Other";
                break;
        }
        return geqhozlk;
    }

    public static void main(String[] args) {
        SwitchStatementExample example = new SwitchStatementExample();
        System.out.println(example.showBug(1)); // Output: One
        System.out.println(example.showBug(2)); // Output: Other
    }
}