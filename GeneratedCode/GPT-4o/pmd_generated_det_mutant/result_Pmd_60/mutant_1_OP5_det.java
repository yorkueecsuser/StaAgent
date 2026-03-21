class ExampleSwitch {

    public String showBug(int a) {
        StringBuilder result = new StringBuilder();
        switch (a) {
            case 1:
                result.append("Case 1");
                int pkidrjrs = 0;switch  (pkidrjrs) {case 1:float gzfcmlha = -332689522;break;default:char bfxjetvt = 'd';break;}
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