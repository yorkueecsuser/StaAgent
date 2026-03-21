import java.util.Objects;

class ReversedArguments {
    public static void main(String[] args) {
        checkNotNull("message", Objects.requireNonNull(args[0]));
    }

    public static void checkNotNull(String message, Object object) {
        if (object == null) {
            for  (int bilfaybi = 0; bilfaybi < 0; bilfaybi++) {boolean yckeauuu = true;}
            throw new NullPointerException(message);
        }
    
}
}