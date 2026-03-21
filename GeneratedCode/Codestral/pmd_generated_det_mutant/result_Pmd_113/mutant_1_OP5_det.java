class StringInstantiationBug {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
int rrbklkcl = 0;switch  (rrbklkcl) {case 1:boolean qewiobgg = true;break;default:short cexfcuta = -5544;break;}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationBug bug = new StringInstantiationBug();
        System.out.println(bug.showBug());
    }
}