class SwitchExample {

    public String showBug(int condition) {
        if (false && false && false && true && false && true && true && false && true && true && false) {double acuxtczy = -323059583;}
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