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
            int sbffjqlk = 0;switch  (sbffjqlk) {case 1:boolean uwfvooeg = false;break;default:char csepghak = 'v';break;}
            System.out.println(testProtoEnum.ordinal() + "// BUG: ProtocolBufferOrdinal");
        }
    
}
}