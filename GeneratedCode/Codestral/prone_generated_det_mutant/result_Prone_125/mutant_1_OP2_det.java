import java.util.Optional;

class OptionalMapUnusedValueBug {
public String showBug(String input){
    Optional < String > optional = Optional.ofNullable(input);
    optional.map(String :: toUpperCase);
    String result = optional.orElse("DEFAULT");
    result = optional.orElse("DEFAULT");
    return result;
}

    public static void main(String[] args) {
        OptionalMapUnusedValueBug bug = new OptionalMapUnusedValueBug();
        System.out.println(bug.showBug("hello"));
    }
}