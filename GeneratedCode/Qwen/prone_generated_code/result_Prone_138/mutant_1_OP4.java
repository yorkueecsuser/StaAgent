// This class demonstrates the bug of comparing protobuf string fields using reference equality.
class ProtoStringFieldReferenceEqualityExample {

    // Simplified version of a protobuf message
    static class ExampleMessage {
        private final String stringValue;

        ExampleMessage(String stringValue) {
            this.stringValue = stringValue;
        }

        public String getStringValue() {
            return stringValue;
        }
    }

    // Method to demonstrate the bug
    public boolean showBug(ExampleMessage msg1, ExampleMessage msg2) {
        // Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is unreachable code.");
        } else {
            // Alternative unreachable code
            System.out.println("This is also unreachable code.");
        }

        return msg1.getStringValue() == msg2.getStringValue(); // BUG: ProtoStringFieldReferenceEquality
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This will always return false, but it's not a compile-time constant
    }

    public static void main(String[] args) {
        ExampleMessage msg1 = new ExampleMessage("hello");
        ExampleMessage msg2 = new ExampleMessage("hello");

        ProtoStringFieldReferenceEqualityExample example = new ProtoStringFieldReferenceEqualityExample();
        System.out.println(example.showBug(msg1, msg2)); // Expected to be false due to reference comparison
    }
}