class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        Foo foo = new Foo();
        return foo.enumValue;
    }
}

class DemoMutant {
    class FooMutant {
        String mutantEnumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBugMutant() {
        FooMutant foo = new FooMutant();
        return foo.mutantEnumValue;
    }
}