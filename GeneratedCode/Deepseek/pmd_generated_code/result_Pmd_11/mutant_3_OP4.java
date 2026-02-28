class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    private boolean alwaysFalse() {
        return false;
    }

    public String showBug() {
        Foo foo = new Foo();
        if (alwaysFalse()) { 
            // Unreachable block of code
            return "This will never be executed";
        } else {
            return foo.enumValue;
        }
    }
}