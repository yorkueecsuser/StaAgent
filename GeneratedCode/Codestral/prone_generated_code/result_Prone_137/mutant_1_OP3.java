// This is a simple Java class demonstrating the ProtoBuilderReturnValueIgnored bug
class ProtoBuilderBug {

    // Method to return a false condition for the unreachable if statement
    private boolean getFalseCondition() {
        return false;
    }

    // This method demonstrates the ProtoBuilderReturnValueIgnored bug
    public void showBug() {
        // ProtoBuilder is a hypothetical class
        ProtoBuilder.Builder builder = ProtoBuilder.newBuilder();

        // Build method is invoked but the return value is ignored // BUG: ProtoBuilderReturnValueIgnored
        builder.build();

        // Unreachable if statement as per mutation operator
        if (getFalseCondition()) {
            // This code is unreachable
            System.out.println("This line is unreachable");
        }

        // The correct way would be to either use isInitialized() or consume the return value
        // builder.isInitialized();
        // ProtoBuilder protoBuilder = builder.build();
    }

    // Hypothetical ProtoBuilder class for the demonstration
    private static class ProtoBuilder {
        // Methods and fields go here
        public static Builder newBuilder() {
            return new Builder();
        }

        public static class Builder {
            public ProtoBuilder build() {
                // Lets assume some validation and construction is happening here
                return new ProtoBuilder();
            }
        }
    }
}