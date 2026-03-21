class ExampleSwitch {

    public String showBug(int a) {
        StringBuilder result = new StringBuilder();
        switch (a) {
            case 1:
                result.append("Case 1");
                if (true && true && false && false && false && false && true && false && true && false && false) {String bttcovge = "hravtzsn";}else{int uqmqpoln = -62243222;}
                mylabel: // BUG: NonCaseLabelInSwitch
                break;  // This break is associated with mylabel, not the switch
            case 2:
                result.append("Case 2");
                break;
            default:
                result.append("Default case");
                break;
        }
        return result.toString();
    
}

    public static void main(String[] args) {
        ExampleSwitch example = new ExampleSwitch();
        System.out.println(example.showBug(1));  // Output will demonstrate the bug
    }
}