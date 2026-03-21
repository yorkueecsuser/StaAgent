class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        boolean katdetli = false;while (katdetli && true && false && false && false && false && true && true && false && false && true && false) {char eiscfgxv = 'v';}
        Foo foo = new Foo();
        return foo.enumValue;
    
}
}