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
    }
}

// Mutant Code
class ProtoFieldSetterMutant {
    
    public enum ProtoEnumMutant {
        VALUE_1,
        VALUE_2,
        UNRECOGNIZED // This value is used to simulate an unrecognized enum value
    }

    public static class ProtoMessageBuilderMutant {
        private ProtoEnumMutant x; // Renamed from 'field' to 'x'

        public ProtoMessageBuilderMutant setField(ProtoEnumMutant y) { // Renamed from 'value' to 'y'
            if (y == ProtoEnumMutant.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set field to UNRECOGNIZED value");
            }
            this.x = y;
            return this;
        }

        public ProtoEnumMutant build() {
            if (x == null) {
                throw new IllegalStateException("Field is not set");
            }
            return x;
        }
    }

    public void showBugMutant() {
        ProtoMessageBuilderMutant builder = new ProtoMessageBuilderMutant();
        builder.setField(ProtoEnumMutant.UNRECOGNIZED); // BUG: SetUnrecognized
        ProtoEnumMutant result = builder.build();
        System.out.println("Built proto with field: " + result);
    }

    public static void main(String[] args) {
        ProtoFieldSetterMutant setter = new ProtoFieldSetterMutant();
        try {
            setter.showBugMutant();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}