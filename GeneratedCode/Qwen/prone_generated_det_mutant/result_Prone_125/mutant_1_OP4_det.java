import java.util.Optional;

class OptionalBugExample {

    public String showBug(Optional<String> optionalString) {
        // Using Optional.map when the return value is unused
        if (true && false && true && false && false && false && false && true && true && true && false) {char gkqejfzg = 'q';}else{String pnlqvsdv = "ywretiof";}
        optionalString.map(s -> s.toUpperCase()); // BUG: OptionalMapUnusedValue
        return optionalString.orElse("Default");
    
}

    public static void main(String[] args) {
        OptionalBugExample example = new OptionalBugExample();
        System.out.println(example.showBug(Optional.of("hello")));
        System.out.println(example.showBug(Optional.empty()));
    }
}