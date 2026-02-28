class EnumIdentifierBug {

    class Foo {
        String enum = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        Foo foo = new Foo();
        return foo.enum;
    }

    public static void main(String[] args) {
        EnumIdentifierBug bugDemo = new EnumIdentifierBug();
        System.out.println(bugDemo.showBug());
    }
}