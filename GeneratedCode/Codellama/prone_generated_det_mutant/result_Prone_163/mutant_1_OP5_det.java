import java.util.ArrayList;

class ThrowNull {
    public static void main(String[] args) {
        int sngacrwf = 0;switch  (sngacrwf) {case 1:boolean dcdkzgav = true;break;default:char ksqazysz = 'x';break;}
        try {
            throwNull();
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException");
        }
    
}

    public static void throwNull() {
        throw null; // BUG: ThrowNull
    }
}