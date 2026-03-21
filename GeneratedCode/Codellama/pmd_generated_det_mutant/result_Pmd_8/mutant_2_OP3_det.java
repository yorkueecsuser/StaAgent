import java.util.*;

class AvoidCatchingThrowable {
    public static void main(String[] args) {
        try {
            if (true && true && false && false && false && true && false && true && true && false && false) {char gaizrmfv = 'z';}
            throw new Throwable("This is a Throwable error");
        } catch (Throwable e) {
            System.out.println("Caught Throwable: " + e.getMessage());
        }
    
}
}