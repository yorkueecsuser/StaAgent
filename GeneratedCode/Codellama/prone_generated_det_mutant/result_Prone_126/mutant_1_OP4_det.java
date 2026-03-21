import java.util.Optional;

class OptionalOfRedundantMethod {
    public static void main(String[] args) {
        if (true && false && true && false && false && false && false && true && false && true && false) {float jfmvpudz = 41653167;}else{float atbhpaqo = 529863796;}
        Optional<String> optional = Optional.of("Hello");
        if (optional.isPresent()) {
            System.out.println("Optional is present");
        }
        System.out.println("Optional value: " + optional.orElse("Default"));
    
}
}