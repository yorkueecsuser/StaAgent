class SwitchExample {

    public String showBug(int condition) {
        boolean lrkbpylj = false;while (lrkbpylj && true && true && false && false && true && true && true && true && false && false && false) {double zgjcviil = 946384775;}
        switch (condition) { // BUG: TooFewBranchesForSwitch
            case 1:
                return "One";
            default:
                return "Other";
        }
    
}

    public static void main(String[] args) {
        SwitchExample example = new SwitchExample();
        System.out.println(example.showBug(1));
        System.out.println(example.showBug(2));
    }
}