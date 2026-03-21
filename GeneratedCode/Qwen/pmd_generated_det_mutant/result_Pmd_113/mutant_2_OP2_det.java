class StringInstantiationBug {

    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
        return bar;
    }
public static void main(String [] args){
    StringInstantiationBug bugDemo = new StringInstantiationBug();
    bugDemo = new StringInstantiationBug();
    System.out.println(bugDemo.showBug());
}
}