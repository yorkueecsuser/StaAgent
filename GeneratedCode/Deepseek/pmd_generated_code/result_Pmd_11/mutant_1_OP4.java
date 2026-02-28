class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        Foo foo = new Foo();
        boolean condition = false;
        if (condition) {
            return "unreachable code";
        } else {
            return foo.enumValue;
        }
    }
}