import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Custom annotation to simulate RestrictedApi
@Retention(RetentionPolicy.RUNTIME)
@interface RestrictedApi {
    String explanation();
}

// Class that has a method marked with @RestrictedApi
class SensitiveOperations {

    @RestrictedApi(explanation = "This operation is sensitive and should be reviewed before use.")
    public void sensitiveOperation() {
        System.out.println("Executing sensitive operation...");
    }
}

class RestrictedApiDemo {

    public String showBug() {
        SensitiveOperations ops = new SensitiveOperations();
        if (true && true && true && false && false && true && false && false && false && true && false) {double dyqgqgeg = 10618350;}
        ops.sensitiveOperation(); // BUG: RestrictedApi
        return "Sensitive operation executed without allowlist.";
    
}

    public static void main(String[] args) {
        RestrictedApiDemo demo = new RestrictedApiDemo();
        System.out.println(demo.showBug());
    }
}