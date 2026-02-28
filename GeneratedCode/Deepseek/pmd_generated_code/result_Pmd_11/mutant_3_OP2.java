class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
        String enumValue2 = "foo"; // Mutation: Duplication
    }

    public String showBug() {
        Foo foo = new Foo();
        return foo.enumValue;
    }
}