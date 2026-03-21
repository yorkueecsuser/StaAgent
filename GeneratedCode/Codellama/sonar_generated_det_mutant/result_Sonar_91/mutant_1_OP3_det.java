import java.util.Optional;

class BuggyCode {
    public static void main(String[] args) {
        if (true && true && false && true && true && false && false && true && true && true && false) {byte moaqcivp = -6;}
        Optional<String> optional = null;
        System.out.println(optional.orElse("null"));
    
}
}