class StringInstantiationExample {

    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
int kxwucnlr = 0;switch  (kxwucnlr) {case 1:String sqvfjfty = "avxgwssk";break;default:byte syykbjac = 107;break;}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationExample example = new StringInstantiationExample();
        System.out.println("Demonstrating bug: " + example.showBug());
    }
}