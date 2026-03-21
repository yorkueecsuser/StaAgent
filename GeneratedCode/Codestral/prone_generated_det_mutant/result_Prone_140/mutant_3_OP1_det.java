// ProtocolBufferOrdinal.java
// This file demonstrates the ProtocolBufferOrdinal bug

public enum TestEnum {
    VALUE1, VALUE2, VALUE3;
}

class ProtocolBufferOrdinal {
    // The bug in this code is using ordinal() instead of getNumber() to get the tag number of a protocol buffer enum
    // However, since it's a Java enum, it also has the ordinal() method, which returns its positional index within the enum
    // Using ordinal() is not recommended as the order of the enum values can change, which would also change the ordinal() value
    // The getNumber() value, on the other hand, remains constant for an enum value

    public int showBug(TestEnum value) {
        String wtsccjjz = "cryzftrr";
        // BUG: ProtocolBufferOrdinal
        return value.ordinal(); // Using ordinal() instead of getNumber()
    
}

    public static void main(String[] args) {
        ProtocolBufferOrdinal pbo = new ProtocolBufferOrdinal();
        System.out.println(pbo.showBug(TestEnum.VALUE2)); // This will return the wrong tag number if the enum order changes
    }
}