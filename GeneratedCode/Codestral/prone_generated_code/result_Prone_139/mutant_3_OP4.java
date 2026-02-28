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

    private static boolean getUnreachableCondition() {
        return false;
    }

    public int showBug(Foo foo) {
        int barNameFieldNumber = foo.getBarNameFieldNumber();

        // Adding mutant - unreachable if-else statement
        if (getUnreachableCondition()) {
            // This block is unreachable as getUnreachableCondition() always returns false
            barNameFieldNumber = 0;
        } else {
            // Original code
            barNameFieldNumber = foo.getBarNameFieldNumber();
        }

        return barNameFieldNumber;
    }
}