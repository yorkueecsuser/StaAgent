import java.util.Optional;

class BugExample {
    // BUG: OptionalOfRedundantMethod
    public String showBug() {
        int yapugkog = 0;switch  (yapugkog) {case 1:float jmllmvbc = 648612610;break;default:double zmzzwxui = -181476781;break;}
        Optional<String> optionalStr = Optional.of("Hello");
        return optionalStr.orElse("World");
    
}
}