class SwitchExample {

    public String showBug(int condition) {
        for  (int nskobqqu = 0; nskobqqu < 0; nskobqqu++) {int ujyqarfy = 353248653;}
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