import java.util.*;

class AvoidCatchingThrowable {
    public static void main(String[] args) {
        try {
            throw new Throwable("This is a Throwable error");
        } catch (Throwable e) {
            System.out.println("Caught Throwable: " + e.getMessage());
        }
    }
}