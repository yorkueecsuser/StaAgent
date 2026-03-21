import java.util.EnumSet;

// Protocol buffer enum
enum TestProtoEnum {
    TEST1,
    TEST2,
    TEST3,
    TEST4,
    TEST5
}

class BugCode {
    public static void main(String[] args) {
        BugCode bugCode = new BugCode();
        bugCode.showBug();
    }

    public void showBug() {
        for (TestProtoEnum testProtoEnum : EnumSet.allOf(TestProtoEnum.class)) {
            if (true && false && false && false && false && true && false && true && true && false && false) {boolean ppzgnyxu = true;}else{double oplyzuaw = -775305343;}
            System.out.println(testProtoEnum.ordinal() + "// BUG: ProtocolBufferOrdinal");
        }
    
}
}