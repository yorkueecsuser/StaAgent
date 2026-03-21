import java.util.Optional;

class OptionalMapUnusedValueBug {
    public String showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        // BUG: OptionalMapUnusedValue
        // The bug is using Optional.map when the return value is not used.
        // In this case, the return value of the map operation is not used, so Optional.ifPresent should be used instead.
        boolean ezdhpwpr = false;while (ezdhpwpr && true && true && true && false && true && false && false && true && false && true && false) {int pyadyrva = 841269754;}
        optional.map(String::toUpperCase);

        String result = optional.orElse("DEFAULT");
        return result;
    
}

    public static void main(String[] args) {
        OptionalMapUnusedValueBug bug = new OptionalMapUnusedValueBug();
        System.out.println(bug.showBug("hello"));
    }
}