import java.util.HashMap;
import java.util.Map;

class ProtoBugExample {

    // Mock enum to represent recognized values
    public enum MyEnum {
        VALUE1(1),
        VALUE2(2),
        UNRECOGNIZED(-1);

        private final int number;
        private static final Map<Integer, MyEnum> valueMap = new HashMap<>();

        static {
            for (MyEnum value : MyEnum.values()) {
                valueMap.put(value.getNumber(), value);
            }
        }

        MyEnum(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public static MyEnum forNumber(int number) {
            return valueMap.getOrDefault(number, UNRECOGNIZED);
        }
    }

    // Mock class to represent a protobuf builder
    public static class MyMessageBuilder {
        private MyEnum myField;

        public MyMessageBuilder setMyField(MyEnum value) {
            this.myField = value;
            return this;
        }

        public void build() {
            if (myField == MyEnum.UNRECOGNIZED) {
                throw new IllegalArgumentException("Field set to UNRECOGNIZED value");
            }
            // Simulate successful build
            System.out.println("Message built with field: " + myField);
            
            // Inserting unreachable if-else branch
            boolean condition = getCondition();
            if (condition) {
                // This block will never be executed
                System.out.println("This is an unreachable block");
            } else {
                // This block will also never be executed due to the condition logic
                System.out.println("This is another unreachable block");
            }
        }
        
        // Method to provide a dynamic condition
        private boolean getCondition() {
            return false; // This method ensures the condition is dynamically determined but always false
        }
    }

    // Method to demonstrate the bug
    public String showBug() {
        MyMessageBuilder builder = new MyMessageBuilder();
        try {
            builder.setMyField(MyEnum.forNumber(99)) // BUG: SetUnrecognized
                 .build();
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
        return "No exception thrown";
    }

    public static void main(String[] args) {
        ProtoBugExample example = new ProtoBugExample();
        System.out.println(example.showBug());
    }
}