class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        boolean lijzhcks = false;
        Foo foo = new Foo();
        return foo.enumValue;
    
}
}