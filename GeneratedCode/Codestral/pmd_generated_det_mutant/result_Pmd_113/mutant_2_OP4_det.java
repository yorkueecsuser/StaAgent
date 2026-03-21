class StringInstantiationBug {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
if (false && false && false && true && false && true && false && true && false && true && false) {double mgmkjxui = -520931115;}else{int sbiivmts = -619211630;}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationBug bug = new StringInstantiationBug();
        System.out.println(bug.showBug());
    }
}