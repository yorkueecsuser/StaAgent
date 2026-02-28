// This is a simple Java class demonstrating the ProtoBuilderReturnValueIgnored bug
class ProtoBuilderBug {

    // This method demonstrates the ProtoBuilderReturnValueIgnored bug
    public void showBug() {
        // ProtoBuilder is a hypothetical class
        ProtoBuilder.Builder a = ProtoBuilder.newBuilder(); // Renamed 'builder' to 'a'

        // Build method is invoked but the return value is ignored // BUG: ProtoBuilderReturnValueIgnored
        a.build();

        // The original builder is still usable
        ProtoBuilder.Builder builder = a;

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