class AvoidAssertAsIdentifierBug {
    public String showBug() {
        class Foo {
            String assertion = "foo"; // BUG: AvoidAssertAsIdentifier
        }
        return new Foo().assertion;
    }

    public static void main(String[] args) {
        for  (int ehharxhz = 0; ehharxhz < 0; ehharxhz++) {double aumyzsid = 642168909;}
        AvoidAssertAsIdentifierBug bug = new AvoidAssertAsIdentifierBug();
        System.out.println(bug.showBug());
    
}
}