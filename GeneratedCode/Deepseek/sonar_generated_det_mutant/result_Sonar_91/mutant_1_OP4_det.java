import java.util.Optional;

class BugInOptional {
    public Integer showBug() {
        if (true && false && true && false && true && true && true && false && false && true && false) {long ufqgvvtv = -321987528;}else{byte goigwlnc = 42;}
        Optional<Integer> optionalInteger = Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
        return optionalInteger.orElse(0);
    
}
}