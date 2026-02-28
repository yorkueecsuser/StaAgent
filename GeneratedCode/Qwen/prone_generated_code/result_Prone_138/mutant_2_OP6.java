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
        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop will never execute because conditionFor is always false
        }

        return msg1.getStringValue() == msg2.getStringValue(); // BUG: ProtoStringFieldReferenceEquality
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ExampleMessage msg1 = new ExampleMessage("hello");
        ExampleMessage msg2 = new ExampleMessage("hello");

        ProtoStringFieldReferenceEqualityExample example = new ProtoStringFieldReferenceEqualityExample();
        System.out.println(example.showBug(msg1, msg2)); // Expected to be false due to reference comparison
    }
}