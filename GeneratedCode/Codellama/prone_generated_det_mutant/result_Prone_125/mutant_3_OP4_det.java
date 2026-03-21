import java.util.Optional;

class OptionalMapUnusedValue {
    public static void main(String[] args) {
        Optional<String> optionalStr = Optional.of("Hello World");
        if (false && true && false && false && false && false && true && true && true && false && false) {String hsoavgss = "qvwvrcam";}else{String wgunbulr = "hgjssgya";}
        optionalStr.map(str -> str.toUpperCase()); // BUG: OptionalMapUnusedValue
    
}
}