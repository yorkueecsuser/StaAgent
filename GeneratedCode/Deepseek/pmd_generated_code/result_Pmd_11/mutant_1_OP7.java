class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        Foo foo = new Foo();
        while (false) {
            // unreachable code
        }
        return foo.enumValue;
    }
}