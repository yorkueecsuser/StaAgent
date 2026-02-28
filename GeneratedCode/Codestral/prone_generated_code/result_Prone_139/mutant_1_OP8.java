class ProtoBugDemo {
    public static class Bar {
        public static final int NAME_FIELD_NUMBER = 1;
        //... other implementation details...
    }

    public static class Foo {
        public static final int NAME_FIELD_NUMBER = 1;
        public int getBarNameFieldNumber() {
            int barNameFieldNumber = Bar.NAME_FIELD_NUMBER;
            return barNameFieldNumber; // Renaming: Original variable name 'barNameFieldNumber' is changed to 'a'
        }
        //... other implementation details...
    }

    public int showBug(Foo foo) {
        int a = foo.getBarNameFieldNumber(); // Mutation: Using the renamed variable name 'a'
        return a;
    }
}