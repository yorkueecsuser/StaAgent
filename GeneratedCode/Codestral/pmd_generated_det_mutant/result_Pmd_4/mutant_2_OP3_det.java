class AvoidAssertAsIdentifierBug {
    public String showBug() {
        if (false && true && false && true && true && true && true && true && true && false && false) {int gmbtevll = 701521351;}
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