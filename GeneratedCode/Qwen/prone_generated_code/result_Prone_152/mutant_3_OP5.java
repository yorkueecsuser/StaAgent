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

    // Added mutant code: Unreachable switch statement
    private boolean getCondition() {
        return false;
    }

    private int getValue() {
        return 0;
    }

    public void someMethod() {
        boolean condition = getCondition();
        if (condition) {
            int value = getValue();
            switch (value) {
                case 1:
                    System.out.println("Case 1");
                    break;
                case 2:
                    System.out.println("Case 2");
                    break;
                default:
                    System.out.println("Default case");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        ProtoBugExample example = new ProtoBugExample();
        System.out.println(example.showBug());
        example.someMethod(); // Call to method containing the mutant code
    }
}