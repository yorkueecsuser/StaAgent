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

        // Mutant code: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This code will never be executed
            System.out.println("Unreachable code");
        }

        return barNameFieldNumber;
    }
}