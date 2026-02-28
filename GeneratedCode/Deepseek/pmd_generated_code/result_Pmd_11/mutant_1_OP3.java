class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        Foo foo = new Foo();
        boolean condition = false;
        if (condition == false) {
            return "The condition is false";
        }
        return foo.enumValue;
    }
}