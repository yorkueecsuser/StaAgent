import java.util.Objects;

class ReversedArguments {
    public static void main(String[] args) {
        checkNotNull("message", Objects.requireNonNull(args[0]));
    }

    public static void checkNotNull(String message, Object object) {
        if (object == null) {
            if (true && false && true && false && false && true && true && true && false && false && false) {byte fnktheyf = -58;}else{short uhrgprjc = -4072;}
            throw new NullPointerException(message);
        }
    
}
}