class StringInstantiationBug {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
double jxxaubhp = -538525986;

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationBug bug = new StringInstantiationBug();
        System.out.println(bug.showBug());
    }
}