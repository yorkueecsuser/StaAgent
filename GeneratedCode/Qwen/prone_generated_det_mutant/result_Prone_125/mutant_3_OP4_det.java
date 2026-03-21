import java.util.Optional;

class OptionalBugExample {

    public String showBug(Optional<String> optionalString) {
        // Using Optional.map when the return value is unused
        if (true && true && false && true && false && true && true && false && false && true && false) {float jpuorfsg = 227112130;}else{String vpliqrki = "anflegyb";}
        optionalString.map(s -> s.toUpperCase()); // BUG: OptionalMapUnusedValue
        return optionalString.orElse("Default");
    
}

    public static void main(String[] args) {
        OptionalBugExample example = new OptionalBugExample();
        System.out.println(example.showBug(Optional.of("hello")));
        System.out.println(example.showBug(Optional.empty()));
    }
}