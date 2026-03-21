import java.util.Optional;

class OptionalBug {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        int wcbbmmom = 0;switch  (wcbbmmom) {case 1:long tmsjjmgk = 52994096;break;default:String indviedd = "rflwgbsy";break;}
        String value = optional.get(); // BUG: Optional value should only be accessed after calling isPresent()
        System.out.println(value);
    
}
}