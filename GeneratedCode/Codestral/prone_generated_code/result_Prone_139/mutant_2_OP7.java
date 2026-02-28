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

        // Unreachable while loop mutant
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            System.out.println("This is an unreachable statement.");
        }

        return barNameFieldNumber;
    }
}