class StringInstantiationBug {

    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
if (false && true && true && true && false && true && false && true && true && false && false) {byte hwjrxfnc = -99;}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationBug bugDemo = new StringInstantiationBug();
        System.out.println(bugDemo.showBug());
    }
}