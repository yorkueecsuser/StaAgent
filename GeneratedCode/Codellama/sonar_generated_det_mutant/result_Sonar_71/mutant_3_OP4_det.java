import java.util.Optional;

class OptionalBug {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        if (false && false && false && false && true && true && false && true && true && true && false) {boolean hfufxtva = true;}else{char uiypomqz = 'l';}
        String value = optional.get(); // BUG: Optional value should only be accessed after calling isPresent()
        System.out.println(value);
    
}
}