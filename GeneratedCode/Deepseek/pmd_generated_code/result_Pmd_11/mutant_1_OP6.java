class Demo {
    boolean condition = false;

    class Foo {
        String enumValue = "foo"; // Mutant: AvoidEnumAsIdentifier
    }

    public String showBug() {
        Foo foo = new Foo();
        for (int i = 0; condition; i++) { // Unreachable for loop
            return foo.enumValue; // Unreachable statement
        }
        return null; // This line is required to avoid compilation error
    }
}