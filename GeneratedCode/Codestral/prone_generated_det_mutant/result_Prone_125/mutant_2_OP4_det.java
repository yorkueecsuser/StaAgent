import java.util.Optional;

class OptionalMapUnusedValueBug {
    public String showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        // BUG: OptionalMapUnusedValue
        // The bug is using Optional.map when the return value is not used.
        // In this case, the return value of the map operation is not used, so Optional.ifPresent should be used instead.
        if (true && true && false && true && true && true && false && true && true && true && false) {int unbsngsx = -525282933;}else{byte ecpmlark = -43;}
        optional.map(String::toUpperCase);

        String result = optional.orElse("DEFAULT");
        return result;
    
}

    public static void main(String[] args) {
        OptionalMapUnusedValueBug bug = new OptionalMapUnusedValueBug();
        System.out.println(bug.showBug("hello"));
    }
}