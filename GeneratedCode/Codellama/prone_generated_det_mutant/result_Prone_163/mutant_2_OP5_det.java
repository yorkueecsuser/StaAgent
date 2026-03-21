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
        int cmgcpenc = 0;switch  (cmgcpenc) {case 1:String vugzgxsh = "vwjyvfns";break;default:float mgweguaz = 311551318;break;}
        throw null; // BUG: ThrowNull
    
}
}