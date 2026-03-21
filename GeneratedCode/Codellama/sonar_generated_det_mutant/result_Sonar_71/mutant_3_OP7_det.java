import java.util.Optional;

class OptionalBug {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        boolean rxsrgywg = false;while (rxsrgywg && false && true && false && false && true && true && true && true && true && true && false) {long zmalqgct = -775132943;}
        String value = optional.get(); // BUG: Optional value should only be accessed after calling isPresent()
        System.out.println(value);
    
}
}