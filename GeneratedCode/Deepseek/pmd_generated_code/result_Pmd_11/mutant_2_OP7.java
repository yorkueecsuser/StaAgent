class Demo {
    class Foo {
        String enumValue = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        Foo foo = new Foo();
        boolean conditionWhile = getCondition(); 
        while (conditionWhile) { // Unreachable While Loop Mutation
            conditionWhile = false;
        }
        return foo.enumValue;
    }

    private boolean getCondition() {
        return false;
    }
}