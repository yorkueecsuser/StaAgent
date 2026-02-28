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
        boolean conditionWhile = getCondition(); // non-final variable for while loop condition
        while (conditionWhile) { 
            // This loop is unreachable because conditionWhile is false
            System.out.println("This is unreachable code inside the while loop.");
            conditionWhile = false; // changing condition to false to prevent any infinite loops
        }

        String result = Foo.getDescriptors().findFieldByNumber(Bar.ID_FIELD_NUMBER); // BUG: MixedDescriptors
        return result;
    }
    
    // Method to return false as while loop condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        DescriptorBugDemo demo = new DescriptorBugDemo();
        System.out.println(demo.showBug());
    }
}