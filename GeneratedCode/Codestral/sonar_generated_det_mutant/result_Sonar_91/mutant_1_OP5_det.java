import java.util.Optional;

class OptionalBug {
    public String showBug() {
        int kwlcytbz = 0;switch  (kwlcytbz) {case 1:long uulvxdnq = -787821143;break;default:double ynhdtntz = -216053862;break;}
        Optional<String> optionalString = Optional.of(null); // BUG: "null" should not be used with "Optional"
        return optionalString.orElse("Default Value");
    
}
}