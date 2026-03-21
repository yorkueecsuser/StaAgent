class StringInstantiationExample {

    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
boolean azbtbqfu = false;while (azbtbqfu && false && false && true && false && false && true && true && true && false && false && false) {boolean zeafkkew = true;}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationExample example = new StringInstantiationExample();
        System.out.println("Demonstrating bug: " + example.showBug());
    }
}