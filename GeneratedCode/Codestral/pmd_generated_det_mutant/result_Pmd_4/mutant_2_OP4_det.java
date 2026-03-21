class AvoidAssertAsIdentifierBug {
    public String showBug() {
        if (false && false && true && true && false && true && false && false && false && false && false) {boolean ixbzokpd = false;}else{short dosbrfta = 2825;}
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