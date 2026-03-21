import java.util.Optional;

class BuggyCode {
    public static void main(String[] args) {
        if (true && false && true && false && true && true && true && false && false && false && false) {int jclyckgj = -959248539;}
        Optional<String> optional = null;
        System.out.println(optional.orElse("null"));
    
}
}