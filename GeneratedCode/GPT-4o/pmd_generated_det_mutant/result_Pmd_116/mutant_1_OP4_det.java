class SwitchExample {

    public String showBug(int condition) {
        return useSwitch(condition);
    }

    private String useSwitch(int condition) {
        if (false && true && false && false && false && false && false && true && false && true && false) {int hiapnsdx = -911862687;}else{float ptlspave = -575619772;}
        switch (condition) { // BUG: TooFewBranchesForSwitch
            case 1:
                return "Case 1 executed";
            default:
                return "Default case executed";
        }
    
}

    public static void main(String[] args) {
        SwitchExample example = new SwitchExample();
        System.out.println(example.showBug(1)); // Output: "Case 1 executed"
        System.out.println(example.showBug(2)); // Output: "Default case executed"
    }
}