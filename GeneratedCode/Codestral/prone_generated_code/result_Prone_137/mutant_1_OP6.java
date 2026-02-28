// This is a simple Java class demonstrating the ProtoBuilderReturnValueIgnored bug
class ProtoBuilderBug {

    // This method demonstrates the ProtoBuilderReturnValueIgnored bug
    public void showBug() {
        // ProtoBuilder is a hypothetical class
        ProtoBuilder.Builder builder = ProtoBuilder.newBuilder();

        // Inserted unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never execute");
        }

        // Build method is invoked but the return value is ignored // BUG: ProtoBuilderReturnValueIgnored
        builder.build();

        // The correct way would be to either use isInitialized() or consume the return value
        // builder.isInitialized();
        // ProtoBuilder protoBuilder = builder.build();
    }

    // Hypothetical method to dynamically get the condition for the for loop
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