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
        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) { // Unreachable for loop
            System.out.println("This line will never be executed.");
        }
        return barNameFieldNumber;
    }
}