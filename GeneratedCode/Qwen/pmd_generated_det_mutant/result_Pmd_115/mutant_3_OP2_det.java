class SwitchStatementExample {

    public String showBug(int number) {
        String result = "";
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
public static void main(String [] args){
    SwitchStatementExample example = new SwitchStatementExample();
    example = new SwitchStatementExample();
    System.out.println(example.showBug(1));
    System.out.println(example.showBug(2));
}
}