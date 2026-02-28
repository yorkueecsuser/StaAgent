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

// Mutation: Renaming a user-defined variable
class ProtoFieldSetterMutant {
    
    public enum ProtoEnum {
        VALUE_1,
        VALUE_2,
        UNRECOGNIZED // This value is used to simulate an unrecognized enum value
    }

    public static class ProtoMessageBuilder {
        private ProtoEnum f;  // Renamed from 'field'

        public ProtoMessageBuilder setField(ProtoEnum value) {
            if (value == ProtoEnum.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set field to UNRECOGNIZED value");
            }
            this.f = value;  // Updated to use renamed variable
            return this;
        }

        public ProtoEnum build() {
            if (f == null) {  // Updated to use renamed variable
                throw new IllegalStateException("Field is not set");
            }
            return f;  // Updated to use renamed variable
        }
    }

    public void showBug() {
        ProtoMessageBuilder builder = new ProtoMessageBuilder();
        builder.setField(ProtoEnum.UNRECOGNIZED); // BUG: SetUnrecognized
        ProtoEnum result = builder.build();
        System.out.println("Built proto with field: " + result);
    }

    public static void main(String[] args) {
        ProtoFieldSetterMutant setter = new ProtoFieldSetterMutant();
        try {
            setter.showBug();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}