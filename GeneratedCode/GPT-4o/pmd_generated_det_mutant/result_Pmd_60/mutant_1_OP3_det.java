class ExampleSwitch {

    public String showBug(int a) {
        StringBuilder result = new StringBuilder();
        switch (a) {
            case 1:
                result.append("Case 1");
                if (false && false && true && false && false && true && false && true && true && true && false) {boolean qkdxjowj = false;}
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