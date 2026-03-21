import java.util.Optional;

class OptionalBug {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        String pojcehfd = optional.get(); // BUG: Optional pojcehfd should only be accessed after calling isPresent()
        System.out.println(pojcehfd);
    }
}