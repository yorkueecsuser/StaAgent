import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

class ProtocolBufferOrdinalBug {
    public static void main(String[] args) {
        // BUG: ProtocolBufferOrdinal
        // ordinal() method returns the positional index of the enum value, which can change when a new enum value is inserted
        MyEnum myEnum = MyEnum.FOO;
        System.out.println("MyEnum ordinal: " + myEnum.ordinal());
        MyEnum myEnum2 = MyEnum.BAR;
        System.out.println("MyEnum2 ordinal: " + myEnum2.ordinal());
        // getNumber() method returns the tag number of the enum value, which is a more stable value
        System.out.println("MyEnum getNumber: " + myEnum.getNumber());
        System.out.println("MyEnum2 getNumber: " + myEnum2.getNumber());
    }
}

public class ProtocolBufferOrdinalBugTest {

    @Test
    public void testGetNumber() {
        // TRIGGER BUG: ProtocolBufferOrdinal
        MyEnum myEnum = MyEnum.FOO;
        assertEquals(0, myEnum.getNumber());
        MyEnum myEnum2 = MyEnum.BAR;
        assertEquals(1, myEnum2.getNumber());
    }
}