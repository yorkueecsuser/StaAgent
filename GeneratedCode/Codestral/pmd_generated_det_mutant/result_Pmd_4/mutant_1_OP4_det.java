class AvoidAssertAsIdentifierBug {
    public String showBug() {
        if (false && true && false && false && true && true && true && false && false && true && false) {boolean jdghibyg = true;}else{boolean cewuxzbs = false;}
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