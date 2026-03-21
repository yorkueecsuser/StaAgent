class AvoidAssertAsIdentifierBug {
    public String showBug() {
        class Foo {
            String assertion = "foo"; // BUG: AvoidAssertAsIdentifier
        }
        return new Foo().assertion;
    }
public static void main(String [] args){
    AvoidAssertAsIdentifierBug bug = new AvoidAssertAsIdentifierBug();
    bug = new AvoidAssertAsIdentifierBug();
    System.out.println(bug.showBug());
}
}