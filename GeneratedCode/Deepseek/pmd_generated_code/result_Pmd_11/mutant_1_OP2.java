class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
        String enumValueDuplicated = "foo"; // Mutant: Duplication
    }

    public String showBug() {
        Foo foo = new Foo();
        return foo.enumValue;
    }
}