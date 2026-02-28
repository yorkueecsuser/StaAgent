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
        ProtoEnum result = builder.build();
        System.out.println("Built proto with field: " + result);
    }

    public static void main(String[] args) {
        ProtoFieldSetter setter = new ProtoFieldSetter();
        try {
            setter.showBug();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        // Unreachable switch statement mutation
        int unreachableSwitchValue = getUnreachableSwitchValue(); // Ensures condition is runtime evaluated
        switch (unreachableSwitchValue) {
            case 0:
                System.out.println("This case is unreachable");
                break;
            default:
                // Default case to ensure no compile-time errors
                break;
        }
    }
    
    private static int getUnreachableSwitchValue() {
        return 1; // Always returns 1, making the switch case "0" unreachable
    }
}