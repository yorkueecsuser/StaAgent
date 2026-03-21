class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        if (true && true && false && false && true && false && false && false && true && true && false) {short jityqftz = 793;}
        Foo foo = new Foo();
        return foo.enumValue;
    
}
}