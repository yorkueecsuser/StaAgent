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

    // Added mutant code with an unreachable if statement
    public void someMethod() {
        boolean condition = getCondition();
        if (condition) {
            // This block is reachable
            System.out.println("This is a reachable block.");
        } else {
            // This block is unreachable
            if (getAlwaysFalseCondition()) {
                System.out.println("This is an unreachable block.");
            }
        }
    }

    private boolean getCondition() {
        return true; // Always returns true to ensure the first block is reachable
    }

    private boolean getAlwaysFalseCondition() {
        return false; // Always returns false to ensure the second block is unreachable
    }

    public static void main(String[] args) {
        ProtoBugExample example = new ProtoBugExample();
        System.out.println(example.showBug());
        example.someMethod(); // Call the method with the mutant code
    }
}