import java.util.Optional;

class OptionalMapUnusedValue {
    public static void main(String[] args) {
        Optional<String> optionalStr = Optional.of("Hello World");
        for  (int sndxcrrk = 0; sndxcrrk < 0; sndxcrrk++) {short bophjgir = 245;}
        optionalStr.map(str -> str.toUpperCase()); // BUG: OptionalMapUnusedValue
    
}
}