// This is a simple Java class demonstrating the ProtoBuilderReturnValueIgnored bug
class ProtoBuilderBug {

    // This method demonstrates the ProtoBuilderReturnValueIgnored bug
    public void showBug() {
        // ProtoBuilder is a hypothetical class
        ProtoBuilder.Builder builder = ProtoBuilder.newBuilder();

        // Build method is invoked but the return value is ignored // BUG: ProtoBuilderReturnValueIgnored
        builder.build();

        // Mutant: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This branch is unreachable as the condition is always false
            System.out.println("This line should never be executed.");
        } else {
            // This branch is unreachable as well, but it's here to demonstrate the mutation
            int x = 10 / 0; // This will throw an ArithmeticException to ensure the mutant is detected
        }

        // The correct way would be to either use isInitialized() or consume the return value
        // builder.isInitialized();
        // ProtoBuilder protoBuilder = builder.build();
    }

    // Method to generate the condition for the unreachable if-else statement
    boolean getCondition() {
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