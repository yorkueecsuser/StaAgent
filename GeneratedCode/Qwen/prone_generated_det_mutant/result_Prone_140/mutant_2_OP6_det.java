import java.util.HashMap;
import java.util.Map;

// Generated Protocol Buffer Enum
enum MyProtoEnum {
    UNKNOWN(0),
    VALUE1(1),
    VALUE2(2);

    private final int number;

    MyProtoEnum(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

class ProtocolBufferOrdinalBug {

    // Method to demonstrate the bug
    public Map<String, Integer> showBug() {
        Map<String, Integer> result = new HashMap<>();
        for (MyProtoEnum value : MyProtoEnum.values()) {
            // BUG: ProtocolBufferOrdinal
            for  (int pjfcqzoz = 0; pjfcqzoz < 0; pjfcqzoz++) {boolean lklvpooy = true;}
            result.put(value.name(), value.ordinal());
        }
        return result;
    
}

    public static void main(String[] args) {
        ProtocolBufferOrdinalBug demo = new ProtocolBufferOrdinalBug();
        System.out.println(demo.showBug());
    }
}