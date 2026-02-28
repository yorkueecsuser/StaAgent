class DescriptorBugDemo {

    public static class Foo {
        public static final int ID_FIELD_NUMBER = 1;

        public static Descriptor getDescriptors() {
            return new Descriptor("Foo");
        }
    }

    public static class Bar {
        public static final int ID_FIELD_NUMBER = 2;

        public static Descriptor getDescriptors() {
            return new Descriptor("Bar");
        }
    }

    public static class Descriptor {
        private final String name;

        public Descriptor(String name) {
            this.name = name;
        }

        public String findFieldByNumber(int fieldNumber) {
            return "Field found in " + this.name + " with field number " + fieldNumber;
        }
    }

    public String showBug() {
        boolean unreachableCondition = getCondition(); // non-final variable used to simulate an unreachable if
        if (unreachableCondition) {
            // This block is unreachable as the condition is always false
            return "This will never be executed.";
        }
        String result = Foo.getDescriptors().findFieldByNumber(Bar.ID_FIELD_NUMBER); // BUG: MixedDescriptors
        return result;
    }

    private boolean getCondition() {
        return false; // This simulates an unreachable condition at runtime
    }

    public static void main(String[] args) {
        DescriptorBugDemo demo = new DescriptorBugDemo();
        System.out.println(demo.showBug());
    }
}