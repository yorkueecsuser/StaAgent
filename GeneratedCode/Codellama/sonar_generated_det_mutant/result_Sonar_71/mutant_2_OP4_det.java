import java.util.Optional;

class OptionalBug {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        if (true && true && false && false && true && true && true && false && false && false && false) {long edqmfgza = 823464181;}else{boolean moynvate = false;}
        String value = optional.get(); // BUG: Optional value should only be accessed after calling isPresent()
        System.out.println(value);
    
}
}