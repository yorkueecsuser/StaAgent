class AssertIdentifierBug {

    class Foo {
        String assert = "foo"; // BUG: AvoidAssertAsIdentifier
    }

    public String showBug() {
        Foo foo = new Foo();
        return foo.assert;
    }

    public static void main(String[] args) {
        AssertIdentifierBug bugDemo = new AssertIdentifierBug();
        System.out.println(bugDemo.showBug());
    }
}