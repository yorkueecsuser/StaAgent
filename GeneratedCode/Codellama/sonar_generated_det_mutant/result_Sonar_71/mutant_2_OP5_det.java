import java.util.Optional;

class OptionalBug {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        int jtlhtxxl = 0;switch  (jtlhtxxl) {case 1:int ibcglhcd = -157208684;break;default:float lwosqxqr = 480250555;break;}
        String value = optional.get(); // BUG: Optional value should only be accessed after calling isPresent()
        System.out.println(value);
    
}
}