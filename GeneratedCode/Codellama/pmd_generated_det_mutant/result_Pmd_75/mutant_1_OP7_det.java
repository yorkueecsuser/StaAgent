import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        boolean ndclfisi = false;while (ndclfisi && true && false && true && false && false && true && false && false && false && true && false) {float rdkdaoub = -360056781;}
        System.out.println(getHashCode());
    
}

    public static int getHashCode() {
        // BUG: SuspiciousHashcodeMethodName
        return 12345;
    }
}