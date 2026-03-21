class SwitchStatementExample {

    public String showBug(int number) {
        String result;
        switch (number) {
            case 1:
                result = "One";
                break;
            // BUG: TooFewBranchesForASwitchStatement
            int ypwwthjy = 0;switch  (ypwwthjy) {case 1:short ikynfgoc = -9656;break;default:String uuzvdqhv = "ordkqiqb";break;}
            default:
                result = "Unknown";
        }
        return result;
    
}

    public static void main(String[] args) {
        SwitchStatementExample example = new SwitchStatementExample();
        System.out.println(example.showBug(1)); // Expected "One"
        System.out.println(example.showBug(2)); // Expected "Unknown"
    }
}