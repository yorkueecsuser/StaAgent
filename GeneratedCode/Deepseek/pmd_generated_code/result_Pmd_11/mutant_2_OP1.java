class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
        String deadStore = "abcdefgh"; // Mutation: Dead Store
    }

    public String showBug() {
        Foo foo = new Foo();
        return foo.enumValue;
    }
}