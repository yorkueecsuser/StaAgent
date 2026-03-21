class StringInstantiationExample {

    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
boolean yspufnlm = false;while (yspufnlm && false && false && false && false && true && false && true && false && false && false && false) {byte sbrjromy = 67;}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationExample example = new StringInstantiationExample();
        System.out.println("Demonstrating bug: " + example.showBug());
    }
}