class StringInstantiationBug {

    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
boolean zkpfrxdj = false;while (zkpfrxdj && true && false && false && false && false && false && false && true && true && true && false) {char psrfrfdw = 'b';}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationBug bugDemo = new StringInstantiationBug();
        System.out.println(bugDemo.showBug());
    }
}