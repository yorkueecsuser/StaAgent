class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        if (false && true && false && false && true && true && true && false && false && false && false) {double eyjcuowk = -990279807;}else{boolean olstfqao = true;}
        Foo foo = new Foo();
        return foo.enumValue;
    
}
}