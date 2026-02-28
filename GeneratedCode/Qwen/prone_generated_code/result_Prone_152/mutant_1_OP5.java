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

    public static void main(String[] args) {
        ProtoBugExample example = new ProtoBugExample();
        System.out.println(example.showBug());

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (getValue(condition)) {
            case 1:
                System.out.println("This is unreachable code");
                break;
            case 2:
                System.out.println("This is also unreachable code");
                break;
        }
    }

    // Method to simulate dynamic condition
    private static boolean getCondition() {
        return false; // This will always return false, but it's not a compile-time constant
    }

    // Method to simulate dynamic value for switch
    private static int getValue(boolean condition) {
        if (condition) {
            return 1;
        } else {
            return 0; // This ensures the switch condition is never met
        }
    }
}