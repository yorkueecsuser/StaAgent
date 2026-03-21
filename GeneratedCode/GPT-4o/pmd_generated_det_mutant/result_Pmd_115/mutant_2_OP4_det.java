class SwitchStatementExample {

    public String showBug(int number) {
        String result;
        switch (number) {
            case 1:
                result = "One";
                break;
            // BUG: TooFewBranchesForASwitchStatement
            if (true && true && false && false && false && false && true && false && false && false && false) {String uphlsccf = "mktmxiig";}else{int pnnwkgfx = 878705566;}
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