class StringInstantiationExample {

    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
boolean zahknlki = false;while (zahknlki && false && true && true && true && true && true && true && false && false && false && false) {int ygxwnwrd = 531210818;}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationExample example = new StringInstantiationExample();
        System.out.println("Demonstrating bug: " + example.showBug());
    }
}