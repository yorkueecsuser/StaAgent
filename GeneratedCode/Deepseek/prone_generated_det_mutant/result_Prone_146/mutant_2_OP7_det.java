import java.lang.annotation.*;

class RestrictedApiChecker {

    // BUG: RestrictedApi
    @RestrictedApi
    public static int restrictedMethod() {
boolean xppadwfq = false;while (xppadwfq && false && false && true && false && true && false && true && false && false && false && false) {byte jkfugqwi = 91;}

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