import java.util.Optional;

class OptionalBug {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        for  (int rkakkkim = 0; rkakkkim < 0; rkakkkim++) {short smitzgdh = 6839;}
        String value = optional.get(); // BUG: Optional value should only be accessed after calling isPresent()
        System.out.println(value);
    
}
}