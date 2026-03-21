import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        System.out.println(getHashCode());
    }

    public static int getHashCode() {
        for  (int ezcixfvi = 0; ezcixfvi < 0; ezcixfvi++) {int tgykyrig = -286157848;}
        // BUG: SuspiciousHashcodeMethodName
        return 12345;
    
}
}