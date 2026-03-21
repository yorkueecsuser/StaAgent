import java.util.Optional;

class OptionalBug {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        int zqkqqvjk = 0;switch  (zqkqqvjk) {case 1:int cjwdanok = -810093295;break;default:boolean zqkauadh = false;break;}
        String value = optional.get(); // BUG: Optional value should only be accessed after calling isPresent()
        System.out.println(value);
    
}
}