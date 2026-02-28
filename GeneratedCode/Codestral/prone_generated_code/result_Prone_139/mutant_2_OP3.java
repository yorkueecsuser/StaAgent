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
        int barNameFieldNumber = foo.getBarNameFieldNumber(); // BUG: ProtoTruthMixedDescriptors - Using Foo's field number instead of Bar's

        // Added unreachable if statement
        boolean unreachableCondition = falseMethodCall();
        if (unreachableCondition) {
            // This block should never be executed
            System.out.println("This is an unreachable branch");
        }

        return barNameFieldNumber;
    }

    // Method returning false, used to create an unreachable condition
    private static boolean falseMethodCall() {
        return false;
    }
}