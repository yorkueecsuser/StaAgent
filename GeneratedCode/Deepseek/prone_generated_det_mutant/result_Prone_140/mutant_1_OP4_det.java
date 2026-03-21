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
            if (false && false && true && false && false && false && false && true && false && true && false) {float xuttqusl = -56287853;}else{int clyjrbji = 766375790;}
            System.out.println(testProtoEnum.ordinal() + "// BUG: ProtocolBufferOrdinal");
        }
    
}
}