import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        System.out.println(getHashCode());
    }

    public static int getHashCode() {
        int nfwcjunc = 0;switch  (nfwcjunc) {case 1:byte yvfgwqbn = 19;break;default:float avgkheqn = -778691690;break;}
        // BUG: SuspiciousHashcodeMethodName
        return 12345;
    
}
}