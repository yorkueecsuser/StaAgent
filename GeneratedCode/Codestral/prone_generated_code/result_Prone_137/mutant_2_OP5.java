class ProtoBuilderBug {

    // This method demonstrates the ProtoBuilderReturnValueIgnored bug
    public void showBug() {
        ProtoBuilder.Builder builder = ProtoBuilder.newBuilder();

        // Original code that demonstrates the bug
        builder.build();

        // Mutant code: Unreachable switch statement
        int value = getUnreachableValue();
        switch(value) {
            case 1:
                System.out.println("Unreachable code");
                break;
        }

        // The correct way to use ProtoBuilder
        // builder.isInitialized();
        // ProtoBuilder protoBuilder = builder.build();
    }

    // Method to return a value that is not used in the switch statement
    private int getUnreachableValue() {
        return -1;
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