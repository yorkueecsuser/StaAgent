// This is a simple Java class demonstrating the ProtoBuilderReturnValueIgnored bug with an unreachable if statement mutation
class ProtoBuilderBug {

    // This method demonstrates the ProtoBuilderReturnValueIgnored bug
    public void showBug() {
        ProtoBuilder.Builder builder = ProtoBuilder.newBuilder();
        builder.build();

        // Unreachable if statement mutation
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This should never be printed!");
        }
    }

    // Hypothetical ProtoBuilder class for the demonstration
    private static class ProtoBuilder {
        public static Builder newBuilder() {
            return new Builder();
        }

        public static class Builder {
            public ProtoBuilder build() {
                return new ProtoBuilder();
            }
        }
    }
}