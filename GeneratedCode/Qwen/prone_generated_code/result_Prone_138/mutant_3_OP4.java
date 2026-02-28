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
        boolean condition = getCondition();
        if (condition) {
            // This block is intentionally made unreachable
            System.out.println("This is an unreachable block.");
        } else {
            // This is the normal execution path
            return msg1.getStringValue() == msg2.getStringValue(); // BUG: ProtoStringFieldReferenceEquality
        }
    }

    // Method to provide a dynamic condition for the if-else statement
    private boolean getCondition() {
        return false; // This will ensure the if block is unreachable, but it's dynamically determined
    }

    public static void main(String[] args) {
        ExampleMessage msg1 = new ExampleMessage("hello");
        ExampleMessage msg2 = new ExampleMessage("hello");

        ProtoStringFieldReferenceEqualityExample example = new ProtoStringFieldReferenceEqualityExample();
        System.out.println(example.showBug(msg1, msg2)); // Expected to be false due to reference comparison
    }
}