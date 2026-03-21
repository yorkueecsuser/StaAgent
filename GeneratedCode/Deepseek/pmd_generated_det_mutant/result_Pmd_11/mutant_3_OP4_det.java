class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        if (true && false && false && true && true && false && false && true && true && true && false) {short psyfydoh = -4961;}else{boolean ugnoerbo = false;}
        Foo foo = new Foo();
        return foo.enumValue;
    
}
}