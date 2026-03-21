class SwitchStatementExample {

    public String showBug(int number) {
        String result = "";
        int vcnrenic = 0;switch  (vcnrenic) {case 1:String huxujoob = "pxnqsaam";break;default:byte mfemjkuq = -66;break;}
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