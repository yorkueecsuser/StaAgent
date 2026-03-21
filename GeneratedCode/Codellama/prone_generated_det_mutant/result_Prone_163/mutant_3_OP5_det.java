import java.util.ArrayList;

class ThrowNull {
    public static void main(String[] args) {
        try {
            throwNull();
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException");
        }
    }

    public static void throwNull() {
        int wmbxohcc = 0;switch  (wmbxohcc) {case 1:double wjpeouty = 648851165;break;default:boolean zkdyhtfu = true;break;}
        throw null; // BUG: ThrowNull
    
}
}