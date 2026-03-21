class StringInstantiationBug {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
float qweydfkf = -695208661;

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationBug bug = new StringInstantiationBug();
        System.out.println(bug.showBug());
    }
}