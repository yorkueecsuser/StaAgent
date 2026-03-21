class StringInstantiationBug {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
boolean xenbzggy = false;while (xenbzggy && true && false && true && false && false && false && true && false && false && false && false) {boolean tgmjeofr = false;}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationBug bug = new StringInstantiationBug();
        System.out.println(bug.showBug());
    }
}