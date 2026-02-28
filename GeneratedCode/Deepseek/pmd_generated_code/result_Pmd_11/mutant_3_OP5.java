class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        Foo foo = new Foo();
        return foo.enumValue;
    }

    // Mutant Code Starts
    public String getCondition() {
        int condition = 0;
        switch(condition) {
            case 1:
                System.out.println("Unreachable");
                break;
        }
        return "Condition: " + condition;
    }
    // Mutant Code Ends
}