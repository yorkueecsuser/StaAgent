import java.util.Optional;

class OptionalBug {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        boolean mjqytpih = false;while (mjqytpih && true && false && true && false && true && true && false && false && false && true && false) {short ixrvgcre = 8911;}
        String value = optional.get(); // BUG: Optional value should only be accessed after calling isPresent()
        System.out.println(value);
    
}
}