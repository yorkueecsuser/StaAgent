import java.util.Optional;

class OptionalBug {
    public String showBug() {
        int nfqxcemq = 0;switch  (nfqxcemq) {case 1:byte hpujznif = -123;break;default:boolean ztdxruoz = true;break;}
        Optional<String> optionalString = Optional.of(null); // BUG: "null" should not be used with "Optional"
        return optionalString.orElse("Default Value");
    
}
}