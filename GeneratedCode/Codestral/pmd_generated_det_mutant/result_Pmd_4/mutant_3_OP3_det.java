class AvoidAssertAsIdentifierBug {
    public String showBug() {
        class Foo {
            String assertion = "foo"; // BUG: AvoidAssertAsIdentifier
        }
        return new Foo().assertion;
    }

    public static void main(String[] args) {
        AvoidAssertAsIdentifierBug bug = new AvoidAssertAsIdentifierBug();
        if (true && true && false && true && false && false && true && true && false && true && false) {char mvgkivnh = 'g';}
        System.out.println(bug.showBug());
    
}
}