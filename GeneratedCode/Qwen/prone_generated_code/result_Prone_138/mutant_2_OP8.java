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
        return msg1.getStringValue() == msg2.getStringValue(); // BUG: ProtoStringFieldReferenceEquality
    }

    // Mutated method with renamed variable
    public boolean showBug(ExampleMessage a, ExampleMessage msg2) {
        return a.getStringValue() == msg2.getStringValue(); // Mutant: Renamed msg1 to a
    }

    public static void main(String[] args) {
        ExampleMessage msg1 = new ExampleMessage("hello");
        ExampleMessage msg2 = new ExampleMessage("hello");

        ProtoStringFieldReferenceEqualityExample example = new ProtoStringFieldReferenceEqualityExample();
        System.out.println(example.showBug(msg1, msg2)); // Expected to be false due to reference comparison

        // Testing the mutant
        System.out.println(example.showBug(msg1, msg2)); // Expected to be false due to reference comparison
    }
}