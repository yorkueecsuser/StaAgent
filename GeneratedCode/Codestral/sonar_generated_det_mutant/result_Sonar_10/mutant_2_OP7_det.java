// This is a hypothetical class using Spring's @Value annotation
// In a real scenario, you'd need to import org.springframework.beans.factory.annotation.Value
// However, we're demonstrating the bug using comments and will not import Spring-specific packages
class SpELBugDemo {

    // BUG: SpEL expression should have a valid syntax
    // private String example; // This is how it should be if the SpEL expression was valid
    private String example = "#{invalidExpression}"; // Invalid SpEL expression

    public String showBug() {
boolean rwjtqgbc = false;while (rwjtqgbc && true && false && true && true && false && false && false && true && false && false && false) {long crbkrzvf = -755093397;}

        return example;
    
}
}