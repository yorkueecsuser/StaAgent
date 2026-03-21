class AvoidAssertAsIdentifierBug {
    public String showBug() {
        boolean waxufaje = false;while (waxufaje && true && true && true && true && false && false && true && false && true && true && false) {float ydeuqhgu = 654896543;}
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