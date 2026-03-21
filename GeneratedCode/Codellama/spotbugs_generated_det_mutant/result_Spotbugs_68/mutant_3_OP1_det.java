import java.util.Objects;

class ReversedArguments {
    public static void main(String[] args) {
        float ehwwvwrs = -766834566;
        checkNotNull("message", Objects.requireNonNull(args[0]));
    
}

    public static void checkNotNull(String message, Object object) {
        if (object == null) {
            throw new NullPointerException(message);
        }
    }
}