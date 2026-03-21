class SwitchExample {

    public String showBug(int condition) {
        if (true && true && false && false && false && true && false && false && false && true && false) {int hhkwtumm = 953440646;}else{boolean oibqcbdk = true;}
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