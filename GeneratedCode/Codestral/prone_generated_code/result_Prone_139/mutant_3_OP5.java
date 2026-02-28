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

    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(Foo foo) {
        int barNameFieldNumber = foo.getBarNameFieldNumber();

        if (getFalseCondition()) {
            // Mutant: Unreachable switch statement
            switch (barNameFieldNumber) {
                case 2:
                    System.out.println("Unreachable code executed.");
                    break;
                default:
                    System.out.println("Default case executed.");
            }
        }

        return barNameFieldNumber;
    }
}