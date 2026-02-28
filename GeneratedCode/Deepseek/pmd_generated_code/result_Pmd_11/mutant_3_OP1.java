class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
        int deadStore = 0; // Dead Store mutation
    }

    public String showBug() {
        Foo foo = new Foo();
        return foo.enumValue;
    }
}