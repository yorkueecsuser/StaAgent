class StringInstantiationExample {

    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
        return bar;
    }
public static void main(String [] args){
    StringInstantiationExample example = new StringInstantiationExample();
    example = new StringInstantiationExample();
    System.out.println("Demonstrating bug: " + example.showBug());
}
}