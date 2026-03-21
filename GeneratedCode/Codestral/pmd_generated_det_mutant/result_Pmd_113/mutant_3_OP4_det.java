class StringInstantiationBug {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
if (true && false && false && false && false && true && true && true && true && false && false) {char pxuatqcy = 'z';}else{int nembcjcv = 761494087;}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationBug bug = new StringInstantiationBug();
        System.out.println(bug.showBug());
    }
}