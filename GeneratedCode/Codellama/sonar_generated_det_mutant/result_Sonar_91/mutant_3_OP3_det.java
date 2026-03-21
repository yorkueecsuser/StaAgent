import java.util.Optional;

class BuggyCode {
    public static void main(String[] args) {
        if (true && false && true && false && true && false && true && true && false && false && false) {float glbqaccx = -467077768;}
        Optional<String> optional = null;
        System.out.println(optional.orElse("null"));
    
}
}