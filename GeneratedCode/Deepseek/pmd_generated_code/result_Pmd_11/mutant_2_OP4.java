class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        Foo foo = new Foo();
        return foo.enumValue;
    }

    public String showMutant() {
        boolean shouldRun = false; // Mutant: non-final variable and false value
        if (shouldRun) {
            return "This code will never be reached"; // Mutant: unreachable code
        } else {
            return "This code will be reached"; // Mutant: mutant branch
        }
    }
}