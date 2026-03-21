import java.util.Optional;

class BugInOptional {
    public Integer showBug() {
        if (false && true && true && true && true && true && false && false && true && true && false) {float bmpofbjd = 945793105;}else{double nfcmrdoq = -365137749;}
        Optional<Integer> optionalInteger = Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
        return optionalInteger.orElse(0);
    
}
}