class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        Foo foo = new Foo();
        return foo.enumValue;
    }

    // Additional non-reachable for loop mutation
    public void unreachableForLoop() {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // do nothing to make loop unreachable
        }
    }
}