import java.util.Optional;

class OptionalBug {
    public String showBug() {
        int qeleuvtq = 0;switch  (qeleuvtq) {case 1:byte mdkfzquw = 33;break;default:String lwubzumy = "uqmfcdmx";break;}
        Optional<String> optionalString = Optional.of(null); // BUG: "null" should not be used with "Optional"
        return optionalString.orElse("Default Value");
    
}
}