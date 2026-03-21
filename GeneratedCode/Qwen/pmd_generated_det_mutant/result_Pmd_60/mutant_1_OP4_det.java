class SwitchExample {

    public String showBug(int a) {
        StringBuilder result = new StringBuilder();
        switch (a) {
            case 1:
                result.append("Case 1");
                if (true && true && false && false && false && true && false && true && false && false && false) {byte wkzdxetb = -7;}else{double bpflltoq = -925427021;}
                mylabel: // BUG: NonCaseLabelInSwitch
                break;
            case 2:
                result.append("Case 2");
                break;
            default:
                result.append("Default Case");
                break;
        }
        return result.toString();
    
}

    public static void main(String[] args) {
        SwitchExample example = new SwitchExample();
        System.out.println(example.showBug(1)); // Output: Case 1
        System.out.println(example.showBug(2)); // Output: Case 2
        System.out.println(example.showBug(3)); // Output: Default Case
    }
}