class Demo {
    class Foo {
        String newEnumValue = "foo"; // Mutation: Renaming
    }

    public String showBug() {
        Foo foo = new Foo();
        return foo.newEnumValue;
    }
}