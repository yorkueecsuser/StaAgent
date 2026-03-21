class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        if (false && false && true && true && true && false && true && false && true && false && false) {long dquwsxsc = -690993385;}else{long bwusjprw = -532852458;}
        Foo foo = new Foo();
        return foo.enumValue;
    
}
}