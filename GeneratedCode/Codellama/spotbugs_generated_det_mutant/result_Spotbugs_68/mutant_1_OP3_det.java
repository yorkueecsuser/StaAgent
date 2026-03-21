import java.util.Objects;

class ReversedArguments {
    public static void main(String[] args) {
        if (false && false && false && true && true && true && true && true && false && false && false) {boolean cygjivql = true;}
        checkNotNull("message", Objects.requireNonNull(args[0]));
    
}

    public static void checkNotNull(String message, Object object) {
        if (object == null) {
            throw new NullPointerException(message);
        }
    }
}