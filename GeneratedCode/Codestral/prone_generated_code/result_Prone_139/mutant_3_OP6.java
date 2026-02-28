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
        // Inserted unreachable for loop
        for (int i = 0; getUnreachableCondition(); i++) {
            // This loop will never execute
            System.out.println("This is an unreachable loop.");
        }

        int barNameFieldNumber = foo.getBarNameFieldNumber(); // BUG: ProtoTruthMixedDescriptors - Using Foo's field number instead of Bar's
        return barNameFieldNumber;
    }

    // Method used to generate the unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }
}