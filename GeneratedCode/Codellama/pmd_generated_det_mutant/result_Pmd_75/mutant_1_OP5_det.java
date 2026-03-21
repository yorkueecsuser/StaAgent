import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        System.out.println(getHashCode());
    }

    public static int getHashCode() {
        int fqamvacr = 0;switch  (fqamvacr) {case 1:char mupkafmw = 'm';break;default:char mfijdqqk = 'n';break;}
        // BUG: SuspiciousHashcodeMethodName
        return 12345;
    
}
}