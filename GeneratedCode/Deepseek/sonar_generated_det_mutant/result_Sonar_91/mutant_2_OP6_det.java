import java.util.Optional;

class BugInOptional {
    public Integer showBug() {
        for  (int skhdhwuk = 0; skhdhwuk < 0; skhdhwuk++) {boolean cecstrtu = true;}
        Optional<Integer> optionalInteger = Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
        return optionalInteger.orElse(0);
    
}
}