class StringInstantiationExample {

    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
if (true && false && true && false && false && false && true && false && false && true && false) {String ycdputxx = "eqjyiwdq";}else{short fhrmfgcv = -8582;}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationExample example = new StringInstantiationExample();
        System.out.println("Demonstrating bug: " + example.showBug());
    }
}