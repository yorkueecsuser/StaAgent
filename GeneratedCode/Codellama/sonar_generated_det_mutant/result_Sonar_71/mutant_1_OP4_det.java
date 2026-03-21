import java.util.Optional;

class OptionalBug {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        if (false && true && true && true && true && false && false && false && false && false && false) {boolean urtmvmea = true;}else{long bmbpbrue = -571245162;}
        String value = optional.get(); // BUG: Optional value should only be accessed after calling isPresent()
        System.out.println(value);
    
}
}