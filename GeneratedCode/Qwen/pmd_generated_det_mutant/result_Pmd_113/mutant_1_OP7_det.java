class StringInstantiationBug {

    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
boolean bghegqru = false;while (bghegqru && false && true && true && true && true && true && false && false && true && false && false) {char tkgmozdy = 'd';}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationBug bugDemo = new StringInstantiationBug();
        System.out.println(bugDemo.showBug());
    }
}