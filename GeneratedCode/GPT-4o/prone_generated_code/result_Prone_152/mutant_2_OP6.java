import java.util.HashMap;
import java.util.Map;

class ProtoFieldSetter {
    
    public enum ProtoEnum {
        VALUE_1,
        VALUE_2,
        UNRECOGNIZED // This value is used to simulate an unrecognized enum value
    }

    public static class ProtoMessageBuilder {
        private ProtoEnum field;

        public ProtoMessageBuilder setField(ProtoEnum value) {
            if (value == ProtoEnum.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set field to UNRECOGNIZED value");
            }
            this.field = value;
            return this;
        }

        public ProtoEnum build() {
            if (field == null) {
                throw new IllegalStateException("Field is not set");
            }
            return field;
        }
    }

    public void showBug() {
        ProtoMessageBuilder builder = new ProtoMessageBuilder();
        builder.setField(ProtoEnum.UNRECOGNIZED); // BUG: SetUnrecognized

        // Unreachable for loop mutation
        boolean runLoop = getCondition(); // Dynamically determined condition
        for (int i = 0; runLoop; i++) {
            System.out.println("This is an unreachable loop");
        }

        ProtoEnum result = builder.build();
        System.out.println("Built proto with field: " + result);
    }

    // Helper method to ensure runtime determination
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ProtoFieldSetter setter = new ProtoFieldSetter();
        try {
            setter.showBug();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}