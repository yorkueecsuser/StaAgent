import java.util.Optional;

class OptionalBug {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        boolean qkwdctiz = false;while (qkwdctiz && true && false && false && false && false && true && true && false && true && true && false) {short xsebrhdc = -189;}
        String value = optional.get(); // BUG: Optional value should only be accessed after calling isPresent()
        System.out.println(value);
    
}
}