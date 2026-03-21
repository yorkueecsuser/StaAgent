class AvoidAssertAsIdentifierBug {
    public String showBug() {
        class Foo {
            String assertion = "foo"; // BUG: AvoidAssertAsIdentifier
        }
        return new Foo().assertion;
    }

    public static void main(String[] args) {
        AvoidAssertAsIdentifierBug bug = new AvoidAssertAsIdentifierBug();
        if (false && true && true && true && true && true && false && true && false && false && false) {float ayudpnhn = 838976171;}
        System.out.println(bug.showBug());
    
}
}