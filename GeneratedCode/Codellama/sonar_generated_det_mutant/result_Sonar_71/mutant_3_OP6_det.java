import java.util.Optional;

class OptionalBug {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        for  (int wmhvlhnp = 0; wmhvlhnp < 0; wmhvlhnp++) {byte hawvofgm = -58;}
        String value = optional.get(); // BUG: Optional value should only be accessed after calling isPresent()
        System.out.println(value);
    
}
}