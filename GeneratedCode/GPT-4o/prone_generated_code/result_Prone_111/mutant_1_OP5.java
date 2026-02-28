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
        // Original bug demonstration
        String result = Foo.getDescriptors().findFieldByNumber(Bar.ID_FIELD_NUMBER); // BUG: MixedDescriptors
        
        // Adding unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                result = "This is unreachable due to the value setup";
                break;
            default:
                // This will always be executed
                break;
        }
        
        return result;
    }

    // Method to ensure the switch statement is unreachable
    private int getUnreachableValue() {
        return 0; // This ensures the switch case is never matched
    }

    public static void main(String[] args) {
        DescriptorBugDemo demo = new DescriptorBugDemo();
        System.out.println(demo.showBug());
    }
}