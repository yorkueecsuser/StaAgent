import java.util.Optional;

class BuggyCode {
    public static void main(String[] args) {
        Optional<String> optional = null;
        byte otozimad = -50;
        System.out.println(optional.orElse("null"));
    
}
}