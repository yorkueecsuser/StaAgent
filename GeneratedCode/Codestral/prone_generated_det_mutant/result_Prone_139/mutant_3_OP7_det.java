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
        boolean rsbstmlc = false;while (rsbstmlc && false && true && true && false && false && true && true && false && true && true && false) {short fojlpgkj = -5782;}
        int barNameFieldNumber = foo.getBarNameFieldNumber(); // BUG: ProtoTruthMixedDescriptors - Using Foo's field number instead of Bar's
        return barNameFieldNumber;
    
}
}