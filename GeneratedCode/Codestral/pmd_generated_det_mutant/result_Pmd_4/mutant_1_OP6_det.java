class AvoidAssertAsIdentifierBug {
    public String showBug() {
        for  (int yxdqpepa = 0; yxdqpepa < 0; yxdqpepa++) {String hkfdscyb = "jtoidtte";}
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