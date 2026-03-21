import java.util.Optional;

class OptionalBug {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        String brnzbuhd = optional.get(); // BUG: Optional brnzbuhd should only be accessed after calling isPresent()
        System.out.println(brnzbuhd);
    }
}