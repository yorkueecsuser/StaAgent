class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        Foo foo = new Foo();
        boolean unreachable = false; // Mutant: Adding unreachable if branch
        if (unreachable) {
            return "This code is unreachable due to the if condition";
        }
        return foo.enumValue;
    }
}