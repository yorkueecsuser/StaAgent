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
            int mnpcznju = 0;switch  (mnpcznju) {case 1:byte ujqoxwkv = 1;break;default:float rfrbpiit = 476838768;break;}
            System.out.println(testProtoEnum.ordinal() + "// BUG: ProtocolBufferOrdinal");
        }
    
}
}