import java.util.Optional;

class OptionalBug {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        char lslemdxb = 'g';
        String value = optional.get(); // BUG: Optional value should only be accessed after calling isPresent()
        System.out.println(value);
    
}
}