// This is a simple Java class demonstrating the ProtoBuilderReturnValueIgnored bug with an added unreachable if-else statement
class ProtoBuilderBug {

    // Method to return a constant false value
    private boolean getFalseCondition() {
        return false;
    }

    // This method demonstrates the ProtoBuilderReturnValueIgnored bug
    public void showBug() {
        // ProtoBuilder is a hypothetical class
        ProtoBuilder.Builder builder = ProtoBuilder.newBuilder();

        // Build method is invoked but the return value is ignored // BUG: ProtoBuilderReturnValueIgnored
        builder.build();

        // Added unreachable if-else statement
        if (getFalseCondition()) {
            // This branch is unreachable
            System.out.println("This line should never be executed.");
        } else {
            // This branch is always executed
            System.out.println("This line is always executed.");
        }
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