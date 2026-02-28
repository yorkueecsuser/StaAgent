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

    private static boolean alwaysFalse() {
        return false;
    }

    public int showBug(Foo foo) {
        int barNameFieldNumber = foo.getBarNameFieldNumber();

        if (alwaysFalse()) { // Mutant code added here, making the switch statement unreachable
            switch (barNameFieldNumber) {
                case 1:
                    // unreachable code
                    break;
                default:
                    // default case, do nothing
            }
        }

        return barNameFieldNumber;
    }
}