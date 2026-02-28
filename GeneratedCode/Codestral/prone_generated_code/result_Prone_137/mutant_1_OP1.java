// This is a simple Java class demonstrating the ProtoBuilderReturnValueIgnored bug and Dead Store mutation
import java.util.Random;

class ProtoBuilderBug {

    // This method demonstrates the ProtoBuilderReturnValueIgnored bug
    public void showBug() {
        // ProtoBuilder is a hypothetical class
        ProtoBuilder.Builder builder = ProtoBuilder.newBuilder();

        // Introduce the Dead Store mutation
        int unusedVar = generateRandomInt();

        // Build method is invoked but the return value is ignored // BUG: ProtoBuilderReturnValueIgnored
        builder.build();

        // The correct way would be to either use isInitialized() or consume the return value
        // builder.isInitialized();
        // ProtoBuilder protoBuilder = builder.build();
    }

    // Method to generate a random integer
    private int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100);
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