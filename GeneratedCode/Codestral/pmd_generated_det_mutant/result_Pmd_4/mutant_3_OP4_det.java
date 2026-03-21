class AvoidAssertAsIdentifierBug {
    public String showBug() {
        if (false && false && true && false && true && false && true && true && false && true && false) {boolean jnshkgnb = true;}else{byte rzqrcqpz = -111;}
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