class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        Foo foo = new Foo();

        // Start of the unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // This code will never be executed due to the 'conditionFor' being false
            System.out.println("This will never be printed!");
        }
        // End of the unreachable for loop

        return foo.enumValue;
    }
}