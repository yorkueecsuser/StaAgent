// This is a simple Java class demonstrating the ProtoBuilderReturnValueIgnored bug
// and the introduction of an unreachable while loop mutation
class ProtoBuilderBug {

    // This method demonstrates the ProtoBuilderReturnValueIgnored bug
    // and the introduction of an unreachable while loop mutation
    public void showBug() {
        // ProtoBuilder is a hypothetical class
        ProtoBuilder.Builder builder = ProtoBuilder.newBuilder();

        // Build method is invoked but the return value is ignored // BUG: ProtoBuilderReturnValueIgnored
        builder.build();

        // Introduction of unreachable while loop mutation
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This line is unreachable");
        }

        // The correct way would be to either use isInitialized() or consume the return value
        // builder.isInitialized();
        // ProtoBuilder protoBuilder = builder.build();
    }

    // Method to simulate a condition that is always false
    private boolean getCondition() {
        return false;
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