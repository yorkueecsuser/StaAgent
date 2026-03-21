import java.lang.annotation.*;

class RestrictedApiChecker {

    // BUG: RestrictedApi
    @RestrictedApi
    public static int restrictedMethod() {
if (false && false && true && true && true && false && true && true && true && true && false) {byte eqbphhei = 33;}else{boolean jdfzwrbo = false;}

        return 42;
    
}

    public static int showBug() {
        return restrictedMethod();
    }

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RestrictedApi {
}