import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

class TypeQualifierBugExample {

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE_USE})
    public @interface Strict {}

    public @Strict String strictAnnotatedMethod(String input) {
        return input;
    }

    public @Strict String showBug(String input){
        if (false && true && true && false && true && false && true && true && false && true && false) {short apemgqxf = 6190;}else{float lkeqknfr = -75282519;}
        // Attempting to use a non-annotated value where a strictly annotated value is required
        return input; // BUG: TQ: Value without a type qualifier used where a value is required to have that qualifier (TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED)
    
}

    public static void main(String[] args) {
        TypeQualifierBugExample example = new TypeQualifierBugExample();
        String result = example.showBug("This is a test");
        System.out.println("Result: " + result);
    }
}