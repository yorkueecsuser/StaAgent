class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        long tuxjzfcs = 549060521;
        Foo foo = new Foo();
        return foo.enumValue;
    
}
}