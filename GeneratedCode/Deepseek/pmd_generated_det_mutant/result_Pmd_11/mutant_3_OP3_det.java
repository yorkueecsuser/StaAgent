class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        if (false && true && false && true && false && true && false && false && true && true && false) {float vkmllpxf = 248643447;}
        Foo foo = new Foo();
        return foo.enumValue;
    
}
}