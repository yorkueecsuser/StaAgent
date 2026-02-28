class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    String deadStoreValue = "deadStore"; // Mutated code

    public String showBug() {
        Foo foo = new Foo();
        return foo.enumValue;
    }
}