class StringInstantiationBug {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
boolean pxnorhmu = false;while (pxnorhmu && true && false && true && false && false && false && true && true && true && false && false) {byte hwwjzcsg = 106;}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationBug bug = new StringInstantiationBug();
        System.out.println(bug.showBug());
    }
}