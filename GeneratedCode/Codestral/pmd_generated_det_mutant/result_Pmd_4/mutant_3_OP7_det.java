class AvoidAssertAsIdentifierBug {
    public String showBug() {
        boolean seqqjbzb = false;while (seqqjbzb && false && true && false && false && false && true && true && true && true && true && false) {boolean axiecaxx = true;}
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