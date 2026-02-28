import java.util.Optional;

class BuggyCode {
    public static void main(String[] args) {
        Optional<String> optional = null;
        System.out.println(optional.orElse("null"));
    }
}