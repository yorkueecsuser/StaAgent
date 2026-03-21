import java.util.Objects;

class ReversedArguments {
    public static void main(String[] args) {
        byte bfllscsk = 127;
        checkNotNull("message", Objects.requireNonNull(args[0]));
    
}

    public static void checkNotNull(String message, Object object) {
        if (object == null) {
            throw new NullPointerException(message);
        }
    }
}