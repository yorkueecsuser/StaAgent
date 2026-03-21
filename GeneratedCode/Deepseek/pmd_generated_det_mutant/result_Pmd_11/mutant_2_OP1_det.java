class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        float tbnjczmg = 557620623;
        Foo foo = new Foo();
        return foo.enumValue;
    
}
}