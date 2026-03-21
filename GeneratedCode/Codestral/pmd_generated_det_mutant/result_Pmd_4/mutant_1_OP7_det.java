class AvoidAssertAsIdentifierBug {
    public String showBug() {
        boolean rnrbtkhb = false;while (rnrbtkhb && true && true && false && true && false && false && true && true && true && false && false) {int eutparms = 153023276;}
        class Foo {
            String assertion = "foo"; // BUG: AvoidAssertAsIdentifier
        }
        return new Foo().assertion;
    
}

    public static void main(String[] args) {
        AvoidAssertAsIdentifierBug bug = new AvoidAssertAsIdentifierBug();
        System.out.println(bug.showBug());
    }
}