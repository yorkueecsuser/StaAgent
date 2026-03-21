class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        if (false && false && true && true && true && false && false && true && true && false && false) {double ihisnxim = 630144850;}
        Foo foo = new Foo();
        return foo.enumValue;
    
}
}