class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        Foo foo = new Foo();
        while (false) {
            System.out.println("Unreachable while loop");
        }
        return foo.enumValue;
    }
}