class AvoidAssertAsIdentifierBug {
    public String showBug() {
        for  (int jycmayze = 0; jycmayze < 0; jycmayze++) {int mmzgrhsl = -421240149;}
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