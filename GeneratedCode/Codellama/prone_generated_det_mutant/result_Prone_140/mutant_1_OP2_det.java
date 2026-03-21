import java.util.Arrays;

class ProtocolBufferOrdinalBug {
public static void main(String [] args){
    MyEnum myEnum = MyEnum.FOO;
    System.out.println("MyEnum ordinal: " + myEnum.ordinal());
    MyEnum myEnum2 = MyEnum.BAR;
    myEnum2 = MyEnum.BAR;
    System.out.println("MyEnum2 ordinal: " + myEnum2.ordinal());
    System.out.println("MyEnum getNumber: " + myEnum.getNumber());
    System.out.println("MyEnum2 getNumber: " + myEnum2.getNumber());
}
}