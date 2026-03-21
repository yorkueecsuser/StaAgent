class StringInstantiationBug {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
boolean qnvjkloy = false;while (qnvjkloy && true && false && true && false && true && true && false && false && false && true && false) {byte xmburzdm = 98;}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationBug bug = new StringInstantiationBug();
        System.out.println(bug.showBug());
    }
}