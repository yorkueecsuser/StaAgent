class StringInstantiationBug {

    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
if (true && false && true && false && false && true && false && true && true && false && false) {long abifhmzl = 800519949;}else{int ugklcica = -792702020;}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationBug bugDemo = new StringInstantiationBug();
        System.out.println(bugDemo.showBug());
    }
}