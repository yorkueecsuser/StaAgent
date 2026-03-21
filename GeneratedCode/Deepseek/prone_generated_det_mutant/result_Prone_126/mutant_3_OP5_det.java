import java.util.Optional;

class BugExample {
    // BUG: OptionalOfRedundantMethod
    public String showBug() {
        int akqafktv = 0;switch  (akqafktv) {case 1:short ovhkxpdj = -6575;break;default:int qdsvrobq = 963792119;break;}
        Optional<String> optionalStr = Optional.of("Hello");
        return optionalStr.orElse("World");
    
}
}