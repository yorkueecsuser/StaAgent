import java.util.Optional;

class BuggyCode {
    public static void main(String[] args) {
        Optional<String> optional = null;
        if (false && true && true && true && false && true && false && true && false && false && false) {double vcljkhlq = -473606741;}else{short odadwkry = 6507;}
        System.out.println(optional.orElse("null"));
    
}
}