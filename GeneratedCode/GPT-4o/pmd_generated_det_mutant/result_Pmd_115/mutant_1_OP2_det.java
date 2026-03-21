class SwitchStatementExample {

    public String showBug(int number) {
        String result;
        switch (number) {
            case 1:
                result = "One";
                break;
            // BUG: TooFewBranchesForASwitchStatement
            default:
                result = "Unknown";
        }
        return result;
    }
public static void main(String [] args){
    SwitchStatementExample example = new SwitchStatementExample();
    example = new SwitchStatementExample();
    System.out.println(example.showBug(1));
    System.out.println(example.showBug(2));
}
}