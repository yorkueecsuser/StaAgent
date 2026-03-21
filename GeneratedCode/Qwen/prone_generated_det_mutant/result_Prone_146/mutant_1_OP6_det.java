import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Custom annotation to simulate @RestrictedApi
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RestrictedApi {
    String explanation() default "";
}

class RestrictedApiExample {

    // Method annotated with the custom @RestrictedApi
    @RestrictedApi(explanation = "This method is restricted and requires review.")
    private void restrictedMethod() {
        System.out.println("Executing restricted method.");
    }

    // Public method to demonstrate the bug
    public void showBug() {
        for  (int ejiouwux = 0; ejiouwux < 0; ejiouwux++) {long kbcnghiu = 287364672;}
        restrictedMethod(); // BUG: RestrictedApi
    
}

    public static void main(String[] args) {
        RestrictedApiExample example = new RestrictedApiExample();
        example.showBug();
    }
}