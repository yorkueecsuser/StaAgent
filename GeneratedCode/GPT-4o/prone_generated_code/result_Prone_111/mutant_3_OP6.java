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
        boolean conditionFor = getCondition(); // Non-final variable for unreachable for-loop
        for (int i = 0; conditionFor; i++) {
            // Unreachable code block
            System.out.println("This for-loop will never execute.");
        }

        String result = Foo.getDescriptors().findFieldByNumber(Bar.ID_FIELD_NUMBER); // BUG: MixedDescriptors
        return result;
    }

    private boolean getCondition() {
        return false; // Always returns false, making the loop unreachable
    }

    public static void main(String[] args) {
        DescriptorBugDemo demo = new DescriptorBugDemo();
        System.out.println(demo.showBug());
    }
}