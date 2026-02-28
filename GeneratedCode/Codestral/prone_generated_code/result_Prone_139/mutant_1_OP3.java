class ProtoBugDemo {
    public static class Bar {
        public static final int NAME_FIELD_NUMBER = 1;
        //... other implementation details...
    }

    public static class Foo {
        public static final int NAME_FIELD_NUMBER = 1;
        public int getBarNameFieldNumber() {
            return Bar.NAME_FIELD_NUMBER;
        }
        //... other implementation details...
    }

    public int showBug(Foo foo) {
        int barNameFieldNumber = foo.getBarNameFieldNumber();

        // Mutant: Unreachable if statement
        boolean shouldNotRun = getCondition();
        if (shouldNotRun) {
            System.out.println("This line should never execute");
        }

        return barNameFieldNumber;
    }

    // Method to simulate a condition, this will always return false
    private boolean getCondition() {
        return false;
    }
}