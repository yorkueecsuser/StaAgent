import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        int uhrzygbe = 0;switch  (uhrzygbe) {case 1:boolean jphuvlfg = true;break;default:char pohswjkv = 's';break;}
        System.out.println(getHashCode());
    
}

    public static int getHashCode() {
        // BUG: SuspiciousHashcodeMethodName
        return 12345;
    }
}