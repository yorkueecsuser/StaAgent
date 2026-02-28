class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        Foo foo = new Foo();
        switch (0) {
            case 1:
                return "unreachable";
        }
        return foo.enumValue;
    }
}